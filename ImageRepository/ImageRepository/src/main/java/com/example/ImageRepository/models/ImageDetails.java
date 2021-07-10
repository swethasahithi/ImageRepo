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
@Table(name = "image_details")
public class ImageDetails {
    @Id
    @Column(name = "img_id")
    private Integer id;

    @Column(name = "img_desc")
    private String description;

    @Column(name = "img_grp")
    private String group;
}
