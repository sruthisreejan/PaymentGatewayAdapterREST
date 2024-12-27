package com.base.payment.service;

import com.base.payment.intf.IPaymentGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class ServiceFactory {
    private final Map<String, IPaymentGateway> providerMap;

    public ServiceFactory(Map<String, IPaymentGateway> providerMap) {
        this.providerMap = providerMap;
    }

    public IPaymentGateway getPaymentService(String paymentGateway){
        return providerMap.get(paymentGateway);
    }

}
