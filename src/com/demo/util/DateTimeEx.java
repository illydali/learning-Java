package com.demo.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;

public class DateTimeEx {
	public static void main(String[] args) {
		
//		dateAndTimes();
//		scanLegacyDate();
		scanDate();
	}
	
	private static void scanDate() {

		try (Scanner scanner = new Scanner(System.in)) {
			String stringFromDate = scanner.nextLine();
			// 07/06/2022
//			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//			LocalDate fromDate = LocalDate.parse(stringFromDate,dateTimeFormatter);
//			System.err.println(fromDate);

			// 2022-Jul-06
			DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
			LocalDate fromDate1 = LocalDate.parse(stringFromDate, dateTimeFormatter1);
			System.err.println(fromDate1);
		} catch (Exception e) {
			System.err.println("Error scanning ...." + e);
		}
	}
		
	
	private static void scanLegacyDate() {
		try (Scanner scanner = new Scanner(System.in)) {
			String stringFromDateString = scanner.nextLine();
			// 15/7/2022 
			// need check the format, for example when inserted as dd/mm/yyyy 
			// output becomes 15 Jan 00:07:00 -- minutes
			SimpleDateFormat simlDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date fromDate = simlDateFormat.parse(stringFromDateString);
			System.err.println(fromDate);
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}

	private static void dateAndTimes() {
		// storing date (yyyy-mm-dd)
		LocalDate today = LocalDate.now();
		System.err.println(today);
		
		
		// storing time UTC format 
		// (hh:mm:ss:ms)
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		// storing both date & time 
		LocalDateTime localDateTime = LocalDateTime.now();
		System.err.println(localDateTime);
		
		// formatting date and time
		DateTimeFormatter dateTimeFormatter = 
				DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss");
		String formattedDateTimeString = dateTimeFormatter.format(localDateTime);
		System.out.println(formattedDateTimeString);
		
		// shorthand for formatting - oneliner 
		System.err.println(DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss").format(LocalDateTime.now()));
	}
}
