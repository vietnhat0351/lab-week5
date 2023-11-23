package com.example.lab5_www;

import com.example.lab5_www.backend.models.Address;
import com.example.lab5_www.backend.models.Candidate;
import com.example.lab5_www.backend.repositories.AddressRepository;
import com.example.lab5_www.backend.repositories.CandidateRepository;
import com.neovisionaries.i18n.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class Lab5WwwApplication {
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(Lab5WwwApplication.class, args);
    }
 //   @Bean
    CommandLineRunner initData(){
        return args -> {
            Random rnd =new Random();
            for (int i = 1; i < 1000; i++) {
                Address add = new Address(rnd.nextInt(1,1000)+"","Quang Trung","HCM",
                        rnd.nextInt(70000,80000)+"", CountryCode.VN );
                addressRepository.save(add);

                Candidate can=new Candidate("Name #"+i,
                        LocalDate.of(1998,rnd.nextInt(1,13),rnd.nextInt(1,29)),
                        add,
                        rnd.nextLong(1111111111L,9999999999L)+"",
                        "email_"+i+"@gmail.com");
                candidateRepository.save(can);
                System.out.println("Added: " +can);
            }
        };
    }

}

