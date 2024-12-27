package com.base.payment.controller;

import com.base.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("payment")
    public void processPayment(){
        paymentService.processPayment();
    }
}
