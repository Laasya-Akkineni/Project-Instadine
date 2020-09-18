package com.rest.dto;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@XmlRootElement
@Entity
public class Food {
	@Id@GeneratedValue
	private int foodId;
	private double price;
	private String foodName;
	private String category;
	private String imageName;
	
	
	@ManyToOne
	@JoinColumn(name = "restaurantId")
	//@JsonIgnore
	
	private Restaurant restaurant;
	public Food(int foodId, double price, String foodName, String category, String imageName, Restaurant restaurant) {
		super();
		this.foodId = foodId;
		this.price = price;
		this.foodName = foodName;
		this.category = category;
		this.imageName = imageName;
		this.restaurant = restaurant;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
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
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
	
	
	
	

}
