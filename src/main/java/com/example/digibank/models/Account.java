package com.example.digibank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(nullable=false)
	private Long clientID;
	
	@Column(nullable=false)
	private Long branchID;
	
	@Column(nullable=false)
	private Long accNumber;
	
	@Column(nullable=false)
	private int accountType; 			//Poupança? Corrente? 
	
	@Column(nullable = false)
	private Float currentBalance;		//saldo atual.
	
	
	
}
