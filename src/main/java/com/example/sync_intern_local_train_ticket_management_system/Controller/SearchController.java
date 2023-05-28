package com.example.sync_intern_local_train_ticket_management_system.Controller;

import com.example.sync_intern_local_train_ticket_management_system.Entity.TrainSearchForm;
import com.example.sync_intern_local_train_ticket_management_system.Service.SearchFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/trainSearchForm")
public class SearchController {
    private SearchFilter searchFilter;

    public SearchController(SearchFilter searchFilter) {
        this.searchFilter = searchFilter;
    }

    @GetMapping
    String getTrainseartForm()
    {
        return "CheckingAndBookingTicket";
    }
    @PostMapping
    public String saveTrainSearchForm(@ModelAttribute TrainSearchForm form, Model model) {
        List<TrainSearchForm> x = searchFilter.GetTheTrains(form);
        model.addAttribute("trains",x);
        System.out.println(x);
        System.out.println(form);
        return "CheckingAndBookingTicket";
    }

}
