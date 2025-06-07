package exception.com;

public class UncoughtException {

	public static void main(String[] args)
	{
		try
		{
			int x=10/0;
			System.out.println(x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("connot divide by zero");
		}

	}

}
