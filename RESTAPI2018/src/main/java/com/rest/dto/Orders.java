package com.rest.dto;
//package com.dto;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@JsonIgnoreProperties(allowSetters = true, value = { "orderDetails" })
@XmlRootElement
@Entity

public class Orders {
	@Id@GeneratedValue
	private int orderId;
	private String orderType;
	private Date date;
	private Time time;
	private double amount;
	private int rating;
	
	@ManyToOne
	@JoinColumn(name = "restaurantId")
	//@JsonIgnore
	private Restaurant restaurant;
	
	@ManyToOne
	//@JsonIgnore
	//@JsonManagedReference(value="customer-orders")
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	@OneToMany(mappedBy="orders",fetch = FetchType.LAZY)
	private List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
	
	@OneToOne(mappedBy="orders",fetch = FetchType.LAZY)
	private BookingDetails bookingDetails;
	
	

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderId, String orderType, Date date, Time time, double amount, int rating, Restaurant restaurant,
			Customer customer, List<OrderDetails> orderDetails, BookingDetails bookingDetails) {
		super();
		this.orderId = orderId;
		this.orderType = orderType;
		this.date = date;
		this.time = time;
		this.amount = amount;
		this.rating = rating;
		this.restaurant = restaurant;
		this.customer = customer;
		this.orderDetails = orderDetails;
		this.bookingDetails = bookingDetails;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderType=" + orderType + ", date=" + date + ", time=" + time
				+ ", amount=" + amount + ", rating=" + rating + ", restaurant=" + restaurant + ", customer=" + customer
				+ ", orderDetails=" + orderDetails + ", bookingDetails=" + bookingDetails + "]";
	}


	
}
