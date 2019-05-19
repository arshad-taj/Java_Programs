package javaInterview_Naveen;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> ht=new Hashtable<>();
		
	ht.put(1, "ONe");
	ht.put(2, "two");
	ht.put(3, "three");
	ht.put(7, "seven");
	
	//System.out.println(ht.get(7));
	
	for(Entry e:ht.entrySet())
	{
		System.out.println(e.getKey()+" : "+e.getValue());
		
	}

}
}
