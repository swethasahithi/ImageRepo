package com.example.ImageRepository.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "form_details")
public class FormDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @Column(name = "loc_id")
    private Integer locId;

    @Transient
    private String otherLocationName;

    @Transient
    private String otherLocationState;

    @Transient
    private String otherLocationAddress;

    @Transient
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
