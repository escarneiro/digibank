package com.example.digibank.models.security;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="Role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(nullable=false, name = "role_name")
	private String roleName;
	
	public Role() {
		
	}
	
	public Role(String user, String roleName) {
		this.user=new User(user);
		this.roleName=roleName;
	}
	
}
