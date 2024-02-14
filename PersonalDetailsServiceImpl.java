package com.example.profile.service.impl;

import com.example.profile.dto.PersonalDetailsDto;
import com.example.profile.dto.ProfileResponse;
import com.example.profile.model.PersonalDetails;
import com.example.profile.model.Skills;
import com.example.profile.repository.PersonalDetailsRepository;
import com.example.profile.repository.SkillsRepository;
import com.example.profile.service.PersonalDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonalDetailsServiceImpl implements PersonalDetailsService {
    @Autowired
   private PersonalDetailsRepository detailsRepository;
    @Autowired
   private SkillsRepository skillsRepository;

    public String addNewProfile(PersonalDetailsDto personalDetailsDto) {
        PersonalDetails personalDetails=new PersonalDetails();
        personalDetails.setUserId(personalDetailsDto.getId());
        personalDetails.setGender(personalDetailsDto.getGender());
        personalDetails.setDepartment(personalDetailsDto.getDepartment());
        personalDetails.setAddress(personalDetailsDto.getAddress());
        personalDetails.setPhoneNumber(personalDetailsDto.getPhoneNumber());
        List<Skills>finalSkill=new ArrayList<>();
        if(!personalDetailsDto.getSkillId().isEmpty()){
          List<Long> allId= personalDetailsDto.getSkillId();

          for(Long id:allId){
              finalSkill.add(skillsRepository.findById(id).get());
          }
          personalDetails.setSkills(finalSkill);
        }
        detailsRepository.save(personalDetails);
        return "New profile added Successfully";
        //personalDetails.setSkills(personalDetailsDto.getSkills());
        // if you have skill id
        // use the skill repository to get the data
        // add it to personal details
        // personalDetails.setSkills();
    }

    public String deleteProfile(Long id){
        detailsRepository.deleteById(id);
        return "profile deleted";
    }

    public ProfileResponse getProfile(Long profile_id){
        ProfileResponse profileResponse=new ProfileResponse();
        PersonalDetails personalDetails=detailsRepository.findById(profile_id).get();
        profileResponse.setAddress(personalDetails.getAddress());
        profileResponse.setGender(personalDetails.getGender());
        profileResponse.setPhoneNumber(personalDetails.getPhoneNumber());
        profileResponse.setDepartment(personalDetails.getDepartment());
        profileResponse.setAllSkills(personalDetails.getSkills());

        return profileResponse;
    }
}
