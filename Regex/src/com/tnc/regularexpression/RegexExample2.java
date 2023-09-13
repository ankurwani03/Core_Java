package com.tnc.regularexpression;

import java.util.regex.Pattern;

public class RegexExample2 {

	public static void main(String[] args)
	{
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "ag"));
		System.out.println(Pattern.matches(".s", "asy"));
		System.out.println(Pattern.matches(".s", "amms"));
		System.out.println(Pattern.matches(".s", "mas"));
	}

}
