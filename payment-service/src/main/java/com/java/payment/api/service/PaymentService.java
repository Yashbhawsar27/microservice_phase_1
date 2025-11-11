package com.java.payment.api.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.payment.api.entity.Payment;
import com.java.payment.api.repository.PaymentRepostiory;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepostiory repostiory;

	public Payment doPayment(Payment payment) {

		payment.setTransactionId(UUID.randomUUID().toString());
		return repostiory.save(payment);
	}

}
