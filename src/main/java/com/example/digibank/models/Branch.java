package com.example.digibank.models;

import java.util.List;

import javax.persistence.Column;

/* Representa a Agencia */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Branch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(nullable=false)
	private String description;
	private String addressLine1;
	private String addressLine2;
	
	
	@OneToMany(mappedBy="branch")
	@JsonIgnore
	private List<Account> accounts;
	
}
