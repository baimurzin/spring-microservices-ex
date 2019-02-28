package com.baimurzin.services.room.roomservices.repository;

import com.baimurzin.services.room.roomservices.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByRoomNumber(String roomNumber);
}
