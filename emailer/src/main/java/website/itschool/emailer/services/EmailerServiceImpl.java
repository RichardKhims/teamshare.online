package website.itschool.emailer.services;

import website.itschool.emailer.servlets.dto.Subscription;

import javax.enterprise.context.ApplicationScoped;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@EmailerServiceQualifier
public class EmailerServiceImpl implements EmailerService {
    private int MAX_SIZE = 100;
    private int PERIOD_MIN = 20;
    private final String filename = "/root/subscriptions.csv";
    private FileWriter fr = new FileWriter(new File(filename),true);

    private final Set<Subscription> subscriptions = new HashSet<Subscription>();

    public EmailerServiceImpl() throws IOException {
    }

    public boolean send(Subscription subscription, Subscription sessionSubscription) throws Exception {

        verify(subscription, sessionSubscription);
        subscriptions.add(subscription);

        //send email
        StringBuilder csvBuilder = new StringBuilder();
        csvBuilder.append(subscription.getCourse()).append(";")
                .append(subscription.getLevel()).append(";")
                .append(subscription.getContact()).append(";")
                .append(subscription.getText().replace('\n',' ')).append("\n");

        appendUsingFileWriter(csvBuilder.toString());

        return false;
    }

    private void verify(final Subscription subscription, Subscription sessionSubscription) throws Exception {
        if (sessionSubscription.getDate().plusMinutes(PERIOD_MIN).isBefore(LocalDateTime.now())) {
            throw new Exception("Not so fast. Try in 20 minutes later");
        }

        synchronized (subscriptions) {
            if (subscriptions.contains(subscription)) {
                Subscription orig = subscriptions.stream()
                        .filter(o -> o.hashCode() == subscription.hashCode())
                        .findFirst().orElse(null);
                if (orig.getDate().plusMinutes(PERIOD_MIN).isAfter(subscription.getDate())) {
                    throw new Exception("Already contains. Try in 20 minutes later");
                }
            }

            if (subscriptions.size() > MAX_SIZE) {
                subscriptions.clear();
            }
        }
    }

    private synchronized void appendUsingFileWriter(String text) {
        try {
            fr.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
