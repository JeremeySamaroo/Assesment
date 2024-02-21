package com.example.farmCollector.controller;

import com.example.farmCollector.model.FarmInfo;
import com.example.farmCollector.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import com.example.farmCollector.service.FarmService;


@RestController
@RequestMapping("/farms")
public class FarmController {

    FarmService farmService;

    public FarmController(FarmService farmService) {
        this.farmService = farmService;
    }

    @PostMapping
    public ResponseEntity<FarmInfo> createFarm(@RequestBody FarmInfo farmDto) {
        FarmInfo farm = farmService.saveMyFarm(farmDto);
        return ResponseEntity.ok(farm);
    }

    @GetMapping
    public ResponseEntity<List<FarmInfo>> getAllFarms() {
        List<FarmInfo> farms = farmService.getAllFarms();
        return ResponseEntity.ok(farms);
    }



}
