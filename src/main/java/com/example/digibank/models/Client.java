package com.example.digibank.models;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Client {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long ID;
		
		@Column(nullable=false)
		private String fullName;
		
		private String addressLine1;
		private String addressLine2;
		private String zipCode;
		
		@OneToMany(mappedBy="client", fetch=FetchType.LAZY)
		@JsonIgnore
		private List<Account> accounts;
	
}
