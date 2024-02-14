package com.example.profile.service.impl;

import com.example.profile.dto.SkillDto;
import com.example.profile.model.Skills;
import com.example.profile.repository.SkillsRepository;
import com.example.profile.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillsRepository skillsRepository;

    public String addSkill(SkillDto skillDto) {
       Skills skills=new Skills();
       skills.setSkillName(skillDto.getSkillName());
       skills.setLevel(skillDto.getLevel());
       skillsRepository.save(skills);
       return "New Skill Added";
    }

    public String deleteSkill(Long skill_id){
        skillsRepository.deleteById(skill_id);
        return "skill is deleted";
    }
}
