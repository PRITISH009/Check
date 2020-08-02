package com.company_service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company_service.service.CompanyServiceImpl;
import com.company_service.shared.DetailsObject;

@RestController("/companies")
public class CompanyController {
	
	@Autowired
	private CompanyServiceImpl companyService;
	
	@RequestMapping(
			path = "/create",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetailsObject> addNewCompany(@RequestBody DetailsObject companyDetails){
		DetailsObject result = companyService.addNewCompany(companyDetails);
		if(result != null)
			return ResponseEntity.status(HttpStatus.CREATED).body(result);
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
	}
	
	@RequestMapping(
			path = "/update",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetailsObject> updateCompanyDetails(@RequestBody DetailsObject companyDetails){
		DetailsObject result = companyService.updateCompanyDetails(companyDetails);
		if(result != null)
			return ResponseEntity.status(HttpStatus.OK).body(companyService.updateCompanyDetails(companyDetails));
		else
			return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
	}
	
	@RequestMapping(
			path="/companies",
			method=RequestMethod.GET)
	public void getCompanyDetails() {
		companyService.getCompanyDetails();
	}
}
