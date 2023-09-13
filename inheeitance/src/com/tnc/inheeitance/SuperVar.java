package com.tnc.inheeitance;

class base 
{
	int a=10;
}
class derived extends base
{
	int a=20;
	void show()
	{
		System.out.println(super.a);
		System.out.println(a);
	}
}
public class SuperVar 
{

	public static void main(String[] args)
	{
		derived obj=new derived();
		obj.show();
	}

}
