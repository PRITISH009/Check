package com.company_service.service;

import com.company_service.shared.DetailsObject;

public interface CompanyService {
	DetailsObject addNewCompany(DetailsObject companyDetails);
	DetailsObject getCompanyDetails();
	DetailsObject updateCompanyDetails(DetailsObject companyDetails);
}
