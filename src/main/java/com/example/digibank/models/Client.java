package com.example.digibank.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Client {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long ID;
		
		@Column(nullable=false)
		private String fullName;
		
		private String addressLine1;
		private String addressLine2;
		private String zipCode;
	
}
