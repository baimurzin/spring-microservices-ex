package com.baimurzin.business.reservation.resertvationbusinessservicess.client;

import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "ROOMSERVICES")
public interface RoomService {

    @GetMapping("/rooms")
    List<Room> findAll(@RequestParam(name="roomNumber", required=false)String roomNumber);

    @GetMapping(value="/rooms/{id}")
    Room findOne(@PathVariable("id")long id);
}