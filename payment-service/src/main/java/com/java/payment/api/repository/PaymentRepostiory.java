package com.java.payment.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.payment.api.entity.Payment;

@Repository
public interface PaymentRepostiory extends JpaRepository<Payment, Integer> {

}
