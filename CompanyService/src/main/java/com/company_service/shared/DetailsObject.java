package com.company_service.shared;

import java.util.ArrayList;

import com.company_service.dto.BodDto;
import com.company_service.dto.CompanyDto;
import com.company_service.dto.SectorDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailsObject {
	private CompanyDto companyDetails;
	private ArrayList<BodDto> bodDetails;
	private SectorDto sectorDetails;
}
