package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "root";
		String query = """
				create table employee(emp_name  varchar(20), emp_id int primary key,
				city varchar(20), salary float)
				""";
		Statement statement = null;
		Connection connection = null;
		try {
			// create a connection object
			connection = DriverManager.getConnection(url, username, password);
			// create a statement
			statement = connection.createStatement();
			// call execute() to execute query
			boolean tableCreated = statement.execute(query);
			System.out.println("Table Created " + !tableCreated);
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();//to track 
		} finally {
			try {
				if (statement != null)
					statement.close();
				if (connection != null)
					connection.close();

			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
