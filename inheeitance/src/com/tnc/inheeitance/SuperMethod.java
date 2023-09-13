package com.tnc.inheeitance;


class Base1
{
	void display() 
	{
		System.out.println("This is super method");
	}
}
class Derived1 extends Base1
{
	void display()
	{
		super.display();
		System.out.println("This is sub class method ");
	}
}
public class SuperMethod 
{

	public static void main(String[] args) 
	{
		Derived1 obj=new Derived1();
		obj. display();
	}

}
