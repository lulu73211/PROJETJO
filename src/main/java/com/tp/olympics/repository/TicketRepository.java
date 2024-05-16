package main.java.com.tp.olympics.repository;

import com.tp.olympics.entity.Ticket;
import com.tp.olympics.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUser(User user);
}
