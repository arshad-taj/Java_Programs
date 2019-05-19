package javaInterview_Naveen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// hashMap stores the value in key value format
		// doesn't maintain order
		//not synchronized
		//can have one null key and multiple null value
		//contains unique elements only i.e keys duplicates not allowed, duplicate values are allowed
		
		Map<String,String> hp=new HashMap<String,String>();
		
		hp.put("Java", "Selenium55");
		hp.put("Java1", "Selenium44");
		hp.put("Python", "Selenium33");
		hp.put(null, "Selenium22");
		hp.put(null, "Selenium11");
		
		
		hp.get("Java");// will return selenium
		
		for (Entry m: hp.entrySet())
		{
			System.out.println(m.getKey()+"   "+m.getValue());
		}
		
		System.out.println(hp);
		
		
		
		
		
	

	}

}
