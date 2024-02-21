package com.example.farmCollector.service;


import com.example.farmCollector.model.FarmInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class FarmService {

    @Autowired
    private FarmRepository FarmRepository;

    public FarmInfo saveMyFarm(FarmInfo myFarm) {
        return FarmRepository.save(myFarm);
    }

    public List<FarmInfo> getAllFarms() {
        return FarmRepository.findAll();
    }

}
