import java.util.Scanner;

/*
 * Given number 1<=N<=1000000. Find the smallest palindrome and it should be 
 * prime from input.
 *  
 */
public class PalindromeNPrime {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		double num = scn.nextDouble();
		//boolean palindromeFlag = false;
		for (double i = num; i <= 1000000; i++) {
							
				if (verifyPrime(i))
				{
					if (palindrome(i)!=0)
					{
						System.out.println(palindrome(i));
						break;
					}
					
				}
		}
		

	}


	static boolean verifyPrime(double num) {
		boolean primeFlag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				primeFlag = true;
				break;
			}

		}

		if (primeFlag == true) {
			return true;
		} else {
			return false;
		}

	}
	
	static double palindrome (double inputNum) {
		
		double sum=0,remainder,temp;
		temp = inputNum;
		
		while(inputNum>0) {
			remainder = inputNum % 10;
			sum = (sum * 10)+remainder;
			inputNum = inputNum / 10;
		}
		if (temp==sum)
		{
			return inputNum;
		}
		else
		{
			return 0;
		}
	}

}
