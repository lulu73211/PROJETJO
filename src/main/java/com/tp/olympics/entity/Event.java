package main.java.com.tp.olympics.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDateTime date;
    private boolean openForRegistration;
    
    @ManyToOne
    private Stadium stadium;
    
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
    
    public Stadium getStadium() {
        return stadium;
    }
    
    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }
}
