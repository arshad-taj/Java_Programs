package javaInterview_Naveen;

public class PrimeNumber {
	
	public static boolean primeNum(int num) 
	{
		if (num<=1) {
			return false;
		}
		
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Given number is prime: "+primeNum(5));

		
	}

}
