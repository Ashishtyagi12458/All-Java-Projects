package String.java;

public class StringTryBuffer {

	public static void main(String[] args)
	{
		StringBuffer name=new StringBuffer("ashish");
		System.out.println(name);
		System.out.println(name.insert(2, 123));
		System.out.println(name.reverse());
		System.out.println(name.replace(2, 5,"456"));
		System.out.println(name.capacity());
	}

}
