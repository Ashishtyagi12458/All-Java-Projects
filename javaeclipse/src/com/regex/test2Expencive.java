package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2Expencive {

	public static void main(String[] args) 
	{

		Pattern p=Pattern.compile("[a-zA-Z0-9]{3,10}");
		Matcher m=p.matcher("ashish123");
		boolean b1=m.matches();
		System.out.println(b1);
	}

}
