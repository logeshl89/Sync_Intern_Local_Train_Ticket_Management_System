package com.example.sync_intern_local_train_ticket_management_system.Service;

import com.example.sync_intern_local_train_ticket_management_system.Repository.PassengerTicketPriceRepository;
import com.example.sync_intern_local_train_ticket_management_system.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class PassangerAmountCalculator {
    private static  PassengerTicketPriceRepository passengerTicketPriceRepository;
private UserRepository  userRepository;
    public PassangerAmountCalculator(PassengerTicketPriceRepository passengerTicketPriceRepository) {
        this.passengerTicketPriceRepository = passengerTicketPriceRepository;
    }

}
