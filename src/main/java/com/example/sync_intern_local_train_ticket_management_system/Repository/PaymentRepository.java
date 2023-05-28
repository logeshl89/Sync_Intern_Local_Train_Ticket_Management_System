package com.example.sync_intern_local_train_ticket_management_system.Repository;

import com.example.sync_intern_local_train_ticket_management_system.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    Optional<Payment> findByCardNumber(String cardNumber);

    Payment findByCardNumberAndExpiryDateAndCvv(String cardNumber, String expiryDate, String cvv);
    @Modifying
    @Query("UPDATE Payment p SET p.balance = :balance WHERE p.cardNumber = :cardNumber")
    void updateBalanceByCardNumber(@Param("balance") double balance, @Param("cardNumber") String cardNumber);

}
