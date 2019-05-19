package interview;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a[][]= {{1,2,3},{2,5,5},{8,8,8,}};
			for (int i=0;i<a.length;i++) { //a.length to get row length
				for (int j=0;j<a[i].length;j++) { //a.[i] to get row length
					System.out.print(a[i][j]);
				}
				System.out.println();
				
			}
				}

}
