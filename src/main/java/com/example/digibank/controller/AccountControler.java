package com.example.digibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.digibank.models.Account;
import com.example.digibank.models.transactions.*;
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
	
	@PostMapping("/processCredit")
	public void processCredit(@RequestBody AccountTransaction accountTransaction ) { 
		/* Todo: certificar-se de que value eh positivo */
		Account account = 
				accountRepository.
				findByBranch_IDAndAccNumber(accountTransaction.getBranch_ID(), 
						accountTransaction.getAccNumber());
				/**/
		account.processCredit(accountTransaction.getValue());
		accountRepository.save(account);
	}
	
	@PostMapping("/processDebit")
	public void processDebit(@RequestBody AccountTransaction accountTransaction ) { 		
		Account account = 
				accountRepository.
				findByBranch_IDAndAccNumber(accountTransaction.getBranch_ID(), 
						accountTransaction.getAccNumber());
				/**/
		account.processDebit(accountTransaction.getValue());
		accountRepository.save(account);
	}
	
}
