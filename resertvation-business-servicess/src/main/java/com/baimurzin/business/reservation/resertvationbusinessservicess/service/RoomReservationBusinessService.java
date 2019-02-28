
package com.baimurzin.business.reservation.resertvationbusinessservicess.service;

import com.baimurzin.business.reservation.resertvationbusinessservicess.client.GuestService;
import com.baimurzin.business.reservation.resertvationbusinessservicess.client.ReservationService;
import com.baimurzin.business.reservation.resertvationbusinessservicess.client.RoomService;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Guest;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Reservation;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Room;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.RoomReservation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class RoomReservationBusinessService implements RoomReservationService {

    private final GuestService guestService;
    private final RoomService roomService;
    private final ReservationService reservationService;

    public List<RoomReservation> getRoomReservationsForDate(String dateString) {
        List<Room> rooms = this.roomService.findAll(null);
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getId());
            roomReservation.setRoomName(room.getName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getId(), roomReservation);
        });
        List<Reservation> reservations = reservationService.findAll(dateString);
        if (null != reservations) {
            reservations.forEach(reservation -> {
                Guest guest = guestService.findOne(reservation.getId());
                if (null != guest) {
                    RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
                    roomReservation.setDate(reservation.getReservationDate());
                    roomReservation.setFirstName(guest.getFirstName());
                    roomReservation.setLastName(guest.getLastName());
                    roomReservation.setGuestId(guest.getId());
                }

            });
        }
        List<RoomReservation> roomReservations = new ArrayList<>();
        for (Long roomId : roomReservationMap.keySet()) {
            roomReservations.add(roomReservationMap.get(roomId));
        }
        return roomReservations;
    }
}
