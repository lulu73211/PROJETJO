package main.java.com.tp.olympics.repository;

import com.tp.olympics.entity.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}
