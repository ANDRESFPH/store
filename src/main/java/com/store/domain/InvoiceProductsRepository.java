package com.store.domain;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface InvoiceProductsRepository extends PagingAndSortingRepository<InvoiceProducts, UUID>{
	public List<InvoiceProducts> findByInvoiceId(@Param("id") UUID invoiceId);

}
