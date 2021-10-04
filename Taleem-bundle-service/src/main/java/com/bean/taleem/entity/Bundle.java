package com.bean.taleem.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bundle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bundle {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bundle_id")
	private Integer bundleId;
	private String bundleName;
	private Double bundlePrice;
	private String duration;
	private String network;
	
//	@ManyToMany(mappedBy = "bundlesSet")
//	@JsonIgnoreProperties("bundlesSet")
//	private Set<User> users = new HashSet<>() ;

	@OneToMany(cascade = CascadeType.ALL,mappedBy="bundle", fetch = FetchType.EAGER)
	@JsonIgnoreProperties("bundle")
	private List<User> users;
	
		
}