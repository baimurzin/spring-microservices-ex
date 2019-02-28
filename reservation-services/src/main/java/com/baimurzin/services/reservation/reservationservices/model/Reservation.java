
package com.baimurzin.services.reservation.reservationservices.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="RESERVATION")
@Data
public class Reservation {

    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue
    private long id;

    @Column(name="ROOM_ID")
    private long roomId;

    @Column(name="GUEST_ID")
    private long guestId;

    @Column(name="RES_DATE")
    private Date date;
}
