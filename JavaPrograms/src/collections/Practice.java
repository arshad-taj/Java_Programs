package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="Core";
		
		S.concat(" java");
		System.out.println(S);
		
		HashSet<String> ss=new HashSet<String>();
		ss.add("aa");
		ss.add("bb");
		ss.add("cc");
		ss.add("dd");
		Iterator<String> itr= ss.iterator();
		int i=0;
		while (itr.hasNext())
		{
			itr.next();
			i++;
		}
	System.out.println(i);
	}
	
	

}
