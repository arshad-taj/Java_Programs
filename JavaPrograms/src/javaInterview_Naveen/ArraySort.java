package javaInterview_Naveen;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {64, 34, 25, 12, 22, 11, 90,0};
		
		int temp=0;
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for (int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}

	}

}
