package com.tns.Enums;

public class Demo {
	enum level
	{
		LOW, 
		MEDIUM,
		HIGH
	}

	public static void main(String[] args)
	{
		level x=level.LOW;
		System.out.println(x);
	}

}
