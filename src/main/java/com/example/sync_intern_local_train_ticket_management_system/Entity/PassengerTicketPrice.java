package com.example.sync_intern_local_train_ticket_management_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PassengerTicketPrice {
    @Id
    private String category;
    private Long price;
}
