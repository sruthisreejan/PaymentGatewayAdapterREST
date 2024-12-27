package com.base.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.base")
public class PaymentGatewaySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentGatewaySystemApplication.class, args);
	}

}
