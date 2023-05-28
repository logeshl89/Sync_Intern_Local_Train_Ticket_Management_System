package com.example.sync_intern_local_train_ticket_management_system.Controller;

import com.example.sync_intern_local_train_ticket_management_system.Entity.Customers;
import com.example.sync_intern_local_train_ticket_management_system.Service.PassangerAmountCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CheckingController {
    private PassangerAmountCalculator passangerAmountCalculator;

    public CheckingController(PassangerAmountCalculator passangerAmountCalculator) {
        this.passangerAmountCalculator = passangerAmountCalculator;
    }

    @GetMapping("/Checking")
    String GetCheckingPage() {
        return "TrainTicketBook";
    }

//    @PostMapping("/TicketBooking")
//    public String bookTicket(Customers trainTicketBooking, Model model) {
//        System.out.println(trainTicketBooking);
//        Long calculate = passangerAmountCalculator.Calculate(trainTicketBooking);
//        System.out.println(calculate);
//        model.addAttribute("amount", calculate);
//        return "TrainTicketBook";
//
//    }
}
