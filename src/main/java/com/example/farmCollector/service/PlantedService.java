package com.example.farmCollector.service;


import com.example.farmCollector.model.FarmInfo;
import com.example.farmCollector.model.PlantedModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class PlantedService {

        @Autowired
        private PlantedRepository plantedRepository;

        public PlantedModel savePlanted(PlantedModel planted) {
            return plantedRepository.save(planted);
        }

        public List<PlantedModel> getAllPlantedInfo() {
            return plantedRepository.findAll();
        }

    }
