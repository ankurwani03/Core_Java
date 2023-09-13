package com.tnc.inheeitance;


class Super
{
	void input()
	{
		System.out.println("Enter your name");
	}
}
class Sub1 extends Super
{
	void show()
	{
		System.out.println("My name is Tom");
	}
}
class Sub2 extends Super
{
	void display()
	{
		System.out.println("My name is Jerry");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Sub1 obj1=new Sub1();
		obj1.input();
		obj1.show();
		
		Sub2 obj=new Sub2();
		obj.input();
		obj.display();
	}
}

