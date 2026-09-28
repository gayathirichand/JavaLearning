package com.restaurantapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RestaurantConnect {
	static Connection connection;

	public static Connection openConnection() {
		String url = "jdbc:mysql://localhost:3306/restaurantdb";
		String username = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;

	}

	static void closeConnection() {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
