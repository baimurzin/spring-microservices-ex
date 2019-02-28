package com.baimurzin.business.reservation.resertvationbusinessservicess.client;

import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Guest;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GuestServiceFallbackImpl implements GuestService {
    @Override
    public List<Guest> findAll(String emailAddress) {
        return Collections.emptyList();
    }

    @Override
    public Guest findOne(long id) {
        Guest guest = new Guest();
        guest.setFirstName("VLAD");
        guest.setLastName("Baimurzin");
        guest.setId(1L);
        return guest;
    }
}
