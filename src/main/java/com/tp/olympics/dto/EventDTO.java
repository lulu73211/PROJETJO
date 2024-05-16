package com.tp.olympics.dto;

import java.time.LocalDateTime;

public class EventDTO {
    private Long id;
    private String name;
    private LocalDateTime date;
    private boolean openForRegistration;
    private Long stadiumId;
    // getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public boolean isOpenForRegistration() {
        return openForRegistration;
    }
    public void setOpenForRegistration(boolean openForRegistration) {
        this.openForRegistration = openForRegistration;
    }
    public Long getStadiumId() {
        return stadiumId;
    }
    public void setStadiumId(Long stadiumId) {
        this.stadiumId = stadiumId;
    }
}
