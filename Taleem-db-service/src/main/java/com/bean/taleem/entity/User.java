package com.bean.taleem.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EnableJpaAuditing
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;
	private String username;
	private String passwored;
	private String email;
	private String contact;
	private String address;
	


	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	@JoinTable(
			  name = "user_bundle", 
			  joinColumns = @JoinColumn(name = "user_id"), 
			  inverseJoinColumns = @JoinColumn(name = "bundle_id"))
	@JsonIgnoreProperties("users")
	private Bundle bundle;

	@ToString.Exclude
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_education", 
			  joinColumns = @JoinColumn(name = "user_id"), 
			  inverseJoinColumns = @JoinColumn(name = "education_id"))
	@JsonIgnoreProperties("usersList")
	private Education education;
	

}