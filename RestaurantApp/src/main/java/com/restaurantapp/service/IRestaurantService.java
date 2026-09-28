package com.restaurantapp.service;

import java.time.LocalDateTime;
import java.util.List;

import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;

public interface IRestaurantService {

	// CRUD operation
	void addRestaurant(Restaurant restaurant);

	void updateRestaurant(int restaurantId, double cost);

	void deleteRestaurant(int restaurantId);

	Restaurant getById(int restaurantId);

	// by the user
	List<Restaurant> getAllRestaurant();

	List<Restaurant> getByCuisineLesserCost(String cuisine, double cost) throws RestaurantNotFoundException;

	List<Restaurant> getByTypeLesserCost(String type, double cost) throws RestaurantNotFoundException;

	List<Restaurant> getByTime(LocalDateTime availabilityTime) throws RestaurantNotFoundException;

	List<Restaurant> getByRatingsAndType(String type, int ratings) throws RestaurantNotFoundException;

	List<Restaurant> getByCity(String city) throws RestaurantNotFoundException;

}
