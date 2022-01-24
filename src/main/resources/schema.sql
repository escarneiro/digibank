

/* 	
*  
*  Esse script é rodado automaticamente pelo hibernate, se assim  
*  o dev desejar. É opcional pois  springboot/hibernate/jpa já 
*  criam o DB e tabelas automagicamente.
*
*  O dev pode renomear esse arquivo pra qualquer coisa, ou
*  mudar o valor do parametro 'hibernate.hbm2ddl.auto' pra 'none'
*  caso ele prefira deixar o sistema gerar.
*
*  Não funciona com o H2 (diferenças na sintaxe)
*
*/


CREATE DATABASE IF NOT EXISTS `digibank` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

CREATE TABLE IF NOT EXISTS `Client` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `addressLine1` varchar(255) DEFAULT NULL,
  `addressLine2` varchar(255) DEFAULT NULL,
  `fullName` varchar(255) NOT NULL,
  `zipCode` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;


CREATE TABLE IF NOT EXISTS `Branch` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `addressLine1` varchar(255) DEFAULT NULL,
  `addressLine2` varchar(255) DEFAULT NULL,
  `description` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;



CREATE TABLE IF NOT EXISTS `Account` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_ID` bigint(20) DEFAULT NULL,
  `accNumber` bigint(20) NOT NULL,
  `accountType` int(11) NOT NULL,
  `currentBalance` float NOT NULL,
  `client_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  FOREIGN KEY `FK_BRANCH` (`branch_ID`) REFERENCES Branch(ID),
  FOREIGN KEY `FK_CLIENT` (`client_ID`) REFERENCES Client (ID),
  UNIQUE KEY `UK_AG_ACC` (`branch_ID`,`accNumber`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

