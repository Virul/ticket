package com.gerez.Ticket.controlers;

import com.gerez.Ticket.models.Ticket;
import com.gerez.Ticket.models.User;
import com.gerez.Ticket.services.TicketService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/Ticket/add_ticket")
    public String addUser(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "Ticket/add_ticket";
    }

    @PostMapping("/Ticket/add_ticket")
    public String submitTicket(@ModelAttribute("ticket") @Valid Ticket ticket, BindingResult result, Model model) {
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> {
                System.out.println("Error: " + error.getObjectName() + " - " + error.getDefaultMessage());
            });
            return "Ticket/add_ticket";
        }
        ticketService.save(ticket);
        return "redirect:/home";
    }
}
