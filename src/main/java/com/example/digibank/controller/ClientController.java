package com.example.digibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.digibank.models.Client;
import com.example.digibank.repository.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/getAll")
	public List<Client> listAllClients(){
		return clientRepository.findAll();
	}
	
}
