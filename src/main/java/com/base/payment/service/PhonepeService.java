package com.base.payment.service;

import com.base.payment.intf.IPaymentGateway;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service(PhonepeService.BEAN_ID)
public class PhonepeService implements IPaymentGateway {

    public static final String BEAN_ID = "PhonepeService";

    private static final Logger log = LoggerFactory.getLogger(PhonepeService.class);

    @Override
    public void processPayment() {
        log.info("Processed payment via Phonepe");
    }
}
