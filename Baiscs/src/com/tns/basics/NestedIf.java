package com.tns.basics;

public class NestedIf {

	public static void main(String[] args)
	{
		int a=30,b=20;
		if (a==30)
		{
			if(b==10)
			{
				System.out.println("a==30 and b==20");
			}
			else
			{
				System.out.println("value of b is not equal to 20");
			}
		}
		else
		{
			System.out.println("a is not equal to 30 and b is not equal to 20");
		}
		
	}

}
