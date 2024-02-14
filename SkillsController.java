package com.example.profile.controller;

import com.example.profile.dto.SkillDto;
import com.example.profile.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    SkillService skillService;
    @PostMapping("/new")
    public ResponseEntity<String> addNewSkill(@RequestBody SkillDto skillDto){
       return  ResponseEntity.ok(skillService.addSkill(skillDto));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteSkill(@PathVariable Long id){
        return ResponseEntity.ok(skillService.deleteSkill(id));
    }
}
