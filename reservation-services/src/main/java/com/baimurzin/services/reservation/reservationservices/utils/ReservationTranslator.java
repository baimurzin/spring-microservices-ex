package com.baimurzin.services.reservation.reservationservices.utils;

import com.baimurzin.services.reservation.reservationservices.model.Reservation;
import com.baimurzin.services.reservation.reservationservices.model.ReservationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReservationTranslator {

    private final DateTimeUtils dateTimeUtils;

    @Autowired
    public ReservationTranslator(DateTimeUtils dateTimeUtils) {
        super();
        this.dateTimeUtils = dateTimeUtils;
    }

    public ReservationDTO translateEntityToReservation(Reservation reservationEntity) {
        ReservationDTO reservationDTO = new ReservationDTO();
        reservationDTO.setId(reservationEntity.getId());
        reservationDTO.setRoomId(reservationEntity.getRoomId());
        reservationDTO.setGuestId(reservationEntity.getGuestId());
        reservationDTO.setReservationDate(this.dateTimeUtils.createDateStringFromDate(reservationEntity.getDate()));
        return reservationDTO;
    }

    public Reservation translateReservationToEntity(ReservationDTO reservationDTO) {
        Reservation entity = new Reservation();
        entity.setGuestId(reservationDTO.getGuestId());
        entity.setId(reservationDTO.getId());
        entity.setRoomId(reservationDTO.getRoomId());
        entity.setDate(new java.sql.Date(this.dateTimeUtils.createDateFromDateString(reservationDTO.getReservationDate()).getTime()));
        return entity;
    }
}
