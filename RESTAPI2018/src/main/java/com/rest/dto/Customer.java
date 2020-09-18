package com.rest.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@XmlRootElement
@Entity
public class Customer {
	@Id@GeneratedValue
	private int customerId;
	private String fullName;
	private String email;
	private String password;
	private String phone;

	@OneToMany(mappedBy="customer",fetch = FetchType.LAZY)
	@Fetch(value = FetchMode.SUBSELECT)
	//@JsonBackReference
	private List<Orders> orderList = new ArrayList<Orders>();

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String fullName, String email, String password, String phone,
			List<Orders> orderList) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.orderList = orderList;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

/*	public List<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}*/
	

	
	
	
	
}
