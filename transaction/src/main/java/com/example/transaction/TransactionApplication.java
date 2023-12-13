package com.example.transaction;

import com.example.transaction.model.Order;
import com.example.transaction.model.Payment;
import com.example.transaction.service.OrderService;
import com.example.transaction.service.PaymentService;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
	}

	@Bean
	CommandLineRunner transactionRunner(
			OrderService orderService,
			PaymentService paymentService
	) throws FileNotFoundException {
		Payment payment = Payment.builder()
				.userId(1)
				.orderId(2)
				.price(BigDecimal.valueOf(23))
				.build();


		Order order = Order.builder()
				.productCode("sku1")
				.amount(3)
				.unitPrice(BigDecimal.valueOf(23.1))
				.userId(23)
				.build();

		//paymentService.pay(payment);
		orderService.placeOrder(order);
		return null;
	}

}
