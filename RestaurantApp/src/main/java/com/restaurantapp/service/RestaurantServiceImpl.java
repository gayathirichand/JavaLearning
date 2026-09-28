package com.restaurantapp.service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.restaurantapp.dao.IRestaurantDao;
import com.restaurantapp.dao.RestaurantDaoImpl;
import com.restaurantapp.exception.RestaurantNotFoundException;
import com.restaurantapp.model.Restaurant;

public class RestaurantServiceImpl implements IRestaurantService {
	private IRestaurantDao restaurantDao = new RestaurantDaoImpl();

	@Override
	public void addRestaurant(Restaurant restaurant) {
		restaurantDao.addRestaurant(restaurant);
	}

	@Override
	public void updateRestaurant(int restaurantId, double cost) {
		restaurantDao.updateRestaurant(restaurantId, cost);

	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		restaurantDao.deleteRestaurant(restaurantId);

	}

	@Override
	public Restaurant getById(int restaurantId) {
		Restaurant Restaurant = restaurantDao.findById(restaurantId);
		return Restaurant;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		// call the method dao

		List<Restaurant> Restaurants = restaurantDao.findAllRestaurant();
		// sort by name, change the name to Upper case and print it
		List<Restaurant> RestaurantList = Restaurants.stream()
				.sorted(Comparator.comparing(Restaurant::getRestaurantName)).map(restaurant -> {
					restaurant.setRestaurantName(restaurant.getRestaurantName().toUpperCase());
					return restaurant;
				}).collect(Collectors.toList());

		return RestaurantList;
	}

	@Override
	public List<Restaurant> getByCuisineLesserCost(String cuisine, double cost) {

		List<Restaurant> Restaurants = restaurantDao.findByCuisineLesserCost(cuisine, cost);
		if (Restaurants == null || Restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("No restaurant found");
		}
		return Restaurants;
	}

	@Override
	public List<Restaurant> getByTypeLesserCost(String type, double cost) {
		List<Restaurant> Restaurants = restaurantDao.findByTypeLesserCost(type, cost);
		if (Restaurants == null || Restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("No restaurant found");
		}
		return Restaurants;
	}

	@Override
	public List<Restaurant> getByTime(LocalDateTime availabilityTime) {
		List<Restaurant> Restaurants = restaurantDao.findByTime(availabilityTime);
		if (Restaurants == null || Restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("No restaurant found");
		}
		return Restaurants;
	}

	@Override
	public List<Restaurant> getByRatingsAndType(String type, int ratings) {
		List<Restaurant> Restaurants = restaurantDao.findByRatingsAndType(type, ratings);
		if (Restaurants == null || Restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("No restaurant found");
		}
		return Restaurants;
	}

	@Override
	public List<Restaurant> getByCity(String city) {
		List<Restaurant> Restaurants = restaurantDao.findByCity(city);
		if (Restaurants == null || Restaurants.isEmpty()) {
			throw new RestaurantNotFoundException("No restaurant found");
		}
		return Restaurants;
	}

}
