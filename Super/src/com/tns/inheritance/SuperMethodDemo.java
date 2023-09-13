package com.tns.inheritance;
class Base
{
	void show()
	{
		System.out.println("This is the base class method");
	}
}
class Derived extends Base
{
	void show()
	{
		super.show();
		System.out.println("This is the derived class method");
	}
}
public class SuperMethodDemo {

	public static void main(String[] args) {
		Derived obj=new Derived();
		obj.show();
		
	}

}
