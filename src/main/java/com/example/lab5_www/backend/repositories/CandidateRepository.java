package com.example.lab5_www.backend.repositories;


import com.example.lab5_www.backend.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
