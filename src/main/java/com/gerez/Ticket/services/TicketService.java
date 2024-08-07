package com.gerez.Ticket.services;

import com.gerez.Ticket.models.Ticket;
import com.gerez.Ticket.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public void save(Ticket ticket) {
        ticketRepository.save(ticket);
    }
}
