package com.example.plantcare.plantcard;

import com.example.plantcare.plantcard.Plant;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface PlantRepository extends MongoRepository<Plant, String> {
    List<Plant> findByCategory(String category);  // Custom query method
    List<Plant> findByNameContainingIgnoreCase(String name);
}