
//Print string in reverse
package interview;

import java.util.Scanner;

public class RevString {
	
	public RevString() {
	}
	//RevString d=new RevString();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str1,str2="";
	Scanner scn=new Scanner(System.in);
	str1=scn.next();
	//System.out.println("String is\t:"+str1);
//	System.out.println(str1.length());
//	System.out.println(str1.charAt(0));
StringBuffer ss=new StringBuffer("qwerty");
ss.reverse();
System.out.println(ss);
	
	for (int i=str1.length()-1;i>=0;i--) {
//		System.out.print(str1.charAt(i));
		str2=str2+str1.charAt(i);
		
	}
	System.out.println(str2);
	scn.close();
}
}