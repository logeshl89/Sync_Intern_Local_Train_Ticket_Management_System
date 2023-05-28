package com.example.sync_intern_local_train_ticket_management_system.Repository;

import com.example.sync_intern_local_train_ticket_management_system.Entity.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
class PaymentRepositoryTest {

    @Autowired
    private PaymentRepository paymentRepository;


    @Test
    @Transactional
    @Rollback(true)
    void updateBalanceByCardNumber() {
        // Arrange
        String cardNumber = "1234567890123456";
        double newBalance = 1200.0;

        // Act
        paymentRepository.updateBalanceByCardNumber(newBalance, cardNumber);

        // Assert
//        Optional<Payment> updatedPaymentOptional = paymentRepository.findByCardNumber(cardNumber);
//        assertTrue(updatedPaymentOptional.isPresent());
//        Payment updatedPayment = updatedPaymentOptional.get();
//        assertEquals(newBalance, updatedPayment.getBalance());
    }
}
