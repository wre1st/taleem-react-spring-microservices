package com.bean.taleem.entity;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="education")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EnableJpaAuditing
public class Education {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="education_id")
	private Integer educationId;

	@Column(name="institution_name")
	private String institutionName;
	
	@Column(name="campus")
	private String campus;
	

	@OneToMany(fetch = FetchType.EAGER, mappedBy="education", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("education")
	private List<User> usersList = new ArrayList<>();
	
  
}
