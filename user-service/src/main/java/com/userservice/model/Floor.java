package com.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FLOOR")
public class Floor {

    private Integer floorId;
    private Integer roomsQuantity;
    private Integer roomId;

    public Floor() {
    }

    public Floor(Integer floorId, Integer roomsQuantity, Integer roomId) {
        this.floorId = floorId;
        this.roomsQuantity = roomsQuantity;
        this.roomId = roomId;
    }
    @Id
    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public Integer getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(Integer roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}
