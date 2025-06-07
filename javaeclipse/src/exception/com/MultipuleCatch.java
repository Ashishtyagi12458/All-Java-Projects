package exception.com;

public class MultipuleCatch {

	public static void main(String[] args) {
	try
	{
		int x=100/2;
		String y="ashish";
		System.out.println(y.length());
		int arr[]=new int[9];
		arr[9]=200;
	}
	catch(ArithmeticException e)
	{
		System.out.println("cannot divide by zero");
		
	}
	catch(NullPointerException e) {
		System.out.println("String is null");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("index is out of range" );
		
	}
	}

}
