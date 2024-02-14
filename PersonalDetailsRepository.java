package com.example.profile.repository;

import com.example.profile.model.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails,Long> {
    @Override
    Optional<PersonalDetails> findById(Long id);

//    PersonalDetails getDetailsById(Long id);
}
