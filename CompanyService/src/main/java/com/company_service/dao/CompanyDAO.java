package com.company_service.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company_service.model.Company;

@Repository
public interface CompanyDAO extends CrudRepository<Company, Integer>{
	Optional<Company> findByCompanyName(String companyName);
	List<Company> findAll();
}
