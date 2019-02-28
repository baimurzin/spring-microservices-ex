
package com.baimurzin.service.guest.guestservice.controller;

import com.baimurzin.service.guest.guestservice.model.Guest;
import com.baimurzin.service.guest.guestservice.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class GuestController {

    private final GuestRepository guestRepository;

    @GetMapping("/guests")
    public List<Guest> findAll(@RequestParam(name = "emailAddress", required = false) String emailAddress) {
        if (StringUtils.isNotBlank(emailAddress)) {
            return Collections.singletonList(guestRepository.findByEmailAddress(emailAddress));
        }
        return guestRepository.findAll();
    }

    @GetMapping(value = "/guests/{id}")
    public Guest findOne(@PathVariable(name = "id") Long id) {
        return guestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No guests"));
    }
}
