package com.example.lab5_www.backend.repositories;

import com.example.lab5_www.backend.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company, Long> {
}