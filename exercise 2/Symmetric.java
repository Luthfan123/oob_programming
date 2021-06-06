// 2.Read a matrix from the console and check whether it is symmetric or not



import java.util.Scanner;
class Symmetric{
	
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Size of the matrix: ");
		int s = sc.nextInt();
		int[][] mat1 = new int[s][s];
		
		System.out.println("Enter the Matrix: ");
		
		for(int i=0; i<s;i++){    //for entering all elements of matrix
			for(int j=0; j<s; j++){
				mat1[i][j] = sc.nextInt();
			
			}
		}
		
		System.out.println("Matrix: ");  //for printing the matrix
		for(int i=0; i<s;i++){
			for(int j=0; j<s; j++){
				System.out.print(mat1[i][j]+ "\t");
			}
			System.out.println();
		}

		

		
		for(int i=0; i<s;i++){       //checking symmetricity of matix
			for(int j=0; j<s; j++){
				if (mat1[i][j] != mat1[j][i]){
				
					System.out.println("Matrices are not symmetric ");
					return;
				}
			}
		}
		System.out.println("Matrices are symmetric ");
		
	
	}
}

/*
------------output----------------

Size of the matrix: 3
Enter the Matrix: 
3
2
1
2
1
3
1
3
3
Matrix: 
3	2	1	
2	1	3	
1	3	3	
Matrices are symmetric 

C:\Users\USER\java_pgms\exercise 2>java Symmetric
Size of the matrix: 3
Enter the Matrix:
1
2
3
7
8
9
4
5
6
Matrix:
1       2       3
7       8       9
4       5       6
Matrices are not symmetric
*/
