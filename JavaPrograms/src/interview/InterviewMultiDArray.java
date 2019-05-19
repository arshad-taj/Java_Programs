/*find minimum no. from the multidimensional array and 
find the maximum no. from the same column
e.g   5 2 5
	  8 9 6
	  7 5 6
	  min no. in above matrix is 2 and maximum no. in that column is 9. 
	  */
package interview;

public class InterviewMultiDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][]= {{6,3,5},{5,3,9},{4,5,7}};
		int min=matrix[0][0];
		int mincolumn=0;
	for (int i=0;i<matrix.length;i++) 
		{
			for (int j=0;j<matrix[i].length;j++) 
			{
				if (matrix[i][j]<min)
				{
					min=matrix[i][j];
					mincolumn=j;
				}
			}
			
		}
		int max=matrix[0][mincolumn];
		for (int i=0;i<matrix.length;i++)
		{
			if (matrix[i][mincolumn]>max)
			{
				max=matrix[i][mincolumn];
			}
		}
		
		System.out.println("max no. :"+max );	

	}

}
