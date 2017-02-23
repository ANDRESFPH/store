package com.store.domain;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(indexes = {
		@Index(columnList = "purchase_date", name = "purchase_date_index", unique = false)
		})
public class Invoice {
	
	public Invoice() {
		this.id = UUID.randomUUID();
	}
	
	@Id
	@Type(type="org.hibernate.type.PostgresUUIDType")
	private UUID id;
	private int discountPercentage;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="purchase_date")
	private Date purchaseDate;
	private double totalCost;
	private int taxPercentage;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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
