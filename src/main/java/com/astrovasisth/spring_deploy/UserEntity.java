package com.astrovasisth.spring_deploy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name= "userr")
public class UserEntity {

	@Id
	@GeneratedValue
	private String id;
	
	@Column
	private String name;
	
	@Column
	private Double age;
	
	@Column
	private String address;
	
}
