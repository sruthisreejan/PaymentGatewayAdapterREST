package com.base.payment.intf;

public interface IPaymentGateway {

    /**
     * Method to process payment
     *
     * @return String : Message after processing
     */
    public String processPayment();
}
