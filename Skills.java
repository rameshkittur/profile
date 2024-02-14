package com.example.profile.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private Long skillId;
    private String skillName;
    private String level;
    private boolean isDeleted;

    @PrePersist
    private void setIsDelete(){
        isDeleted=Boolean.FALSE;
    }
}
