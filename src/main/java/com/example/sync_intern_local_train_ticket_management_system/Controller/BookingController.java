package com.example.sync_intern_local_train_ticket_management_system.Controller;

import com.example.sync_intern_local_train_ticket_management_system.Service.SearchFilter;
import com.example.sync_intern_local_train_ticket_management_system.Service.TicketPriceService;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookingController {
    private final SearchFilter searchFilter;
    private TicketPriceService ticketPriceService;

    public BookingController(SearchFilter searchFilter, TicketPriceService ticketPriceService) {
        this.searchFilter = searchFilter;
        this.ticketPriceService = ticketPriceService;
    }

    @GetMapping("/BookTicket/{id}")
    String BookTheTicket(@PathVariable("id") String id, Model model) {
        System.out.println(id);
        model.addAttribute("TrainName",id);
        return "SelectedTicket";
    }
    static double v;
    @PostMapping("/BookTicket")
    public String submitForm(@RequestParam("passengerCountSenior") String passengerCount,
                             @RequestParam("passengerCountChild") String passengerCountChild,
                             @RequestParam("passengerCountAdult") String passengerCountAdult) {
        System.out.println("Number of Senior citizens: " + passengerCount);
        System.out.println("Number of Children: " + passengerCountChild);
        System.out.println("Number of Adults: " + passengerCountAdult);
         v = ticketPriceService.calculateTotal
                (Integer.parseInt(passengerCountChild), Integer.parseInt(passengerCountAdult), Integer.parseInt(passengerCount));
        System.out.println(v);

        // Return the appropriate view or redirect to another URL
        return "redirect:/processPayment"; // Replace "success" with the name of your success view or redirect URL
    }
}
