// 2.Read a matrix from the console and check whether it is symmetric or not.


import java.util.Scanner;
class Symmetric {
public static void main(String args[]) {
    int  r, c;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of rows in  matrix:");                                
    r = s.nextInt();
    System.out.print("Enter number of columns in  matrix:");                            
    c= s.nextInt();
    int a[][] = new int[r][c];
    System.out.println("Enter all the elements of matrix:");                             // enter all elements for metrix         
    for (int i = 0; i < r; i++) 
      {
       for (int j = 0; j < c; j++) 
         {
          a[i][j] = s.nextInt();
         }
      }
    System.out.println(" Matrix:");                                                     //for printing matrix
    for(int i=0;i<r;i++) 
      {
       for(int j=0;j<c;j++) 
        {
          System.out.print(a[i][j]+" ");
        }
        System.out.println("");
      }

  int symmetric = 1;                                                                 //to check symmetricity of matrix
  if(r==c){
       for(int i=0;i<r;i++) 
       {
         for(int j=0;j<c;j++) 
         {
          if(a[i][j] != a[j][i])                                              //symmetric value set as 0 if any elements in matrix A and transpose of matrix are
           {                                                                    // not equal and break
            symmetric = 0;
            break;
           }
         }
        }
			   
       if(symmetric == 1)                                                    //if symmetric=1 
         {
          System.out.println("The given matrix is symmetric...");           //print matrix is symmetric
         }
         else                                                                  //otherwise print as non symmetric
         {
          System.out.println("The given matrix is not symmetric...");
         }
        }
  else
    {
    System.out.println("it is not a symmetric.");
   }
 }
}






/*
------------output---------------------

C:\Users\USER\java_pgms\exercise 2>javac Symmetric.java

C:\Users\USER\java_pgms\exercise 2>java Symmetric
Enter number of rows in  matrix:3
Enter number of columns in  matrix:3
Enter all the elements of matrix:
1
0
0
0
1
0
0
0
1
 Matrix:
1 0 0
0 1 0
0 0 1
The given matrix is symmetric...

C:\Users\USER\java_pgms\exercise 2>java Symmetric
Enter number of rows in  matrix:3
Enter number of columns in  matrix:3
Enter all the elements of matrix:
1
2
3
4
5
6
7
8
9
 Matrix:
1 2 3
4 5 6
7 8 9
The given matrix is not symmetric...

*/		