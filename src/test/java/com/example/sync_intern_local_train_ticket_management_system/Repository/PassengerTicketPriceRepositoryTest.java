package com.example.sync_intern_local_train_ticket_management_system.Repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PassengerTicketPriceRepositoryTest {
    @Autowired
private PassengerTicketPriceRepository passengerTicketPriceRepository;

    PassengerTicketPriceRepositoryTest(PassengerTicketPriceRepository passengerTicketPriceRepository) {
        this.passengerTicketPriceRepository = passengerTicketPriceRepository;
    }
    @Test
    void Test()
    {
        System.out.println(        passengerTicketPriceRepository.findAll());
//        System.out.println(passengerTicketPriceRepository.findByCat("child"));

    }
}