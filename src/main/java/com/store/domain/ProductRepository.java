package com.store.domain;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "roducts")
public interface ProductRepository extends PagingAndSortingRepository<Product, UUID>{

}
