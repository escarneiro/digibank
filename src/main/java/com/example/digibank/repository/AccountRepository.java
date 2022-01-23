package com.example.digibank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.digibank.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>  {

	List<Account> findByClient_ID(Long client_ID);

}
