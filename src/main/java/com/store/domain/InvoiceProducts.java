package com.store.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(indexes = {
		@Index(columnList = "invoice_id", name = "invoice_id_index", unique = false)
		})
public class InvoiceProducts {
	
	public InvoiceProducts() {
		this.id = UUID.randomUUID();
	}
	
	@ManyToOne
	@JoinColumn(name = "id", insertable = false, updatable = false)
	private Product product;
	
	@Id
	@Type(type="org.hibernate.type.PostgresUUIDType")
	private UUID id;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_price")
	private double productPrice;
	
	@Column(name = "product_amount")
	private int productAmount;
	
	@Column(name = "invoice_id")
	private UUID invoiceId;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	public UUID getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(UUID invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	

}
