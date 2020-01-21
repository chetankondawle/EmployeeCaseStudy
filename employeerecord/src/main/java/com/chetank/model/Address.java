package com.chetank.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity //Entity Class for hibernate to create Address table
public class Address {
	@Id //For Primary Key
	@GeneratedValue //For Autogenerated Value
	private Integer aid;
	@OneToOne(targetEntity=Employee.class,cascade=CascadeType.REMOVE)  
	private Employee employee;
	private String presentAdd;
	public Integer getAid() {
		return aid;
	}

	private Long contactNo;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getPresentAdd() {
		return presentAdd;
	}
	public void setPresentAdd(String presentAdd) {
		this.presentAdd = presentAdd;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", presentAdd=" + presentAdd + ", contactNo="
				+ contactNo + "]";
	}
	
	
}	