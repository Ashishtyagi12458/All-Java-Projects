package exception.com;

public class YouException extends Exception
{
	String cla;

	public YouException(String cla)
	{
		super();
		this.cla=cla;
		
	}

	@Override
	public String toString() {
		return cla;
	}

}
