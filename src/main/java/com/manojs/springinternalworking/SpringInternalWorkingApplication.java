package com.manojs.springinternalworking;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor //constructor injection
@SpringBootApplication
public class SpringInternalWorkingApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringInternalWorkingApplication.class, args);
    }

//    RazorPayService payService = new RazorPayService();

//    @Autowired //field injection
//    private PaymentService PayService;

    private final PaymentService PayService; // constructor injection with final due to (lombok)
    @Override
    public void run(final String... args) throws Exception {
        String pay = PayService.pay();
        System.out.println("Payment Done:"+ pay);
    }
}
