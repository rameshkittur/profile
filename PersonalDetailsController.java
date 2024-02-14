package com.example.profile.controller;

import com.example.profile.dto.PersonalDetailsDto;
import com.example.profile.dto.ProfileResponse;
import com.example.profile.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
public class PersonalDetailsController {
    @Autowired
    PersonalDetailsService personalDetailsService;
    @PostMapping("/new")
    public ResponseEntity<String> addNewProfile(@RequestBody PersonalDetailsDto personalDetailsDto){
           return ResponseEntity.ok(personalDetailsService.addNewProfile(personalDetailsDto));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String>deleteProfile(@PathVariable Long id){
        return ResponseEntity.ok(personalDetailsService.deleteProfile(id));
    }

    @GetMapping("{id}")
    public ResponseEntity<ProfileResponse>getProfile(@PathVariable Long id){
        return ResponseEntity.ok(personalDetailsService.getProfile(id));
    }
}
