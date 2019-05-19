package javaInterview_Naveen;

public class Missing_Num_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//u can find missing number by subtracting given num with expected one
		//eg: 12345 and 1245 here 4 is missing
		//1+2+3+4+5=15 | 1+2+4+5=12 
		//15-12=3 hence missing number is 3
		
		int a[] = {1,2,3,5};//array can be assigned both ways
		int[] b= {1,2,3,4,5};
		
		int sumOfa=0,sumOfb=0;
		
		
		for (int i=0;i<a.length;i++)
		{
			sumOfa=sumOfa+a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			sumOfb=sumOfb+b[i];
		}
		int missingNum=sumOfb-sumOfa;
		System.out.println("Missing number in a series is: "+missingNum);

	}

}
