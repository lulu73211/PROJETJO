package main.java.com.tp.olympics.controller;

import com.tp.olympics.dto.TicketDTO;
import com.tp.olympics.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @PostMapping
    public ResponseEntity<TicketDTO> purchaseTicket(@RequestBody TicketDTO ticketDTO) {
        return ResponseEntity.ok(ticketService.purchaseTicket(ticketDTO));
    }

    // Other endpoints...
}
