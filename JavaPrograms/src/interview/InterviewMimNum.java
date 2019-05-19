package interview;

public class InterviewMimNum {
//find minimum from multi-dimensional array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][]= {{6,3,5},{5,3,9},{4,5,7}};
		int min=matrix[0][0];
		
		for (int i=0;i<matrix.length;i++) 
			{
			for (int j=0;j<matrix[i].length;j++) 
			{
				if (matrix[i][j]<min)
				{
					min=matrix[i][j];
				}
			}
		}
		System.out.println("Minimum Number is :"+min);
			

	}

}
