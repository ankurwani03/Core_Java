package com.tns.datetimeapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterDemo {

	public static void main(String[] args)
	{
		LocalDateTime y= LocalDateTime.now();
		System.out.println("Befor Formated "+ y);
		
		DateTimeFormatter x=DateTimeFormatter.ofPattern ("dd-MM-yyyy HH:mm:ss:ns");
		
		String a=y.format(x);
		System.out.println("After Formatted "+ a);
	}

}
