package interview;

public class CapitalLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello how are you";
		
		String s2="";
		
	
		
		
		
		for (int i=0;i<s1.length();i++)
		{	
			
			if((i+1)%3==0) 
			{
				s2=s1.replace(s1.charAt(i), Character.toUpperCase(s1.charAt(i)));
				s1=s2;
			}
		}
		
		System.out.println(s2);
	}

}
