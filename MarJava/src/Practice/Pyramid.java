package Practice;
import java.util.Scanner;
public class Pyramid {
public static void main(String[] args) {
//	Scanner scn =new Scanner(System.in);
	System.out.println("Enter rows :");
	int rows=new Scanner(System.in).nextInt();
	for (int i=rows;i>0;i--) {
		for (int j=1;j<=i;j++) {
			System.out.print(" "+"*");
		}
		System.out.println();
	}
}
}
