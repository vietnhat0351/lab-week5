package com.example.lab5_www.backend.repositories;

import com.example.lab5_www.backend.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}