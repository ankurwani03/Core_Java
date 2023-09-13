package com.tns.keyword;

final class A
{
	void run()
	{
		System.out.println("this is A class method");
	}
}
class B extends A
{
	void run()
	{
		System.out.println("This is B class method");
	}
}
public class FinalClass
{

	public static void main(String[] args) 
	{
		A obj = new A();
		obj.run();
	}

}
