
package com.baimurzin.business.reservation.resertvationbusinessservicess.controller;

import com.baimurzin.business.reservation.resertvationbusinessservicess.client.RoomService;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Room;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.RoomReservation;
import com.baimurzin.business.reservation.resertvationbusinessservicess.service.RoomReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomReservationController {

    private final RoomService roomService;
    private final RoomReservationService reservationService;

    @GetMapping("/rooms")
    public List<Room> getAllRooms(@RequestParam(name="roomNumber", required=false)String roomNumber){
        return roomService.findAll(roomNumber);
    }

    @GetMapping(value="/roomReservations/{date}")
    public List<RoomReservation> getRoomReservationsForDate(@PathVariable("date") String date){
        return reservationService.getRoomReservationsForDate(date);
    }
}
