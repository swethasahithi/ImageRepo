package com.example.ImageRepository.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "tbl_users")
public class UserTable {

    @Id
    @Column(name = "I_USER_ID")
    private Integer id;

    @Column(name = "VC_USERNAME")
    private String name;
}
