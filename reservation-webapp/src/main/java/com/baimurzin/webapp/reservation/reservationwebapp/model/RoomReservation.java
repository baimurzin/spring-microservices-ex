
package com.baimurzin.webapp.reservation.reservationwebapp.model;

import lombok.Data;

@Data
public class RoomReservation {
    private long roomId;
    private long guestId;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private String date;
}
