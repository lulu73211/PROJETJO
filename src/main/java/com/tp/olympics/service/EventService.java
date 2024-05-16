package main.java.com.tp.olympics.service;

import com.tp.olympics.dto.EventDTO;
import com.tp.olympics.entity.Event;
import com.tp.olympics.entity.Stadium;
import com.tp.olympics.repository.EventRepository;
import com.tp.olympics.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private StadiumRepository stadiumRepository;

    public EventDTO createEvent(EventDTO eventDTO) {
        Event event = new Event();
        event.setName(eventDTO.getName());
        event.setDate(eventDTO.getDate());
        event.setOpenForRegistration(eventDTO.isOpenForRegistration());
        Optional<Stadium> stadium = stadiumRepository.findById(eventDTO.getStadiumId());
        stadium.ifPresent(event::setStadium);
        eventRepository.save(event);
        eventDTO.setId(event.getId());
        return eventDTO;
    }

    public void openEvent(Long eventId) {
        Optional<Event> event = eventRepository.findById(eventId);
        event.ifPresent(e -> {
            e.setOpenForRegistration(true);
            eventRepository.save(e);
        });
    }

    public void closeEvent(Long eventId) {
        Optional<Event> event = eventRepository.findById(eventId);
        event.ifPresent(e -> {
            e.setOpenForRegistration(false);
            eventRepository.save(e);
        });
    }

    // Other methods...
}
