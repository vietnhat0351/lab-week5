package com.example.lab5_www.backend.repositories;

import com.example.lab5_www.backend.models.JobSkill;
import com.example.lab5_www.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobSkillRepository extends JpaRepository<JobSkill, Skill> {
}