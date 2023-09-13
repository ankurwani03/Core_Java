package com.tns.Enums;
enum level
{
	LOW,
	MEDIUM,
	HIGH
}

public class Simple {

	public static void main(String[] args)
	{
		level x=level.MEDIUM;
		switch(x)
		{
		case LOW:
			System.out.println("LOW level");
			break;
		case MEDIUM:
			System.out.println("MEDIUM level");
			break;
		case HIGH:
			System.out.println("HIGH level");
			
		}
	}

}
