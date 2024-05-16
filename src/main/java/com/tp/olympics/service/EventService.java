package com.tp.olympics.service;

import com.tp.olympics.entity.Event;
import com.tp.olympics.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Event updateEvent(Long id, Event event) {
        Event existingEvent = eventRepository.findById(id).orElseThrow(() -> new RuntimeException("Event not found"));
        existingEvent.setName(event.getName());
        existingEvent.setStadium(event.getStadium());
        return eventRepository.save(existingEvent);
    }
}
