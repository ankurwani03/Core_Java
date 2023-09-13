package com.tns.inheritance;
class Demo
{
	int x=100;
}
class Main extends Demo
{
	int x=200;
	void display()
	{
		System.out.println(super.x);
		System.out.println(x);
		
	}
}

public class SuperClassDemo {

	public static void main(String[] args) {
		Main obj=new Main();
		obj.display();
		
	}

}
