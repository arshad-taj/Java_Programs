package javaInterview_Naveen;

public class StringManipulation {

	public static void main(String[] args) {
		
		String s="global warming is real";
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.indexOf("a"));
		
		System.out.println(s.indexOf("is"));
		
		System.out.println(s.indexOf("a",5));
		
		System.out.println(s.substring(0,6));
		
		String[] str=s.split(" ");
		for(String ss:str)
		{
			System.out.println(ss);
		}

	}

}
