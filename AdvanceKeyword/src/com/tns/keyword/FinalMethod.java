package com.tns.keyword;

class base
{
	final void run()
	{
		System.out.println("this is main class");
	}
}
class sub extends base
{
	void run()
	{
		//super.run();
		System.out.println("this is sub class");
	}
}
public class FinalMethod
{

	public static void main(String[] args) 
	{
		sub obj = new sub();
		obj.run();
	}

}
