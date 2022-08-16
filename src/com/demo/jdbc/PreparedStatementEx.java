package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class PreparedStatementEx {

	public static void main(String[] args) {
		
		statement();
		preparedStatement();
	}
	private static void preparedStatement() {
		try {
			
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection with db url
			// "<protocol>:<sub-protocol>://<server>:<port>/DBNAME", "root", "password" 
			Connection mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "Prata@123");
			
			// create insert statement
			int productId = 2;
			String productName = "Book";
			float price = 50.50f;
			// INSERT INTO PRODUCT VALUES (1, 'MAGAZINE',50.5);;

			String insertQueryString = "INSERT INTO PRODUCT (product_id, product_name, price) VALUES (?,?,?);";
			System.err.println(insertQueryString);
//			An object that represents a precompiled SQL statement. 
//			A SQL statement is precompiled and stored in a PreparedStatement object. This object can then be used to efficiently execute this statement multiple times. 
			PreparedStatement preparedStatement = mySqlConnection.prepareStatement(insertQueryString);
			// execute query + get results
			for (int i = 1001; i < 1101; i++) {
				productId = i;
				productName = "Book " + i;
				price = i;
				preparedStatement.setInt(1, productId);
				preparedStatement.setString(2, productName);
				preparedStatement.setFloat(3, price);
				int rowsAffected = preparedStatement .executeUpdate();
//			iterate and display result
				if (rowsAffected > 0) {
					System.err.println("Successfully Inserted record!");
				}
			}
			
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver cannot load. Check jdbc lib config");
		} catch (SQLIntegrityConstraintViolationException sqlIntegrityConstraintViolationException) {
			System.err.println("Duplicate id: " + sqlIntegrityConstraintViolationException);
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection: " + sqlException);
		}
	}

	private static void statement() {
		try {
			
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection with db url
			// "<protocol>:<sub-protocol>://<server>:<port>/DBNAME", "root", "password" 
			Connection mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "Prata@123");
			
			// create insert statement
			int productId = 101;
			String productName = "Lord of the rings";
			float  productPrice = 59.50f;
			
			// INSERT INTO PRODUCT VALUES (123, 'HARRY POTTER', 50.90);
			String insertQuery = "INSERT INTO PRODUCT VALUES (" + productId + ", '" + productName + "'," +  productPrice + ")"; 
			System.err.println(insertQuery);
			Statement selectStatement = mySqlConnection.createStatement();
			
			for(int i = 100;i <= 200; i ++) {
				productId = i;
				productName = "Book " + i;
				productPrice = i;
				insertQuery = "INSERT INTO PRODUCT VALUES (" + productId + ", '" + productName + "'," +  productPrice + ")"; 
			}
			
			int rowsAffected = selectStatement.executeUpdate(insertQuery);
			
			// iterate through result and display
			if(rowsAffected  > 0) {
				System.err.println("Successfully inserted record");
			
			}
			
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver cannot load. Check jdbc lib config");
		} catch (SQLIntegrityConstraintViolationException sqlIntegrityConstraintViolationException) {
			System.err.println("Duplicate id: " + sqlIntegrityConstraintViolationException);
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection: " + sqlException);
		}
	}

}
