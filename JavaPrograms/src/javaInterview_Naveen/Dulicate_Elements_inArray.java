package javaInterview_Naveen;

import java.util.HashSet;
import java.util.Set;

public class Dulicate_Elements_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] ss= {"Ruby","Python","Java","C","Java","C++","Ruby"};
		
		
		
		for (int i=0;i<ss.length;i++)
		{
			for (int j=i+1;j<ss.length;j++)
			{
				if(ss[i].equals(ss[j]))
				{
					System.out.println(ss[i]);
				}
			}
		}
		
		//above logic will take lot of time hence worst approach
		// time complexity of above logic is O(nxn) i.e O n square
		
		//***Using HashSet
		System.out.println("**********Using HashSet**************");
		Set<String> store=new HashSet<String>(); 
		
		
		for (String name : ss)// enhanced for loop
		{
			if(store.add(name)==false) //set doesn't store duplicate value
			{
				System.out.println(name);
			}
		}
		
		
		

	}

}
