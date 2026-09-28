package com.restaurantapp.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Restaurant {
	private String restaurantName;
	private Integer restaurantId;
	private double costForTwo; //CHINESE , SOUTH INDIAN, NORTH INDIAN
	private String cuisine;//VEG , NONVEG
	private String type;
	private int ratings;
	private String city;
    private LocalTime openingTime;
    private LocalTime closingTime;

	
	public Restaurant() {
		super();
	}

	public Restaurant(String restaurantName, double costForTwo, String cuisine, String type, int ratings, String city,
			LocalTime openingTime, LocalTime closingTime) {
		super();
		this.restaurantName = restaurantName;
		this.costForTwo = costForTwo;
		this.cuisine = cuisine;
		this.type = type;
		this.ratings = ratings;
		this.city = city;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	public Restaurant(String restaurantName, Integer restaurantId, double costForTwo, String cuisine, String type,
			int ratings, String city, LocalTime openingTime, LocalTime closingTime) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantId = restaurantId;
		this.costForTwo = costForTwo;
		this.cuisine = cuisine;
		this.type = type;
		this.ratings = ratings;
		this.city = city;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantName=" + restaurantName + ", restaurantId=" + restaurantId + ", costForTwo="
				+ costForTwo + ", cuisine=" + cuisine + ", type=" + type + ", ratings=" + ratings + ", city=" + city
				+ ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public double getCostForTwo() {
		return costForTwo;
	}

	public void setCostForTwo(double costForTwo) {
		this.costForTwo = costForTwo;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LocalTime getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}

	public LocalTime getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}

	
	
}
