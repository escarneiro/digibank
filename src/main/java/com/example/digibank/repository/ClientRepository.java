package com.example.digibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.digibank.models.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
