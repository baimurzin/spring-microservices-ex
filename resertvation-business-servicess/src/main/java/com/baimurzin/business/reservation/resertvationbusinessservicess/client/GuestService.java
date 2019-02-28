
package com.baimurzin.business.reservation.resertvationbusinessservicess.client;

import com.baimurzin.business.reservation.resertvationbusinessservicess.model.Guest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient("GUESTSERVICES")
public interface GuestService {
    @GetMapping(value="/guests")
    List<Guest> findAll(@RequestParam(name="emailAddress", required = false)String emailAddress);

    @GetMapping(value = "/guests/{id}")
    Guest findOne(@PathVariable(name="id")long id);
}
