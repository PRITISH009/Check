package com.company_service.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Sector {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sectorId;
	
	@Column(unique = true)
	private String sectorName;
	
	private String brief;
	
	@OneToMany(mappedBy = "sector")
	private List<Company> company;
}
