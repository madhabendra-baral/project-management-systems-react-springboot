package com.madhab.service;

import com.madhab.domain.PlanType;
import com.madhab.model.Subscription;
import com.madhab.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
