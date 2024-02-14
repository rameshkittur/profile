package com.example.profile.repository;

import com.example.profile.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Long> {
//    Skills getBySkillId(Long id);
}
