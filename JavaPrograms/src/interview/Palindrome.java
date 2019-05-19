package interview;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner scn=new Scanner(System.in);
		str1=scn.next();
		String str2="";// empty string
		System.out.println("String1 is\t:"+str1);
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);// concatenating str2 with the last character of str1;
		}
		System.out.println("String2 is\t:"+str2);
		if (str1.equals(str2)) {
			System.out.println("\nWord is Palindrome" );
		}
		else {
			System.out.println("\nWord is NOT Palindrome ");
		}
	}

}
