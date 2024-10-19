package com.example.plantcare.plantcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plants")
@CrossOrigin(origins = "http://localhost:3000")
public class PlantController {

    @Autowired
    private PlantService plantService;

    @GetMapping("/all")
    public List<Plant> getAllPlants() {
        return plantService.getAllPlants();
    }

    @GetMapping("/category/{category}")
    public List<Plant> getPlantsByCategory(@PathVariable String category) {
        return plantService.getPlantsByCategory(category);
    }


    @PostMapping("/add")
    public Plant addPlant(@RequestBody Plant plant) {
        return plantService.addPlant(plant);  // Make sure this service method is correctly implemented
    }

    @GetMapping("/search/{name}")
    public List<Plant> searchPlantsByName(@PathVariable String name) {
        return plantService.searchPlantsByName(name);
    }

}