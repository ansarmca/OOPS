SymmtricMatrix.java:
------------------

package Module1;
import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = s.nextInt();
		System.out.println("Enter number of columns: ");
		int cols = s.nextInt();
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter the elements of the matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				matrix[i][j] = s.nextInt();
		}
		s.close();
		System.out.println("The given matrix : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
		if(rows != cols)
			System.out.println("The given matrix is not a square matrix");
		else {
			boolean symmetric = true;
			for(int i=0;i<rows;i++)
				for(int j=0;j<cols;j++)
					if(matrix[i][j] != matrix[j][i]) {
						symmetric = false;
						break;
					}
			if(symmetric) {
				System.out.println("The given matrix is symmetric");
			}
			else {
				System.out.println("the given matrix is not symmetric");
			}
		}
	}
}


output:
------

Enter number of rows: 
2
Enter number of columns: 
2
Enter the elements of the matrix: 
3
5
5
7
The given matrix : 
3	5	
5	7	
The given matrix is symmetric

