package com.company_service.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "BOD")
public class BOD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bodId;
	private String firstName;
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "companyId")
	private Company company;
}
