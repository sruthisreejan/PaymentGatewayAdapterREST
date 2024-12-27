package com.base.payment.service;

import com.base.payment.intf.IPaymentGateway;
import org.springframework.stereotype.Service;

@Service(PhonepeService.BEAN_ID)
public class PhonepeService implements IPaymentGateway {

    public static final String BEAN_ID = "PhonepeService";
    @Override
    public String processPayment() {
        return "Processed payment via Phonepe";
    }
}
