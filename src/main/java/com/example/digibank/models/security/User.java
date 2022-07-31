package com.example.digibank.models.security;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Entity
@Table(name = "User")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer ID;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 20, nullable = false)
    private String username;
    @Column(length = 100, nullable = false)
    private String password;
    
    @OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	@JsonIgnore
    private List<Role> roles;

    public User(){

    }
    public User(String username){
        this.username = username;
    }
	
    public void addRole(String roleName) {
    	Role role = new Role(this.username, roleName);
    	roles.add(role);
    }
    
}
