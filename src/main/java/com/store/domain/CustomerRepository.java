package com.store.domain;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID>{
	public List<Customer> findByLastName(@Param("lastName") String lastName);
	public Customer findByPersonalId(@Param("personalId") String personalId);
	public List<Customer> findByEmployee(@Param("employee") boolean employee);
}
