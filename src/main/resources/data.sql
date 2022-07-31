INSERT INTO Branch (description , addressLine1 , addressLine2)
	VALUES ( 'Ag Default' , 'Rua Das Flores', '01' ) ; 
	
INSERT INTO Branch (description , addressLine1 , addressLine2)
	VALUES ( 'Ag Dois' , 'Rua Das Arvoes', '02' ) ; 
	
	
INSERT INTO Client (fullName , addressLine1, addressLine2, zipCode)
	VALUES ( 'Fulano' , 'Rua Dos Santos', '01', '41000-000' ) ; 
	
INSERT INTO Client (fullName , addressLine1, addressLine2, zipCode)
	VALUES ( 'Beltrano' , 'Rua Dos Anjos', '02', '42000-000' ) ; 
	
	
INSERT INTO Account (client_ID	, branch_ID, accNumber, accountType, currentBalance)
	VALUES ( 1 , 1, 1 , 1 , 10.0 ) ; 
	
INSERT INTO Account (client_ID, branch_ID, accNumber, accountType, currentBalance)
	VALUES ( 2 , 2 , 1 , 1 , 20.0 ) ; 	
	
	-- No encoding --
INSERT INTO User (name, password, username)
	VALUES ('USER','user123', 'user');
	
INSERT INTO User (name, password, username)
	VALUES ('ADMIN','master123', 'admin');
	
INSERT INTO Role(user_id, role_name)
	VALUES (1, 'USERS');
	
INSERT INTO Role(user_id, role_name)
	VALUES (2, 'MANAGERS');	
	