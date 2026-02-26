package com.manojs.springinternalworking;

import org.springframework.stereotype.Component;

@Component
public class RazorPayService implements PaymentService {
    public String pay(){
        String payment = "RazorPay";
        System.out.println("Payment From: "+payment);
        return payment;
    }
}
