package javaInterview_Naveen;

public class Swap_2String_wothout_using_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Java";
		String b="Python";
		
		a=a+b; //a=cocacola
		
		
		
		b=a.substring(0, a.length()-b.length());//b=coca
		
		a=a.substring(b.length());
		
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		
		
	

	}

}
