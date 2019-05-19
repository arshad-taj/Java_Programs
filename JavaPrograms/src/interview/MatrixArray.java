package interview;
//minimun from matrix
public class MatrixArray {
	
	int x=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {{3,5,55},{8,1,99},{88,66,22}};
		
		int min=a[0][0];
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		
		
		
		
		

	}

}
