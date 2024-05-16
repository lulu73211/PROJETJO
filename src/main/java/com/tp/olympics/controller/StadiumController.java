package com.tp.olympics.controller;

import com.tp.olympics.dto.StadiumDTO;
import com.tp.olympics.service.StadiumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stadiums")
public class StadiumController {
    @Autowired
    private StadiumService stadiumService;

    @PostMapping
    public ResponseEntity<StadiumDTO> createStadium(@RequestBody StadiumDTO stadiumDTO) {
        return ResponseEntity.ok(stadiumService.createStadium(stadiumDTO));
    }

    // Other endpoints...
}
