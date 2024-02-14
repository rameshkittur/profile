package com.example.profile.service;

import com.example.profile.dto.SkillDto;

public interface SkillService {

    String addSkill(SkillDto skillDto);
    String deleteSkill(Long skillId);
}
