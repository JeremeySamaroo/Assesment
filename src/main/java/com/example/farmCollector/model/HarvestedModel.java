package com.example.farmCollector.model;

import jakarta.persistence.*;

@Entity
@Table(name = "HavestInfo")
public class HarvestedModel {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "harvestId")
    private long id;
    private long amountHarvested;
    @Column(name = "plantId")
    private long plantedId;
    @Column(name = "farmid")
    private Long farmId;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAmountHarvested() {
        return amountHarvested;
    }

    public void setAmountHarvested(long amountHarvested) {
        this.amountHarvested = amountHarvested;
    }

    public long getPlantedId() {
        return plantedId;
    }

    public void setPlantedId(long plantedId) {
        this.plantedId = plantedId;
    }

    public Long getFarmId() {
        return farmId;
    }

    public void setFarmId(Long farmId) {
        this.farmId = farmId;
    }

}
