package Fibonacci;
import java.util.Scanner;
public class UsingWhileLoop_UptoGivenNumber {

	public static void main(String[] args) {
		//Fibonacci upto given number
		long term1=0,term2=1,num,sum;
		System.out.print("Enter the number :");
		Scanner scn=new Scanner(System.in);
		num=scn.nextLong();
		while (term1<=num) {
			System.out.print(term1+" ");
			sum=term1+term2;
			term1=term2;
			term2=sum;
		}
		scn.close();
	}

}
