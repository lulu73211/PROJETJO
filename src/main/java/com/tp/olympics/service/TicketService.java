package main.java.com.tp.olympics.service;

import com.tp.olympics.dto.TicketDTO;
import com.tp.olympics.entity.Event;
import com.tp.olympics.entity.Ticket;
import com.tp.olympics.entity.User;
import com.tp.olympics.repository.EventRepository;
import com.tp.olympics.repository.TicketRepository;
import com.tp.olympics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    public TicketDTO purchaseTicket(TicketDTO ticketDTO) {
        Optional<User> user = userRepository.findById(ticketDTO.getUserId());
        Optional<Event> event = eventRepository.findById(ticketDTO.getEventId());
        if (user.isPresent() && event.isPresent()) {
            Ticket ticket = new Ticket();
            ticket.setUser(user.get());
            ticket.setEvent(event.get());
            ticketRepository.save(ticket);
            ticketDTO.setId(ticket.getId());
            return ticketDTO;
        }
        return null;
    }

    // Other methods...
}
