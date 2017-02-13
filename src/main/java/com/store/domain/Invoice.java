package com.store.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(indexes = {
		@Index(columnList = "invoice_number", name = "invoice_number_index", unique = true),
		@Index(columnList = "purchase_date", name = "purchase_date_index", unique = false)
		})
public class Invoice {
	
	public Invoice() {
		this.id = UUID.randomUUID();
	}
	
	@OneToMany
	@JoinColumn(name = "invoice_id")
	private List<InvoiceProducts> products;
	
	@Id
	@Type(type="org.hibernate.type.PostgresUUIDType")
	private UUID id;
	
	@Column(name="invoice_number")
	private String invoiceNumber;
	
	@Column(name="discount_percentage")
	private int discountPercentage;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="purchase_date")
	private Date purchaseDate;
	
	@Column(name="total_cost")
	private double totalCost;
	
	@Column(name="tax_percentage")
	private int taxPercentage;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public int getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(int taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	

}
