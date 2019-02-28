
package com.baimurzin.service.guest.guestservice.repository;

import com.baimurzin.service.guest.guestservice.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    Guest findByEmailAddress(String emailAddress);
}
