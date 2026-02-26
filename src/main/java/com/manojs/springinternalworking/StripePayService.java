package com.manojs.springinternalworking;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class StripePayService implements PaymentService {
    @Override
    public String pay() {
        String payment = "Stripe";
        System.out.println("Payment From: "+payment);
        return payment;
    }
}
