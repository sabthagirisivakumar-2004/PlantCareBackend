package com.example.plantcare.plantcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlantService {

    @Autowired
    private PlantRepository plantRepository;

    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    public List<Plant> getPlantsByCategory(String category) {
        return plantRepository.findByCategory(category);
    }

    public Plant addPlant(Plant plant) {
        return plantRepository.save(plant);
    }

    public List<Plant> searchPlantsByName(String name) {
        return plantRepository.findByNameContainingIgnoreCase(name);  // Use the repository method to find by name
    }


}