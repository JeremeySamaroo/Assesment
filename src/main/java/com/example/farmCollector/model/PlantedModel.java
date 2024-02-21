package com.example.farmCollector.model;

import jakarta.persistence.*;

@Entity
public class PlantedModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlantedId")
    private Long id;

    private long fieldNumber;
    private String season;
    private long plantingAreaInAcres;
    private String typeOfCropPlanted;
    private long amountExpectedHarvestInTons;

    @Column(name = "farmid")
    private Long farmId;



//    @ManyToOne(fetch = FetchType.LAZY)
//    //@JoinColumn(name = "Farm_ID", nullable = false)
//    private FarmInfo farmId;

    public Long getFarmId() {
        return farmId;
    }

    public void setFarmId(Long farmId) {
        this.farmId = farmId;
    }


//   public FarmInfo getFarmId() {
//        return farmId;
//    }
//
//    public void setFarmId(FarmInfo farmId) {
//        this.farmId = farmId;
//    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getFieldNumber() {
        return fieldNumber;
    }

    public void setFieldNumber(long fieldNumber) {
        this.fieldNumber = fieldNumber;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public long getPlantingAreaInAcres() {
        return plantingAreaInAcres;
    }

    public void setPlantingAreaInAcres(long plantingAreaInAcres) {
        this.plantingAreaInAcres = plantingAreaInAcres;
    }

    public String getTypeOfCropPlanted() {
        return typeOfCropPlanted;
    }

    public void setTypeOfCropPlanted(String typeOfCropPlanted) {
        this.typeOfCropPlanted = typeOfCropPlanted;
    }

    public long getAmountExpectedHarvestInTons() {
        return amountExpectedHarvestInTons;
    }

    public void setAmountExpectedHarvestInTons(long amountExpectedHarvestInTons) {
        this.amountExpectedHarvestInTons = amountExpectedHarvestInTons;
    }




}
