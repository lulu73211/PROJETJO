package main.java.com.tp.olympics.repository;

import com.tp.olympics.entity.Event;
import com.tp.olympics.entity.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findByStadiumAndDate(Stadium stadium, LocalDateTime date);
}
