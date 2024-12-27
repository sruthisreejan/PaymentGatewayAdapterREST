package com.base.payment.controller;

import com.base.payment.service.PaymentService;
import com.base.payment.service.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("payment")
    public String processPayment(){
        return paymentService.processPayment();
    }
}
