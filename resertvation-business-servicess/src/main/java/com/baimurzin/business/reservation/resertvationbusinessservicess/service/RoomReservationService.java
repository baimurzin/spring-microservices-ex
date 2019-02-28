
package com.baimurzin.business.reservation.resertvationbusinessservicess.service;

import com.baimurzin.business.reservation.resertvationbusinessservicess.model.RoomReservation;

import java.util.List;

public interface RoomReservationService {
    List<RoomReservation> getRoomReservationsForDate(String dateString);
}
