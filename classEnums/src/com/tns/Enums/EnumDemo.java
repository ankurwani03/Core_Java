package com.tns.Enums;
enum Level
{
	LOW,
	MEDIUM,
	HIGH
}

public class EnumDemo {

	public static void main(String[] args)
	{
		for (Level x:Level.values())
		{
			System.out.println(x);
		}
	}

}
