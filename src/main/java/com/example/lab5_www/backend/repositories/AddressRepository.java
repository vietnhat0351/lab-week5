package com.example.lab5_www.backend.repositories;

import com.example.lab5_www.backend.models.Address;
import org.springframework.data.repository.CrudRepository;


public interface AddressRepository extends CrudRepository<Address, Long> {
}
