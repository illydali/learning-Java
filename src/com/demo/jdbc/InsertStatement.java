package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class InsertStatement {

public static void main(String[] args) {
		
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
