
package com.baimurzin.services.reservation.reservationservices.repository;

import com.baimurzin.services.reservation.reservationservices.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByDate(Date date);
}
