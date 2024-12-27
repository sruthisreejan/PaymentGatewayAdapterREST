package com.base.payment;

import com.base.payment.intf.IPaymentGateway;
import com.base.payment.service.PhonepeService;
import com.base.payment.service.RazorPayService;
import com.base.payment.service.ServiceFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class PaymentGatewaySystemApplicationTests {

	@Test
	public void testGetPaymentService() {
		Map<String, IPaymentGateway> providerMap = Map.of(
				"PhonepeService", new PhonepeService(),
				"RazorPayService", new RazorPayService()
		);
		ServiceFactory serviceFactory = new ServiceFactory(providerMap);

		assertTrue(serviceFactory.getPaymentService("PhonepeService") instanceof PhonepeService);
		assertTrue(serviceFactory.getPaymentService("RazorPayService") instanceof RazorPayService);
	}

}
