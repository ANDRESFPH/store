package com.store.domain;

//import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "invoice_products", path = "invoice_products")
public interface InvoiceProductsRepository extends PagingAndSortingRepository<InvoiceProducts, UUID>{
//	public List<InvoiceProducts> findByInvoiceId(@Param("id") UUID invoiceId);

}
