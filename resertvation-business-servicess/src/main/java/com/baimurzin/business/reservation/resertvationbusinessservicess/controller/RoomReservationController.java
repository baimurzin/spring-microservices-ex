
package com.baimurzin.business.reservation.resertvationbusinessservicess.controller;

import com.baimurzin.business.reservation.resertvationbusinessservicess.client.RoomService;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomReservationController {

    private final RoomService roomService;

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        return roomService.findAll(null);
    }
}
