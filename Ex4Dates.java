package com.wall.steve.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class Ex4Dates {
	public static void main(String[] args) throws ParseException {
		//Pre-Java 8 ways of creating a specific date instance
		//#1 - java.util.Date constructor - deprecated
		Date nyeDate = new Date(2014, 12, 31);
		
		//#2 - Calendar.set
		Calendar cal = Calendar.getInstance();
		cal.set(2014, 12, 31);

		//#3 - Calendar.set
		cal.set(Calendar.YEAR, 2014);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DATE, 31);

		//#4 - Date Formatter
		String date = "12/31/2014";
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date nyeUsingDF = df.parse(date);

		//Java 8 - New java.time package
		LocalDate now = LocalDate.now();
		LocalDate nye = LocalDate.of(2014, Month.DECEMBER, 31);
		LocalDate later = nye.plusMonths(2);
		System.out.println(later.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		Period p = Period.ofMonths(6);
		System.out.println(nye.plus(p));
		
		Duration d = Duration.ofHours(5);
	}
}
