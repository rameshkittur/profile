package com.example.profile.service;

import com.example.profile.dto.PersonalDetailsDto;
import com.example.profile.dto.ProfileResponse;

public interface PersonalDetailsService {
   String addNewProfile(PersonalDetailsDto personalDetailsDto);
   String deleteProfile(Long id);
  ProfileResponse getProfile(Long id);
}
