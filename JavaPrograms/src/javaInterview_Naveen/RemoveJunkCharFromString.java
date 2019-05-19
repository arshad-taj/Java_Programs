package javaInterview_Naveen;

public class RemoveJunkCharFromString {

	public static void main(String[] args) {
		// By using regular expression we can remove junk
		
		String s="$@#$@@@$ selenium 012365548 #%#%$#%$#% java #$@$#";
		System.out.println(s);
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
		
		s=s.trim();// removes space
		System.out.println(s);
		

	
		
		
	
		

	}

}
