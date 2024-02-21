package com.example.farmCollector.service;

import com.example.farmCollector.model.HarvestedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HarvestRepository extends JpaRepository<HarvestedModel, Long> {
}
