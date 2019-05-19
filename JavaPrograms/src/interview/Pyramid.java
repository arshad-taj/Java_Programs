package interview;

public class Pyramid {

	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<5;i++) 
		{
			for(j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for (k=0;k<2*i-1;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
