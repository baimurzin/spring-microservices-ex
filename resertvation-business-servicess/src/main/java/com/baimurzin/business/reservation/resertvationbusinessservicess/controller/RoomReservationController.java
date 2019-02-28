/*
 * Copyright 2018 by HireRight, Inc. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of HireRight, Inc. Use is subject to license terms.
 *
 * History:
 * V.Baimurzin 2019-02-28 Created
 */
package com.baimurzin.business.reservation.resertvationbusinessservicess.controller;

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

    private final RestTemplate restTemplate;

    @GetMapping("/rooms")
    public List<Room> getAllRooms(){
        ResponseEntity<List<Room>> roomsResponse = restTemplate.exchange(
                "http://ROOMSERVICES/rooms",
                HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Room>>() {
                });
        return roomsResponse.getBody();
    }
}
