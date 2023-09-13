package com.tns.inheritance;
 class A
{
	void run()
	{
		System.out.println("This is A class method");
	}
}
class B extends A
{
	}
public class FinalDemo {

	public static void main(String[] args) {
		A obj=new A();
		obj.run();

	}

}
