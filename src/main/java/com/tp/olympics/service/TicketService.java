package com.tp.olympics.service;

import com.tp.olympics.entity.Ticket;
import com.tp.olympics.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket updateTicket(Long id, Ticket ticket) {
        Ticket existingTicket = ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket not found"));
        existingTicket.setPrice(ticket.getPrice());
        existingTicket.setEvent(ticket.getEvent());
        existingTicket.setUser(ticket.getUser());
        return ticketRepository.save(existingTicket);
    }
}
