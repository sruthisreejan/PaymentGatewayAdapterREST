package com.base.payment.service;

import com.base.payment.intf.IPaymentGateway;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    ServiceFactory serviceFactory;



    @Value("${payment.gateway}")
    private String gateway;
    public String processPayment(){
        IPaymentGateway gatewayService = serviceFactory.getPaymentService(gateway);
        return gatewayService.processPayment();
    }
}
