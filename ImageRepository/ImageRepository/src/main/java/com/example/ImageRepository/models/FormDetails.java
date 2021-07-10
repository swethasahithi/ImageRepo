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
@Table(name = "form_details")
public class FormDetails {

    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "loc_id")
    private Integer loc_id;

    @Column(name = "other_loc_name")
    private String otherLocationName;

    @Column(name = "other_loc_state")
    private String otherLocationState;

    @Column(name = "other_loc_address")
    private String otherLocationAddress;

    @Column(name = "other_loc_pincode")
    private String otherLocationPinCode;

    @Column(name = "I_USER_ID")
    private Integer userId;

    @Column(name = "designation")
    private String designation;

    @Column(name = "rice_variety")
    private String riceVariety;

    @Column(name = "duration")
    private String duration;

    @Column(name = "crop_stage")
    private String cropStage;

    @Column(name = "img_id")
    private Integer imgId;

    @Column(name = "submit_date")
    private String submissionDate;

}
