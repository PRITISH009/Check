package com.company_service.dao;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company_service.model.BOD;

@Repository
public interface BoDDAO extends CrudRepository<BOD, Integer>{
	@Query(nativeQuery = true, value="Select * from bod where company_id = 1")
	ArrayList<BOD> findAllByCompanyId();
}
