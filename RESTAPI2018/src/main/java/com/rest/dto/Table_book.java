package com.rest.dto;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@XmlRootElement
@Entity
public class Table_book {
	@Id@GeneratedValue
	private int tableId;
	private int availability;
	private Time bookingTime;
	
	
	@ManyToOne
	@JoinColumn(name = "restaurantId")
	//@JsonIgnore
	private Restaurant restaurant;


	public Table_book(int tableId, int availability, Time bookingTime, Restaurant restaurant) {
		super();
		this.tableId = tableId;
		this.availability = availability;
		this.bookingTime = bookingTime;
		this.restaurant = restaurant;
	}


	public Table_book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getTableId() {
		return tableId;
	}


	public void setTableId(int tableId) {
		this.tableId = tableId;
	}


	public int getAvailability() {
		return availability;
	}


	public void setAvailability(int availability) {
		this.availability = availability;
	}


	public Time getBookingTime() {
		return bookingTime;
	}


	public void setBookingTime(Time bookingTime) {
		this.bookingTime = bookingTime;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}


	
	
	
	
	

}
