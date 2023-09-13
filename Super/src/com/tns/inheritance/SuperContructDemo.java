package com.tns.inheritance;
class Parent
{
	Parent(int a)
	{
		System.out.println("This is a parent contructor "+a);
	}
}
class Child extends Parent
{
	Child()
	{
		super(100);
		System.out.println("This is a child contructor ");
	}
}
public class SuperContructDemo {

	public static void main(String[] args) {
		Child obj=new Child();
	}

}
