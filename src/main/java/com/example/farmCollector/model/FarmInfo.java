package com.example.farmCollector.model;
import jakarta.persistence.*;

import java.util.List;

import com.example.farmCollector.model.PlantedModel;

@Entity
@Table(name = "FarmsInfo")
public class FarmInfo {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "farmId")
        private Long id;
        private Long numberOfFields;
        private String name;





        @OneToMany(mappedBy = "farmId", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<PlantedModel> plantedModelsInfo = null;

        public FarmInfo() {
        }

        public List<PlantedModel> getPlantedModelsInfo() {
                return plantedModelsInfo;
        }

        public void setPlantedModelsInfo(List<PlantedModel> plantedModelsInfo) {
                this.plantedModelsInfo = plantedModelsInfo;
        }






        public Long getNumberOfFields() {
                return numberOfFields;
        }

        public void setNumberOfFields(Long numberOfFields) {
                this.numberOfFields = numberOfFields;
        }

        public String getOwner() {
                return owner;
        }

        public void setOwner(String owner) {
                this.owner = owner;
        }

        private String owner;

        // Getters and setters

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void  setName(String name){
                this.name =name;
        }



}
