package com.company_service.mapper;

import java.util.ArrayList;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company_service.dto.BodDto;
import com.company_service.dto.CompanyDto;
import com.company_service.dto.SectorDto;
import com.company_service.model.BOD;
import com.company_service.model.Company;
import com.company_service.model.Sector;
import com.company_service.shared.DetailsObject;

import lombok.Getter;
import lombok.Setter;

@Component
public class CompanyServiceMapper {
	
	private ModelMapper mapper = new ModelMapper();
	
	public ArrayList<BodDto> bodListToDto(ArrayList<BOD> bodList){
		ArrayList<BodDto> dtoList = new ArrayList<>();
		
		for(BOD bodObj : bodList) {
			dtoList.add(mapper.map(bodObj, BodDto.class));
		}
		
		return dtoList;
	}
	
	public Company dtoToCompany(CompanyDto companyDto) {
		return mapper.map(companyDto, Company.class);
	}
	
	public CompanyDto CompanyToDto(Company company) {
		return mapper.map(company, CompanyDto.class);
	}
	
	public Sector dtoToSector(SectorDto sectorDto) {
		return mapper.map(sectorDto, Sector.class);
	}
	
	public SectorDto sectorToDto(Sector sector) {
		return mapper.map(sector, SectorDto.class);
	}
	
	public BOD dtoToBod(BodDto bodDto) {
		return mapper.map(bodDto, BOD.class);
	}
	
	public BodDto BodToDto(BOD bod) {
		return mapper.map(bod, BodDto.class);
	}
}
