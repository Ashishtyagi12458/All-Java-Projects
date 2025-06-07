package exception.com;

public class TestCustomException 
{
	static void validate(int age) throws MyException
	{
		if(age<18)
		{
			throw new MyException("you are not aibabal to vote");
		}
		else {
			System.out.println("you are abiable to vote");
		}
	}

	public static void main(String[] args) 
	{
	  try {
		  validate(19);
	  }
	  catch(Exception e){
		  System.out.println(e);
	  }
	  System.out.println("program will we continous...");

	}

}
