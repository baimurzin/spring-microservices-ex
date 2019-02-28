
package com.baimurzin.business.reservation.resertvationbusinessservicess.client;

import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Guest;
import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Reservation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("RESERVATIONSERVICES")
public interface ReservationService {

    @GetMapping(value = "/reservations")
    List<Reservation> findAll(@RequestParam(name = "date", required = false) String date);
}
