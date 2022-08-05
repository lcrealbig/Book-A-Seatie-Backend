package com.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {

    @Column(name="room_id")
    private Integer roomId;
    @Column(name="seat_quantity")
    private Integer seatQuantity;
    @Column(name="seat_id")
    private Integer seatId;

    public Room() {
    }

    public Room(Integer roomId, Integer seatQuantity, Integer seatId) {
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

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }
}
