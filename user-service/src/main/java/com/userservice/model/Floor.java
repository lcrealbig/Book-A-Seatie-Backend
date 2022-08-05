package com.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "floor")
public class Floor {
    @Column(name="floor_id")
    private Integer floorId;
    @Column(name="rooms_quantity")
    private Integer roomsQuantity;
    @Column(name="room_id")
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
