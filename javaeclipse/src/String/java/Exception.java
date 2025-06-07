package String.java;
class Exception
{
  public static void main(String[] args)
{
  int a=7,b=0;
  int result;
  try
{
  result =a/b; 
}
catch(ArithmeticException e){
System.out.println("Cannot divide  by zero");
}
}
}
