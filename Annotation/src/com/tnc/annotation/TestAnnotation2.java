package com.tnc.annotation;

import java.util.*;

public class TestAnnotation2
{
	public static void main(String []args)
	{
		ArrayList list=new ArrayList();
		list.add("peter");
		list.add("Tom");
		list.add("John");
		for (Object obj:list)
		{
			System.out.println(obj);
		}
	}

}
