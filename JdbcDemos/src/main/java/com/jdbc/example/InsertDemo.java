package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "root";
		String query = """
				insert into employee values('Priya',1,'Banglore',25000)
				""";
		try (Connection connection = DriverManager.getConnection(url, username, password);
				Statement statement = connection.createStatement();)

		{
			// call execute() to execute query
			boolean rowInserted = statement.execute(query);
			for(int i =0 ; i< args.length;i++) {
				
			}
			
			System.out.println("Row Inserted " + !rowInserted);
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();// to track
		}
	}

}
