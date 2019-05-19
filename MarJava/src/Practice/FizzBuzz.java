package Practice;
import java.util.Scanner;

class FizzBuzz {
	private static Scanner scn;

	public static void main (String[] gg) {
		scn = new Scanner (System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		if (num%3==0 && num%5==0) {
			System.out.println("Number in Fizz Buzz");
		}
		else if (num%3==0) {
			System.out.println("Number in Fizz");
		}
		else if (num%5==0) {
			System.out.println("Number is Buzz");
		}
		else {
			System.out.println("Number is neither fizz nor Buzz");
		}
	}

}

