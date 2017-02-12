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
		@Index(name = "personal_id_index", columnList = "personal_id", unique = true)
		})
public class Customer {
	
	@Id
	@Type(type="org.hibernate.type.PostgresUUIDType")
	private UUID id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="personal_id")
	private String personalId;
	
	private boolean employee;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date birthdate;
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	@Column(name="employee_discount")
	private int employeeDiscount;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public boolean isEmployee() {
		return employee;
	}
	public void setEmployee(boolean employee) {
		this.employee = employee;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getEmployeeDiscount() {
		return employeeDiscount;
	}
	public void setEmployeeDiscount(int employeeDiscount) {
		this.employeeDiscount = employeeDiscount;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
