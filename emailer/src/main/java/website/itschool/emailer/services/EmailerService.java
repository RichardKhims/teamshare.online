package website.itschool.emailer.services;

import website.itschool.emailer.servlets.dto.Subscription;

public interface EmailerService {
    boolean send(Subscription subscription, Subscription sessionSubscription) throws Exception;
}
