
package com.baimurzin.services.reservation.reservationservices.model;


import lombok.Data;

@Data
public class ReservationDTO {

    private long id;
    private long roomId;
    private long guestId;
    private String reservationDate;
}
