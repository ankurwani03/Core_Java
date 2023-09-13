package com.tnc.inheeitance;

import java.util.Scanner;

class number 
{
	int a,b;
	void add()
	{
		System.out.println("addtion of two number is:"+(a+b));
	}
	void sub()
	{
		System.out.println("Substraction of two numkber is:"+(a-b));
	}
}
 class op extends number
 {
	 void mul()
	 {
		 System.out.println("Mutiplaction of two number is:"+(a*b));
	 }
	 void div()
	 {
		 System.out.println("Division of two mumber is:"+(a/b));
	 }
 }
 class rem extends op
 {
	 void remender()
	 {
		 System.out.println("Remender of two number is:"+(a%b));
	 }
 }

public class operation {
 
	public static void main(String[] args)
	{
		rem obj=new rem();
		Scanner sc=new Scanner(System.in);
		obj. a=sc.nextInt();
		obj. b=sc.nextInt();
		sc.close();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.remender();
		
	}

}
