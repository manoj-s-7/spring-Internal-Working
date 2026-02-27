package com.manojs.springinternalworking;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider",havingValue = "Razorpay")
public class RazorPayService implements PaymentService {
    public String pay(){
        String payment = "RazorPay";
        System.out.println("Payment From: "+payment);
        return payment;
    }
}
