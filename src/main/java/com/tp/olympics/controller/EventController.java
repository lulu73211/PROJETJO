package main.java.com.tp.olympics.controller;

import com.tp.olympics.dto.EventDTO;
import com.tp.olympics.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<EventDTO> createEvent(@RequestBody EventDTO eventDTO) {
        return ResponseEntity.ok(eventService.createEvent(eventDTO));
    }

    @PutMapping("/open/{id}")
    public ResponseEntity<Void> openEvent(@PathVariable Long id) {
        eventService.openEvent(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/close/{id}")
    public ResponseEntity<Void> closeEvent(@PathVariable Long id) {
        eventService.closeEvent(id);
        return ResponseEntity.ok().build();
    }

    // Other endpoints...
}
