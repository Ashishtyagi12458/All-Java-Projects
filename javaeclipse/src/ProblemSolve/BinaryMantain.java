package ProblemSolve;

public class BinaryMantain {
	
	public static int  MantainPeak(int x[]) {
		int start=0;
		int end=x.length;
		while(start<end) {
			int mid=end+(start-end)/2;
			if(x[mid]<x[mid+1]) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,4,3,1};
		int x1=MantainPeak(arr);
		System.out.println(x1);

	}

}
