package com.example.sync_intern_local_train_ticket_management_system.Controller;


import com.example.sync_intern_local_train_ticket_management_system.Entity.Payment;
import com.example.sync_intern_local_train_ticket_management_system.Service.PaymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/processPayment")
    public String processPaymentget(Model model) {
        model.addAttribute("PassangerTicketPrice",BookingController.v );
        System.out.println(BookingController.v);
        return "Payment";
    }


    @PostMapping("/processPayment")

    public String processPayment(@RequestParam("cardNumber") String cardNumber,
                                 @RequestParam("expiryDate") String expiryDate,
                                 @RequestParam("cvv") String cvv,Model model) {
        Payment paymentSuccessful = paymentService.getBalanceByCardDetails(cardNumber, expiryDate, cvv,BookingController.v);
        if (paymentSuccessful==null)
        {
            model.addAttribute("error","Invalid credentials");
            return "Payment";
        }
        return "Sucess";

    }
}
