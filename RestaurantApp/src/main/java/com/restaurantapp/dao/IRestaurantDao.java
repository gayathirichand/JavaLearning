package com.restaurantapp.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.restaurantapp.model.Restaurant;

public interface IRestaurantDao {
	// CRUD operation
	void addRestaurant(Restaurant restaurant);

	void updateRestaurant(int restaurantId, double cost);

	void deleteRestaurant(int restaurantId);

	Restaurant findById(int restaurantId);

	// by the user
	List<Restaurant> findAllRestaurant();

	List<Restaurant> findByCuisineLesserCost(String cuisine, double cost);

	List<Restaurant> findByTypeLesserCost(String type, double cost);

	List<Restaurant> findByTime(LocalDateTime availabilityTime);

	List<Restaurant> findByRatingsAndType(String type, int ratings);

	List<Restaurant> findByCity(String city);

}
