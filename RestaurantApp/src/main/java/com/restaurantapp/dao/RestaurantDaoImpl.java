package com.restaurantapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.restaurantapp.model.Restaurant;
import com.restaurantapp.util.Queries;
import com.restaurantapp.util.RestaurantConnect;

public class RestaurantDaoImpl implements IRestaurantDao {
	@Override
	public void addRestaurant(Restaurant restaurant) {
		// get the connection object
		Connection connection = RestaurantConnect.openConnection();
		// create a prepared statement
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);) {
			// set the values
			preparedStatement.setString(1, restaurant.getRestaurantName());
			preparedStatement.setString(2, restaurant.getCity());
			preparedStatement.setString(3, restaurant.getCuisine());
			preparedStatement.setString(4, restaurant.getType());
			preparedStatement.setDouble(5, restaurant.getCostForTwo());
			// convert local time to time of database
			preparedStatement.setObject(6, restaurant.getOpeningTime());
			preparedStatement.setObject(7, restaurant.getClosingTime());
			preparedStatement.setInt(8, restaurant.getRatings());

			// call execute
			int updatedCount = preparedStatement.executeUpdate();
			System.out.println("Inserted row count " + updatedCount);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateRestaurant(int restaurantId, double cost) {

		// get the connection object
		Connection connection = RestaurantConnect.openConnection();
		// create a prepared statement
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			// set the values
			preparedStatement.setDouble(1, cost);
			preparedStatement.setInt(2, restaurantId);
			// call execute
			int updatedCount = preparedStatement.executeUpdate();
			System.out.println("Updated row count " + updatedCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void deleteRestaurant(int restaurantId) {
		Connection connection = RestaurantConnect.openConnection();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEBYID);) {
			preparedStatement.setInt(1, restaurantId);
			int deletedRowCount = preparedStatement.executeUpdate();
			System.out.println("Deleted row count " + deletedRowCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Restaurant findById(int restaurantId) {
		Connection connection = RestaurantConnect.openConnection();
		Restaurant restaurantById = new Restaurant();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.FINDBYID);) {
			preparedStatement.setInt(1, restaurantId);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// create a restaurant object
				restaurantById = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// and set it
				restaurantById.setRestaurantName(restaurantName);
				restaurantById.setRestaurantId(rs.getInt(2));
				restaurantById.setCity(rs.getString("city"));
				restaurantById.setCuisine(rs.getString("cuisine"));
				restaurantById.setType(rs.getString(5));
				restaurantById.setCostForTwo(rs.getDouble(6));
				restaurantById.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurantById.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurantById.setClosingTime(closingTime);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return restaurantById;
	}

	@Override
	public List<Restaurant> findAllRestaurant() {
		// create a temp list
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		// get the connection object
		Connection connection = RestaurantConnect.openConnection();
		// create a prepared statement
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLQUERY);) {
			// set the values
			ResultSet rs = preparedStatement.executeQuery();

			// iterate
			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// and set it
				restaurant.setRestaurantName(restaurantName);
				restaurant.setRestaurantId(rs.getInt(2));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCuisine(rs.getString("cuisine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add temp list into a list and return it
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return restaurants;
	}

	@Override
	public List<Restaurant> findByCuisineLesserCost(String cuisine, double cost) {
		List<Restaurant> restaurants = new ArrayList<Restaurant>();

		Connection connection = RestaurantConnect.openConnection();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.CUISINEBYLESSERCOST);) {
			preparedStatement.setString(1, cuisine);
			preparedStatement.setDouble(2, cost);
			ResultSet rsCostLesser = preparedStatement.executeQuery();
			while (rsCostLesser.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rsCostLesser.getString(1);
				// and set it
				restaurant.setRestaurantName(restaurantName);
				restaurant.setRestaurantId(rsCostLesser.getInt(2));
				restaurant.setCity(rsCostLesser.getString("city"));
				restaurant.setCuisine(rsCostLesser.getString("cuisine"));
				restaurant.setType(rsCostLesser.getString(5));
				restaurant.setCostForTwo(rsCostLesser.getDouble(6));
				restaurant.setRatings(rsCostLesser.getInt("ratings"));
				LocalTime openingTime = rsCostLesser.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rsCostLesser.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add temp list into a list and return it
				restaurants.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		return restaurants;
	}

	@Override
	public List<Restaurant> findByTypeLesserCost(String type, double cost) {

		Connection connection = RestaurantConnect.openConnection();
		List<Restaurant> restaurantByType = new ArrayList<Restaurant>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.FINDBYTYPELESSERCOST);) {
			preparedStatement.setString(1, type);
			preparedStatement.setDouble(2, cost);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// and set it
				restaurant.setRestaurantName(restaurantName);
				restaurant.setRestaurantId(rs.getInt(2));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCuisine(rs.getString("cuisine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add temp list into a list and return it
				restaurantByType.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return restaurantByType;
	}

	@Override
	public List<Restaurant> findByTime(LocalDateTime availabilityTime) {

		Connection connection = RestaurantConnect.openConnection();
		List<Restaurant> restaurantByTime = new ArrayList<Restaurant>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.FINDBYTIME);) {
			preparedStatement.setObject(1, availabilityTime);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// and set it
				restaurant.setRestaurantName(restaurantName);
				restaurant.setRestaurantId(rs.getInt(2));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCuisine(rs.getString("cuisine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add temp list into a list and return it
				restaurantByTime.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return restaurantByTime;
	}

	@Override
	public List<Restaurant> findByRatingsAndType(String type, int ratings) {

		Connection connection = RestaurantConnect.openConnection();
		List<Restaurant> restaurantByRatingAndType = new ArrayList<Restaurant>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.FINDBYRATINGSANDTYPE);) {
			preparedStatement.setString(1, type);
			preparedStatement.setInt(2, ratings);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// and set it
				restaurant.setRestaurantName(restaurantName);
				restaurant.setRestaurantId(rs.getInt(2));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCuisine(rs.getString("cuisine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add temp list into a list and return it
				restaurantByRatingAndType.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return restaurantByRatingAndType;
	}

	@Override
	public List<Restaurant> findByCity(String city) {

		Connection connection = RestaurantConnect.openConnection();
		List<Restaurant> restaurantByCity = new ArrayList<Restaurant>();
		try (PreparedStatement preparedStatement = connection.prepareStatement(Queries.FINDBYCITY);) {
			preparedStatement.setString(1, city);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// create a restaurant object
				Restaurant restaurant = new Restaurant();
				// get the columns
				String restaurantName = rs.getString(1);
				// and set it
				restaurant.setRestaurantName(restaurantName);
				restaurant.setRestaurantId(rs.getInt(2));
				restaurant.setCity(rs.getString("city"));
				restaurant.setCuisine(rs.getString("cuisine"));
				restaurant.setType(rs.getString(5));
				restaurant.setCostForTwo(rs.getDouble(6));
				restaurant.setRatings(rs.getInt("ratings"));
				LocalTime openingTime = rs.getObject("opening_time", LocalTime.class);
				restaurant.setOpeningTime(openingTime);
				LocalTime closingTime = rs.getObject(8, LocalTime.class);
				restaurant.setClosingTime(closingTime);
				// add temp list into a list and return it
				restaurantByCity.add(restaurant);

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return restaurantByCity;
	}

}
