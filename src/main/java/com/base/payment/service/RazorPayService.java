package com.base.payment.service;

import com.base.payment.intf.IPaymentGateway;
import org.springframework.stereotype.Service;

@Service(RazorPayService.BEAN_ID)
public class RazorPayService implements IPaymentGateway {
    public static final String BEAN_ID = "RazorPayService";
    @Override
    public String processPayment() {
        return "Processed payment via RazorPay";
    }
}
