package com.example.farmCollector.service;


import com.example.farmCollector.model.HarvestedModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public
class HarvestService {

    @Autowired
    private HarvestRepository harvestRepository;

    public HarvestedModel saveHarvest(HarvestedModel harvested){
        return harvestRepository.save(harvested);
    }
}





