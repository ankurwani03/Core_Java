package com.tnc.annotation;

class A
{
	void m()
	{
		System.out.println("this is the method m");
	}
	@Deprecated
	void n()
	{
		System.out.println("this is the method n");
	}
}
public class TestAnnotation3
{

	public static void main() 
	{
		A obj=new A();
		obj.m();
		obj.n();
	}

}
