package com.example.farmCollector.service;
import com.example.farmCollector.model.FarmInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends JpaRepository<FarmInfo, Long> {


}
