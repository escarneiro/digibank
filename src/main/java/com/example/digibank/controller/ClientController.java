package com.example.digibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@PostMapping("/newClient")
	@ResponseStatus(HttpStatus.CREATED) /* Retorna http 201 ao invés de 200 */
	public Client newClient(@RequestBody Client client){
		return clientRepository.save(client);
	}
}
