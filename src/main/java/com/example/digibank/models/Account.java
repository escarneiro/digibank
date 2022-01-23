package com.example.digibank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
//	@Column(nullable=false)
//	private Long clientID;

	@ManyToOne   //Um cliente pode ter mais de uma conta
	@JoinColumn(name="client_ID",referencedColumnName="ID")
	private Client client;
	
//	@Column(nullable=false)
//	private Long branchID;

	@ManyToOne
	@JoinColumn(name="branch_ID",referencedColumnName="ID")
	private Branch branch;
	
	@Column(nullable=false)
	private Long accNumber;
	
	@Column(nullable=false)
	private int accountType; 			//Poupança? Corrente? 
	
	@Column(nullable = false)
	private Float currentBalance;		//saldo atual.
	
	/* Efetua crédito nesta conta */
	public int processCredit(Float amount) {
		this.currentBalance+=amount;
		return(0); //todo: codigos de erro.
	}
	
	/* Efetua debito nesta conta */
	public int processDebit(Float amount) {
		this.currentBalance-=amount;
		return(0);
	}
}
