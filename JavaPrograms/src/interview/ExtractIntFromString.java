package interview;

public class ExtractIntFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Arshad129 selenium";
		
		String s2=s1.replaceAll("[^0-9]", "");
		
		System.out.println("String :"+s2);
		
		int toNum=Integer.parseInt(s2);
		
		System.out.println(toNum);

	}

}
