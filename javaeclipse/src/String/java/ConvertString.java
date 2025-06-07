package String.java;

public class ConvertString 
{

	static public String replace(String s) {
		return s.toLowerCase();
	}
	
	
	public static void main(String[] args) 
	{

		String s1="Hello";
		String result=replace(s1);
		System.out.println(result);
	}

}
