package com.bean.taleem.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="application")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EnableJpaAuditing
public class Application {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer appId;


	@Temporal(TemporalType.DATE)
	private Date applyDate;

	
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	
	public enum Status {
	    OPEN, REVIEW, APPROVED, REJECTED;
	}

}