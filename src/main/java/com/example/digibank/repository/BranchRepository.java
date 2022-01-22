package com.example.digibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.digibank.models.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

}
