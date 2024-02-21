package com.example.farmCollector.controller;

import com.example.farmCollector.model.PlantedModel;
import com.example.farmCollector.service.PlantedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/planted")
public class PlantedController {

    PlantedService plantedService;

    public PlantedController(PlantedService plantedService) {
        this.plantedService = plantedService;
    }


    @PostMapping
    public ResponseEntity<PlantedModel> createFarm(@RequestBody PlantedModel plantDto) {
        PlantedModel planted = plantedService.savePlanted(plantDto);
        return ResponseEntity.ok(planted);
    }

}
