package com.example.profile.dto;

import com.example.profile.model.Skills;
import lombok.Data;

import java.util.List;

@Data
public class PersonalDetailsDto {
    private Long id;
    private String gender;
    private String phoneNumber;
    private String department;
    private String address;

    private List<Long>skillId;

}
