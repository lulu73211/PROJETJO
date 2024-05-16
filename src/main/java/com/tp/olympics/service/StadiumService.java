package com.tp.olympics.service;

import com.tp.olympics.entity.Stadium;
import com.tp.olympics.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {

    @Autowired
    private StadiumRepository stadiumRepository;

    public Stadium createStadium(Stadium stadium) {
        return stadiumRepository.save(stadium);
    }

    public Stadium updateStadium(Long id, Stadium stadium) {
        Stadium existingStadium = stadiumRepository.findById(id).orElseThrow(() -> new RuntimeException("Stadium not found"));
        existingStadium.setName(stadium.getName());
        existingStadium.setLocation(stadium.getLocation());
        return stadiumRepository.save(existingStadium);
    }
}
