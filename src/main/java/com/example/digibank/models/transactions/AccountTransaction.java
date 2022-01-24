package com.example.digibank.models.transactions;

import lombok.Data;


/**
 * Usado para realizar transações na conta - credito e débito
 * @author eder
 *
 */

@Data
public class AccountTransaction {
	
	Long  branch_ID; 
	Long  accNumber; 
	Float value;
}
