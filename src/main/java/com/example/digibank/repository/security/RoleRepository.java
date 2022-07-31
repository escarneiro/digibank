package com.example.digibank.repository.security;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.digibank.models.security.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
    
    List<Role> findByUser_ID(Integer user_ID);
}
