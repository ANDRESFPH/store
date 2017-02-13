package com.store.domain;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, UUID>{
	public List<Customer> findByLastName(@Param("lastName") String lastName);
	public Customer findByPersonalId(@Param("personalId") String personalId);
	public List<Customer> findByEmployee(@Param("employee") boolean employee);
}
