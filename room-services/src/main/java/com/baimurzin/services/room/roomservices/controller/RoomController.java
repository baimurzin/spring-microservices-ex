package com.baimurzin.services.room.roomservices.controller;

import com.baimurzin.services.room.roomservices.model.Room;
import com.baimurzin.services.room.roomservices.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomController {

    private final RoomRepository roomRepository;

    @GetMapping("/rooms")
    public List<Room> findAll(@RequestParam(required = false) String roomNumber) {
        if (StringUtils.isNoneBlank(roomNumber))
            return roomRepository.findByRoomNumber(roomNumber);
        return roomRepository.findAll();
    }
}
