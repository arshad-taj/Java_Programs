package Fibonacci;
import java.util.Scanner;
public class UsingWhileLoop_UptoGivenTerms {

	public static void main(String[] args) {
		int t1=0,t2=1,n,i=1;
		System.out.print("Enter number of terms :");
		n=new Scanner(System.in).nextInt();
		while(i<=n) {
			System.out.print(t1+" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
			i++;
			
		}

	}

}
