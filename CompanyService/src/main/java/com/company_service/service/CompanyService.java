package com.company_service.service;

import java.util.List;

import com.company_service.dto.BodDto;
import com.company_service.dto.CompanyDto;
import com.company_service.shared.DetailsObject;

public interface CompanyService {
	DetailsObject addNewCompany(DetailsObject companyDetails);
	DetailsObject getCompanyDetails();
	DetailsObject updateCompanyDetails(DetailsObject companyDetails);
	List<CompanyDto> findAllCompanies();
	List<BodDto> findAllBod();
}
