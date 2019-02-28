package com.baimurzin.business.reservation.resertvationbusinessservicess.model;

import lombok.Data;

@Data
public class Guest {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;
}
