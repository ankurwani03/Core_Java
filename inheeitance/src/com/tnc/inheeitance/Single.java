package com.tnc.inheeitance;

class Student
{
	int rollno,marks;
	String name;
	 void input()
	 {
		 System.out.println("Enter rollnumber,marks & name");
	 }
}

class ankur extends Student
{
	void display()
	{
		rollno=12;
		name="Ankur";
		marks=96;
		System.out.println(rollno+ " "+marks+" " +name);
	}
}
public class Single {

	public static void main(String[] args)
	{
		ankur obj = new ankur();
		obj.input();
		obj.display();
	}

}
