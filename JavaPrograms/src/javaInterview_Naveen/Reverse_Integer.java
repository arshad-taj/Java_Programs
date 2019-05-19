package javaInterview_Naveen;

public class Reverse_Integer {

	public static void main(String[] args) {
		// using algorithm
		
		long num=-1234;
		
		long rev=0;
		
		while(num!=0)
		{
			rev=rev * 10 + num % 10;
			num=num / 10;
			
		}
		System.out.println("Reverse number using algorithm: "+rev);
		//using StringBuffer
		long num1=1122334455;
		StringBuffer s=new StringBuffer(String.valueOf(num1));
		s=s.reverse();
		System.out.println("Reverse using StringBuffer :"+s);
		
		
		

	}

}
