package com.company_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
	private String companyName;
	private float companyTurnOver;
	private String writeUp;
	private String ceo;
}
