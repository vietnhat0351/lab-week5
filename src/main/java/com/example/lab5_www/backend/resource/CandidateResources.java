package com.example.lab5_www.backend.resource;

import com.example.lab5_www.backend.service.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/vi")
public class CandidateResources {
    @Autowired
    private CandidateServices services;
}
