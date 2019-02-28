
package com.baimurzin.services.reservation.reservationservices.controller;

import com.baimurzin.services.reservation.reservationservices.model.Reservation;
import com.baimurzin.services.reservation.reservationservices.model.ReservationDTO;
import com.baimurzin.services.reservation.reservationservices.repository.ReservationRepository;
import com.baimurzin.services.reservation.reservationservices.utils.DateTimeUtils;
import com.baimurzin.services.reservation.reservationservices.utils.ReservationTranslator;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReservationController {

    private final ReservationRepository reservationRepository;
    private final DateTimeUtils dateTimeUtils;
    private final ReservationTranslator reservationTranslator;

    @GetMapping("reservations")
    public List<ReservationDTO> findAll(@RequestParam(name = "date", required = false) String date) {
        List<Reservation> reservations = null;
        if (StringUtils.isNotBlank(date)) {
            reservations = reservationRepository.findByDate(dateTimeUtils.createDateFromDateString(date));
        } else {
            reservations = reservationRepository.findAll();
        }
        List<ReservationDTO> reservationDTOS = new ArrayList<>(reservations.size());
        reservations.forEach(entity -> {
            reservationDTOS.add(reservationTranslator.translateEntityToReservation(entity));
        });
        return reservationDTOS;
    }
}
