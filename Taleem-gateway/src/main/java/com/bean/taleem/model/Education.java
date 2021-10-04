package com.bean.taleem.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
	
	private Integer educationId;
	private String institutionName;
	private String campus;

	@JsonIgnoreProperties("education")
	private List<User> usersList = new ArrayList<>();
	
  
}
