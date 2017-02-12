package com.store.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, UUID>{
	public Invoice findByInvoiceNumber(@Param("invoiceNumber") String invoiceNumber);
	public List<Invoice> findByPurchaseDate(@Param("date") Date purchaseDate);
}
