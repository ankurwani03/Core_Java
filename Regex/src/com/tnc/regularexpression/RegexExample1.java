package com.tnc.regularexpression;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import java.util.regex.*;

public class RegexExample1 {

	public static void main(String[] args)
	{
		//first way
		Pattern a=Pattern.compile(".s");
		Matcher b=a.matcher("as");
		boolean b1=b.matches();
		System.out.println(b1); 
		
		//second way
		boolean b2=Pattern.compile(".s").matcher("ac").matches();
		System.out.println(b2);
		
		//third way
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b3);
	}

}
