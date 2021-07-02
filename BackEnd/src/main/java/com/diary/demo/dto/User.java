package com.diary.demo.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Data // ToString + NoArgsConstructor + Entity ...
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "id")
	private String id;
	
	private Timestamp createDate;
	
	private String email;
	
	private String password;
	
	private String role;
	
	private String username;
}
