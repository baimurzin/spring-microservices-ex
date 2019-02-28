
package com.baimurzin.service.guest.guestservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "GUEST")
@Data
public class Guest {

    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    private String address;

    private String country;

    private String state;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

}
