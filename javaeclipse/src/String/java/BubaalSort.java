package String.java;

public class BubaalSort 
{

	public static void main(String[] args)
	{
		int temp;
     int[] arr= {34,2,85,45,36};
     
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i]>arr[j]) {
    			 temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
    	System.out.println(arr[i]);
    	 
     }
     
	}

}
