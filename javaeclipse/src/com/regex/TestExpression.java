package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestExpression 
{

	public static void main(String[] args)
	{

		Matcher m1=Pattern.compile("..a").matcher("asa");
		boolean n=m1.matches();
		System.out.println(n);

	}

}
