package com.demo.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

// WEEK 4 DAY 1

public class SelectStatement {
	public static void main(String[] args) {
		
//		findAll();
		searching();
	}

	private static void searching() {
		try {
			
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection with db url
			// "<protocol>:<sub-protocol>://<server>:<port>/DBNAME", "root", "password" 
			Connection mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA", "root", "Prata@123");
			
			String searchString = "%len%"; // % means wildcard - refer to mygithub/learningsql notes
			
			// create statement for query
			String selectQuery = "SELECT ACTOR_ID,FIRST_NAME, LAST_NAME FROM ACTOR WHERE FIRST_NAME LIKE '" + searchString + "'"; 
			Statement selectStatement = mySqlConnection.createStatement();
			
			// execute query && get results
			ResultSet actorResultSet = selectStatement.executeQuery(selectQuery);
			
			// iterate through result and display
			while(actorResultSet.next() ) {
				int actorID = actorResultSet.getInt("ACTOR_ID");
				String firstNameString = actorResultSet.getString("FIRST_NAME");
				String lastNameString = actorResultSet.getString("LAST_NAME");
				System.err.println(actorID + "\t" + firstNameString + "\t" + lastNameString);
			}
			
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver cannot load. Check jdbc lib config");
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection: " + sqlException);
		}
	}
	
	private static void findAll() {
		try {
			
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish connection with db url
			// "<protocol>:<sub-protocol>://<server>:<port>/DBNAME", "root", "password" 
			Connection mySqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SAKILA", "root", "Prata@123");
			
			// create statement for query
			String selectQuery = "SELECT ACTOR_ID,FIRST_NAME, LAST_NAME FROM ACTOR"; 
			Statement selectStatement = mySqlConnection.createStatement();
			
			// execute query && get results
			ResultSet actorResultSet = selectStatement.executeQuery(selectQuery);
			
			// iterate through result and display
			while(actorResultSet.next() ) {
				int actorID = actorResultSet.getInt("ACTOR_ID");
				String firstNameString = actorResultSet.getString("FIRST_NAME");
				String lastNameString = actorResultSet.getString("LAST_NAME");
				System.err.println(actorID + "\t" + firstNameString + "\t" + lastNameString);
			}
			
		} catch (ClassNotFoundException classNotFoundException) {
			System.err.println("Driver cannot load. Check jdbc lib config");
		} catch (SQLException sqlException) {
			System.err.println("Error establishing connection: " + sqlException);
		}
	}

}
