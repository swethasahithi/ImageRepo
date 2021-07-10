package com.example.ImageRepository.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "location_table")
public class LocationDetails {

    @Id
    @Column(name = "loc_id")
    private Integer id;

    @Column(name = "loc_name")
    private String name;

    @Column(name = "loc_address")
    private String address;

    @Column(name = "loc_state")
    private String state;

    @Column(name = "loc_pincode")
    private String pinCode;
}
