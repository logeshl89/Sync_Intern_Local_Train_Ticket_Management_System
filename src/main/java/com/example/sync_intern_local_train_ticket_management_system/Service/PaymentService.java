package com.example.sync_intern_local_train_ticket_management_system.Service;

import com.example.sync_intern_local_train_ticket_management_system.Controller.BookingController;
import com.example.sync_intern_local_train_ticket_management_system.Entity.Payment;
import com.example.sync_intern_local_train_ticket_management_system.Repository.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment getBalanceByCardDetails(String cardNumber, String expiryDate, String cvv,double reduce) {
        Payment payment = paymentRepository.findByCardNumberAndExpiryDateAndCvv(cardNumber, expiryDate, cvv);

        if (payment != null) {
//            paymentRepository.updateBalanceByCardNumber(payment.getBalance()-reduce, payment.getCardNumber());
            return payment;
        } else {
            return null;
        }
    }
}


