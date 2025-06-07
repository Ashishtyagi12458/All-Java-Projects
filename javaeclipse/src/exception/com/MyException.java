package exception.com;

public class MyException extends Exception
{
	String msg;
	public MyException(String msg)
	{
		super();
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	

}
