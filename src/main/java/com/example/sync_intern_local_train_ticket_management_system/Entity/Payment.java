package com.example.sync_intern_local_train_ticket_management_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @SequenceGenerator(name = "id",sequenceName = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id")
    private Long id;

    @Column(name = "card_number", nullable = false)
    private String cardNumber;

    @Column(name = "expiry_date", nullable = false)
    private String expiryDate;

    @Column(name = "cvv", nullable = false)
    private String cvv;

    private double balance;
    public Payment(String cardNumber, String expiryDate, String cvv) {
        this.cvv=cvv;
    this.cardNumber=cardNumber;
    this.expiryDate=expiryDate;
    }
}