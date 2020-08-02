package com.company_service.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.company_service.dao.BoDDAO;
import com.company_service.dao.CompanyDAO;
import com.company_service.dao.SectorDAO;
import com.company_service.dto.BodDto;
import com.company_service.dto.CompanyDto;
import com.company_service.dto.SectorDto;
import com.company_service.mapper.CompanyServiceMapper;
import com.company_service.model.BOD;
import com.company_service.model.Company;
import com.company_service.model.Sector;
import com.company_service.shared.DetailsObject;

@Service
@EnableTransactionManagement
public class CompanyServiceImpl implements CompanyService{
	private CompanyDAO companyDao;
	private BoDDAO boDDao;
	private SectorDAO sectorDao;
	
	private CompanyServiceMapper mapper;
	
	@Autowired
	public CompanyServiceImpl(CompanyDAO companyDao, BoDDAO bodDoa, SectorDAO sectorDao, CompanyServiceMapper mapper) {
		this.companyDao = companyDao;
		this.boDDao = bodDoa;
		this.sectorDao = sectorDao;
		this.mapper = mapper;
	}
	
	@Transactional
	@Override
	public DetailsObject addNewCompany(DetailsObject companyDetails) {
	
		//Check if Company Already Exists
		if(companyDao.findByCompanyName(companyDetails.getCompanyDetails().getCompanyName()).isPresent()) {
			return null;
		}
		else {
			
			//Get Company, Sector and Board Of Directors Details from Details Object
			CompanyDto companyDto = companyDetails.getCompanyDetails();
			SectorDto sectorDto = companyDetails.getSectorDetails();
			ArrayList<BodDto> bodDtoList = companyDetails.getBodDetails();
			
			//Create an Entity Object of Company company and Sector sector and Set all the value of Sector Object to be referenced
			//in the Company Object to sector
			Company company = mapper.dtoToCompany(companyDto);
			Sector sector = sectorDao.findBySectorName(sectorDto.getSectorName()).get();
			company.setSector(sector);
			
			//Save the Company Details in the company Table
			companyDao.save(company);
			
			//Get Complete Company Object for referencing in the Board of Directors by company name from Database.
			Company completeCompanyObject = companyDao.findByCompanyName(company.getCompanyName()).get();
			
			//Create an Array List for Storing and Saving all the Board of Directors
			ArrayList<BOD> boardOfDirectors = new ArrayList<>();
			BOD director;
			
			//Loop Through all the Board of Directors Dto object, set company Reference and add it to List of Directors
			for(BodDto directorDto : bodDtoList) {
				director = mapper.dtoToBod(directorDto);
				director.setCompany(completeCompanyObject);
				boardOfDirectors.add(director);
			}
			//Save all the Board of Directors
			boDDao.saveAll(boardOfDirectors);
		}
		
		return companyDetails;
	}

	@Transactional
	@Override
	public DetailsObject getCompanyDetails() {
		BOD b1 = new BOD();
		BOD b2 = new BOD();
		
		b1.setFirstName("A");
		b2.setFirstName("A");
		
		System.out.println(b1.equals(b2));
		return null;
	}
	
	@Transactional
	@Override
	public DetailsObject updateCompanyDetails(DetailsObject companyDetails) {
		if(companyDao.findByCompanyName(companyDetails.getCompanyDetails().getCompanyName()).isPresent()) {
			
			//Update Company, then Update all the Board Members of the Company
			
			//Get Company, Sector and Board Of Directors Details from Details Object
			CompanyDto companyDto = companyDetails.getCompanyDetails();
			SectorDto sectorDto = companyDetails.getSectorDetails();
			ArrayList<BodDto> bodDtoList = companyDetails.getBodDetails();
			
			//Get the Company Entity from the Database
			Company company = companyDao.findByCompanyName(companyDto.getCompanyName()).get();
			
//			//Check what has changed and Update the values
//			if(company.getCompanyTurnOver() != companyDto.getCompanyTurnOver())
//				company.setCompanyTurnOver(companyDto.getCompanyTurnOver());
//			
//			if(company.getWriteUp() != companyDto.getWriteUp())
//				company.setWriteUp(companyDto.getWriteUp());
//			
//			if(company.getCeo() != companyDto.getCeo())
//				company.setCeo(companyDto.getCeo());
//			
//			if(company.getSector().getSectorName() != sectorDto.getSectorName())
//				company.setSector(mapper.dtoToSector(sectorDto));
//			
//			//Save the Updated details in Company Table
//			companyDao.save(company);
			
			//Get a List of All the BODs
//			ArrayList<BodDto> oldDirectorsList = mapper.bodListToDto(boDDao.findAllByCompanyId());
//		
//			for(BodDto b : oldDirectorsList) {
//				System.out.println(b);
//			}
//			
//			
//			return companyDetails;
		}
		else {
			System.out.println("Executing Query");
			System.out.println(boDDao.findAllByCompanyId());
		}
		return null;
	}
	
}
