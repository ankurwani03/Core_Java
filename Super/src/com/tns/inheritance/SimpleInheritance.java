package com.tns.inheritance;

class student
{
	int rollno,marks;
	String name;
	void input ()
	{
		System.out.println("Enter rollno,name & marks");
	}
}

class Tom extends student
{
	void display()
	{
		rollno=1;
		name="Tom";
		marks=89;
		System.out.println(rollno + " " + name+ " " + marks);
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		Tom obj = new Tom();
		obj.input();
		obj.display();
	}

}
