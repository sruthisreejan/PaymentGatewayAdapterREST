package com.base.payment.service;

import com.base.payment.intf.IPaymentGateway;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service(RazorPayService.BEAN_ID)
public class RazorPayService implements IPaymentGateway {
    public static final String BEAN_ID = "RazorPayService";

    private static final Logger log = LoggerFactory.getLogger(RazorPayService.class);

    @Override
    public void processPayment() {
        log.info("Processed payment via RazorPay");
    }
}
