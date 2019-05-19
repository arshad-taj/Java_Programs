package javaInterview_Naveen;

import java.util.Arrays;
import java.util.Scanner;


public class Largest_Smallest_Num_in_Array {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);

	int[] num=new int[4];
	for (int i=0;i<num.length;i++)
	{
		num[i]=scn.nextInt();
	}

	int largest=num[0];
	int smallest=num[0];
	
	for (int i=0;i<num.length;i++) 
	{
		if(num[i]>largest)
		{
			largest=num[i];
		}
		else if(num[i]<smallest)
		{
			smallest=num[i];
		}
	}
	

	
	System.out.println("given array :"+Arrays.toString(num));
	System.out.println("Largest number :"+largest);
	System.out.println("Smallest number :"+smallest);
	
	
	

	}

}
