package interview;

import java.util.HashMap;

import org.apache.log4j.PropertyConfigurator;

public class CharOccuranceInString {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="SEARS";
		
		//Converting given string to char array
		
		char ch[]= str.toCharArray();
		
	
		//Creating a HashMap containing char as a key and occurrences as  a value
		
		HashMap<Character,Integer> charMap=new HashMap<>();
		
	    //checking each char of str
		
		for (char c: ch)
		{
			//If char is present in charMap, incrementing it's count by 1
			
			if(charMap.containsKey(c))
			{
				charMap.put(c,charMap.get(c)+1);
			}
			
			//If char is not present in chaMap,
			//putting this char to charMap with 1 as it's value
			
			else
			{
				charMap.put(c,1);
			}
		}
		
		System.out.println(charMap);

	}

}
