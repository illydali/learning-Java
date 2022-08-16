package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class DeleteStatement {

public static void main(String[] args) {
		
		try {
			
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection with db url
			// "<protocol>:<sub-protocol>://<server>:<port>/DBNAME", "root", "password" 
			Connection mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb", "root", "Prata@123");
			
			// create insert statement
			int productId = 101;
			String productName = "MAGAZINES";
			float  productPrice = 59.50f;
			
			// UPDATE PRODUCT SET PRODUCT_NAME = "HARRY POTTER" WHERE PRODUCT_ID = 123;
			String updateQueryString  = "UPDATE PRODUCT SET PRODUCT_NAME = '" + productName + "',PRICE = " + productPrice + " WHERE PRODUCT_ID = " +  productId; 
			System.err.println(updateQueryString);
			Statement selectStatement = mySqlConnection.createStatement();
			
			int rowsAffected = selectStatement.executeUpdate(updateQueryString);
			
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
