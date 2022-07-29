package com.userservice.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUILDING")
public class Buiding {

    private Long buildingId;
    private String address;
    private Integer floorsNumber;
    private Integer floorId;


    public Buiding() {
    }

    public Buiding(Long buildingId, String address, Integer floors) {
        this.buildingId = buildingId;
        this.address = address;
        this.floorsNumber = floors;
    }

    @Id
    public Long getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Long buildingId) {
        this.buildingId = buildingId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getFloors() {
        return floorsNumber;
    }

    public void setFloors(Integer floors) {
        this.floorsNumber = floors;
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }
}
