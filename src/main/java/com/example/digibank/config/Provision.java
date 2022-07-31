package com.example.digibank.config;


import com.example.digibank.models.security.Role;
import com.example.digibank.models.security.User;
import com.example.digibank.repository.security.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Cria dados de usuário iniciais no DB. 
 * @author eder
 *
 */



@Component
public class Provision implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Transactional
    @Override
    public void run(String... args) throws Exception {
//        User user = userRepository.findByUsername("admin");       
//        Role usrRole = new Role("user", "USERS");
//        Role admRole = new Role("admin", "MANAGERS");
//        if(user==null){
//            user = new User();
//            user.setName("ADMIN");
//            user.setUsername("admin");
//            user.setPassword("master123");
//            user.getRoles().add(admRole);
//            userRepository.save(user);
//        }
//        user = userRepository.findByUsername("user");
//        if(user ==null){
//            user = new User();
//            user.setName("USER");
//            user.setUsername("user");
//            user.setPassword("user123");
//            user.getRoles().add(usrRole);
//            userRepository.save(user);
//        }
    }
    
    
}