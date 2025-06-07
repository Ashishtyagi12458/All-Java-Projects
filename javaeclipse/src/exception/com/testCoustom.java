package exception.com;

public class testCoustom 
{
	static void show(int roll)throws YouException
	{
		if(roll>30) {
			throw new YouException("then you are not seat in class");
		}
		else {
			System.out.println("you are seat in the class");
		}
	}

	public static void main(String[] args)
	{
	 try {
		 show(31);
	 }
	 catch(Exception e){
		 System.out.println(e);
		 
	 }
	}

}
