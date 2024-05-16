package main.java.com.tp.olympics.service;



import com.tp.olympics.dto.StadiumDTO;
import com.tp.olympics.entity.Stadium;
import com.tp.olympics.repository.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StadiumService {
    @Autowired
    private StadiumRepository stadiumRepository;

    public StadiumDTO createStadium(StadiumDTO stadiumDTO) {
        Stadium stadium = new Stadium();
        stadium.setName(stadiumDTO.getName());
        stadium.setCapacity(stadiumDTO.getCapacity());
        stadiumRepository.save(stadium);
        stadiumDTO.setId(stadium.getId());
        return stadiumDTO;
    }

    // Other methods...
}
