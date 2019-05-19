package interview;

public class PyraminWithName {

	public static void main(String[] args) {
		int i,j,k;
		String s="Arshad";
		int num=s.length();
		for(i=0;i<=num;i++)
		{
			for(j=0;j<num-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<2*i-1;k++)
			{
				System.out.print(s.charAt(i-1));
			}
			System.out.println();
		}

	}

}
