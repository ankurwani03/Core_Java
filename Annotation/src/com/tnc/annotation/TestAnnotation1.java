package com.tnc.annotation;

class Animal
{
	void eatsomething()
	{
		System.out.println("Animal Eat something");
	}
}
class Dog extends Animal
{
	@Override
	void eatsomething()
	{
		System.out.println("Dog eat something");
	}
}
public class TestAnnotation1 
{

	public static void main(String[] args) 
	{ 
		Animal d=new Dog();
		d.eatsomething();
	}

}