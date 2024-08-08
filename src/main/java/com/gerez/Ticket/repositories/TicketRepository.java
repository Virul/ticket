package com.gerez.Ticket.repositories;

import com.gerez.Ticket.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}

