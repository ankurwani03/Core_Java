package com.tnc.inheeitance;
class Parent
{
	Parent()
	{
		System.out.println("this is parent constructor");
	}
}
// If parent class dose not contain any parameter then by default it will call both constructor 
//but if there is any parameter than we have to use the super keyword in the child class by the value
class Child extends Parent
{
	Child()
	{
		System.out.println("this is child constructor");
	}
}

public class SuperConstruct 
{

	public static void main(String[] args) 
	{
		Child obj=new Child();
		
	}

}
