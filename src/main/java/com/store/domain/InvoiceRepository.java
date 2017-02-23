package com.store.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "invoice", path = "invoice")
public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, UUID>{
	public List<Invoice> findByPurchaseDate(@Param("date") Date purchaseDate);
}
