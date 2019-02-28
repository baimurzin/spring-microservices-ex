
package com.baimurzin.webapp.reservation.reservationwebapp.client;

import com.baimurzin.webapp.reservation.reservationwebapp.model.Room;
import com.baimurzin.webapp.reservation.reservationwebapp.model.RoomReservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("RESERVATIONBUSINESSSERVICES")
public interface RoomReservationService {

    @GetMapping(value = "/rooms")
    public List<Room> getAllRooms(@RequestParam(name="roomNumber", required=false)String roomNumber);

    @GetMapping(value="/roomReservations/{date}")
    public List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date);
}
