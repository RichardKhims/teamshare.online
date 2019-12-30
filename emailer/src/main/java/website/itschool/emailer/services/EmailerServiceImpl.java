package website.itschool.emailer.services;

import website.itschool.emailer.servlets.dto.Subscription;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@EmailerServiceQualifier
public class EmailerServiceImpl implements EmailerService {
    private int MAX_SIZE = 100;
    private int PERIOD_MIN = 20;

    private final Set<Subscription> subscriptions = new HashSet<Subscription>();

    public boolean send(Subscription subscription, Subscription sessionSubscription) throws Exception {

        verify(subscription, sessionSubscription);
        subscriptions.add(subscription);

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
}
