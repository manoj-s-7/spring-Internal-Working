package com.manojs.springinternalworking;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider",havingValue = "stripe")
public class StripePayService implements PaymentService {
    @Override
    public String pay() {
        String payment = "Stripe";
        System.out.println("Payment From: "+payment);
        return payment;
    }
}
