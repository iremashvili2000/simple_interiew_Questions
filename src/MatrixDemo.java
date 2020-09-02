import java.util.Scanner;

public class MatrixDemo {
// how to read a nxn matrix from user
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner N=new Scanner(System.in);
		System.out.println("enter the number of rows in matrix: ");
		int n=N.nextInt();
		System.out.println("enter the number of Columns in matrix: ");
		int m=N.nextInt();
		
		int[][] matrix=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("["+i+"]["+j+"]= ");
				matrix[i][j]=N.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print("["+i+"]["+j+"]= "+matrix[i][j]+" ");
				
			}
			System.out.println();
		}
		
		

	}

}
