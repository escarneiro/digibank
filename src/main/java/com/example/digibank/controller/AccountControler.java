package com.example.digibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.digibank.models.Account;
import com.example.digibank.repository.AccountRepository;


@RestController
@RequestMapping("/account")
public class AccountControler {
	
	@Autowired
	private AccountRepository accountRepository;

	@GetMapping("/getAccountsByClient/{client_ID}")
	public List<Account> getClientsAccounts(@PathVariable("client_ID") Long client_ID ){
		return accountRepository.findByClient_ID(client_ID);
	}
	
}
