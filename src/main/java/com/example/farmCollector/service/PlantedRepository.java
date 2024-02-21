package com.example.farmCollector.service;

import com.example.farmCollector.model.PlantedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantedRepository extends JpaRepository<PlantedModel, Long> {
}
