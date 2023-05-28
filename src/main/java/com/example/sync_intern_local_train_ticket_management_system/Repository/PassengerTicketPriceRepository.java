package com.example.sync_intern_local_train_ticket_management_system.Repository;

import com.example.sync_intern_local_train_ticket_management_system.Entity.PassengerTicketPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PassengerTicketPriceRepository extends JpaRepository<PassengerTicketPrice, Long> {
        @Query("SELECT p.price FROM PassengerTicketPrice p WHERE p.category = ?1")
        double getPriceByCategory(String category);
}

