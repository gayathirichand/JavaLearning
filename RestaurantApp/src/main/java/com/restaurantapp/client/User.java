package com.restaurantapp.client;

import java.awt.Window.Type;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import com.restaurantapp.model.Cuisine;
import com.restaurantapp.model.Restaurant;
import com.restaurantapp.model.RestaurantType;
import com.restaurantapp.service.IRestaurantService;
import com.restaurantapp.service.RestaurantServiceImpl;

public class User {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant("Arabian Delight", 250, Cuisine.CH.getCuisinetype(),
				RestaurantType.NONVEG.name(), 4, "Coimbatore", LocalTime.of(11, 0), LocalTime.of(11, 0));

		IRestaurantService restaurantService = new RestaurantServiceImpl();
		// call the method
		System.out.println("Adding a Restaurant");

		// restaurantService.addRestaurant(restaurant);
		System.out.println();

		// update the restaurant
		System.out.println("Updating a Restaurant");
		restaurantService.updateRestaurant(1, 250);
		System.out.println();

		// delete by id
		System.out.println("Deleting a Restaurant by ID");
		restaurantService.deleteRestaurant(5);
		System.out.println();

		// get by id
		System.out.println("Getting a Restaurant by ID");
		Restaurant restaurantById = restaurantService.getById(1);
		System.out.println(restaurantById);
		System.out.println();

		// get all restaurant
		System.out.println("Getting all Restaurant by ID");
		restaurantService.getAllRestaurant().forEach(System.out::println);
		System.out.println();

		// get restaurant by lesser price
		System.out.println("Getting  Restaurant by Cuisine and Lesser Cost");
		restaurantService.getByCuisineLesserCost(Cuisine.SI.getCuisinetype(), 299).forEach(System.out::println);
		System.out.println();

		// get by type with lesser cost
		System.out.println("Getting  Restaurant by Type and Lesser Cost");
		restaurantService.getByTypeLesserCost(RestaurantType.VEG.toString(), 500).forEach(System.out::println);
		System.out.println();

		// get by time
		System.out.println("Getting  Restaurant by Time");
		restaurantService.getByTime(LocalDateTime.of(2026, 9, 26, 8, 0, 0)).forEach(System.out::println);
		System.out.println();

		// get by rating and time
		System.out.println("Getting  Restaurant by Time and Rating");
		restaurantService.getByRatingsAndType(RestaurantType.NONVEG.toString(), 4).forEach(System.out::println);
		System.out.println();

		// get by city
		System.out.println("Getting  Restaurant by City");
		restaurantService.getByCity("Chennai").forEach(System.out::println);
		System.out.println();

	}
}
