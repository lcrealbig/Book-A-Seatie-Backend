package com.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {

    private Integer roomId;
    private Integer seatQuantity;
    private String seatId;

    public Room() {
    }

    public Room(Integer roomId, Integer seatQuantity, String seatId) {
        this.roomId = roomId;
        this.seatQuantity = seatQuantity;
        this.seatId = seatId;
    }
    @Id
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getSeatQuantity() {
        return seatQuantity;
    }

    public void setSeatQuantity(Integer seatQuantity) {
        this.seatQuantity = seatQuantity;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }
}
