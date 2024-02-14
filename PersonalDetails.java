package com.example.profile.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PersonalDetails {
    @Id
    private Long userId;
    private String gender;
    private String phoneNumber;
    private String department;
    private String address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Skills>skills;



}
