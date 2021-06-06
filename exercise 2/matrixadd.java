// 2.Read 2 matrices from the console and perform matrix addition.


import java.util.Scanner;
class Matrix{
	
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("No. of Rows:");
		int m = sc.nextInt();
		System.out.print("No. of Columns:");
		int n = sc.nextInt();
		int[][] mat1 = new int[m][n];
		int[][] mat2 = new int[m][n];
		int[][] sumMat = new int[m][n];
		
		System.out.println("Enter the First Matrix: "); //for enter the first matrix elements
		
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				mat1[i][j] = sc.nextInt();
			
			}
		}
		
		
		System.out.println("Enter the Second Matrix: ");  //for enter the second matrix elements

		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				mat2[i][j] = sc.nextInt();
			}
		}
		
		
		// addition of two matrix

		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				sumMat[i][j] = mat1[i][j] + mat2[i][j];
			
			}
		}
		
		
		System.out.println("First Matrix: ");  //for printing first matrix
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print(mat1[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("Second Matrix: ");  //for printing second matrix
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print(mat2[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("Final Matrix: ");   //for printing matrix after addition
		for(int i=0; i<m;i++){
			for(int j=0; j<n; j++){
				System.out.print(sumMat[i][j]+ "\t");
			}
			System.out.println();
		}
	
	}
}


/*
--------------output--------------

C:\Users\USER\java_pgms\exercise 2>javac matrixadd.java

C:\Users\USER\java_pgms\exercise 2>java Matrix
No. of Rows:3
No. of Columns:3
Enter the First Matrix:
1
2
3
4
5
6
7
8
9
Enter the Second Matrix:
7
8
9
4
5
6
1
2
3
First Matrix:
1       2       3
4       5       6
7       8       9
Second Matrix:
7       8       9
4       5       6
1       2       3
Final Matrix:
8       10      12
8       10      12
8       10      12

*/

