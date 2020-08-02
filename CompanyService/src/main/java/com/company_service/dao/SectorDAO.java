package com.company_service.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company_service.model.Sector;

@Repository
public interface SectorDAO extends CrudRepository<Sector, Integer>{
	Optional<Sector> findBySectorName(String sectorName);
}
