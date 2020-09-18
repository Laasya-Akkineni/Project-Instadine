package com.rest.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@XmlRootElement
@Entity
public class OrderDetails {
	@Id@GeneratedValue
	private int id;
	private int foodId;
	private double price;
	private String foodName;
	private String category;
	private String imageName;
	private double totalPrice;
	private int quantity;
	private int restaurant;
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "orderId")
	//@JsonIgnore
	
	private Orders orders;

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int id, int foodId, double price, String foodName, String category, String imageName,
			double totalPrice, int quantity, int restaurant, Orders orders) {
		super();
		this.id = id;
		this.foodId = foodId;
		this.price = price;
		this.foodName = foodName;
		this.category = category;
		this.imageName = imageName;
		this.totalPrice = totalPrice;
		this.quantity = quantity;
		this.restaurant = restaurant;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

		public int getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(int restaurant) {
		this.restaurant = restaurant;
	}

/*	public Orders getOrders() {
		return orders;
	}*/

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
}
