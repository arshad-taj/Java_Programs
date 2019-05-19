package Fibonacci;

import java.util.Scanner;

public class UsingForLoop_UptoGivenTerms {

	public static void main(String[] args) {
		//fibonacci upto given terms
		int term1=0,term2=1,num;
		System.out.print("Enter the number of terms :");
		num=new Scanner(System.in).nextInt();
		for (int i=1;i<=num;i++) {
			System.out.print(term1+" ");
			int sum=term1+term2;
			term1=term2;
			term2=sum;
			
		}
		
		
	}
}
