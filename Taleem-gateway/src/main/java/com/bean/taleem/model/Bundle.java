package com.bean.taleem.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bundle {

	
	private Integer bundleId;
	private String bundleName;
	private Double bundlePrice;
	private String duration;
	private String network;

	@JsonIgnoreProperties("bundle")
	private List<User> users;
	
		
}