package com.example.lab5_www.backend.repositories;

import com.example.lab5_www.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;



public interface JobRepository extends JpaRepository<Job, Long> {
}
