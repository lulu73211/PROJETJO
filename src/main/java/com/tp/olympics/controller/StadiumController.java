package com.tp.olympics.controller;

import com.tp.olympics.entity.Stadium;
import com.tp.olympics.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stadiums")
public class StadiumController {

    @Autowired
    private StadiumService stadiumService;

    @PostMapping
    public ResponseEntity<Stadium> createStadium(@RequestBody Stadium stadium) {
        Stadium savedStadium = stadiumService.createStadium(stadium);
        return ResponseEntity.ok(savedStadium);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stadium> updateStadium(@PathVariable Long id, @RequestBody Stadium stadium) {
        Stadium updatedStadium = stadiumService.updateStadium(id, stadium);
        return ResponseEntity.ok(updatedStadium);
    }
}
