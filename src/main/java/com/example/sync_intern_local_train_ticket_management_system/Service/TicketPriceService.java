package com.example.sync_intern_local_train_ticket_management_system.Service;

import com.example.sync_intern_local_train_ticket_management_system.Repository.PassengerTicketPriceRepository;
import org.springframework.stereotype.Service;

@Service
public class TicketPriceService {
    private PassengerTicketPriceRepository ticketPriceRepository;

    public TicketPriceService(PassengerTicketPriceRepository ticketPriceRepository) {
        this.ticketPriceRepository = ticketPriceRepository;
    }

    public double calculateTotal(int passengerCountChild, int passengerCountAdult, int passengerCountSenior) {
        double childPrice = ticketPriceRepository.getPriceByCategory("Child");
        double adultPrice = ticketPriceRepository.getPriceByCategory("Adult");
        double seniorPrice = ticketPriceRepository.getPriceByCategory("Senior");

        double total = (childPrice * passengerCountChild) +
                (adultPrice * passengerCountAdult) +
                (seniorPrice * passengerCountSenior);

        return total;
    }
}

