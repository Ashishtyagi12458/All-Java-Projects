package exception.com;

public class testmulticatch
{

	public static void main(String[] args)
	{
		try
		{
		 int arr[]=new int[10];
		 arr[10]=100;
		 int a=10/0;
		 String name=null;
		 System.out.println(name.length());
		 
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("connot divided by zero");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("String is null");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index out of range..");
	}
        catch(Exception e)
		{
        	System.out.println("Program is Run");
        
        	
		}
		System.out.println("programer will contionus.."); 
		
	}
}

