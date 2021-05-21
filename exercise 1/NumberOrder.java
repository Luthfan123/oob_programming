/* 4. Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, 
      and "Neither increasing or decreasing order" otherwise. */

//importing scanner class
import java.util.Scanner;
class NumberOrder{
public static void main(String args[]){
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first Number:");
a=sc.nextInt();
System.out.println("Enter Second Number:");
b=sc.nextInt();
System.out.println("Enter Third Number:");
c=sc.nextInt();
if(a<b && a<c)
{
  if(b<c)
  System.out.println("The numbers are Increasing");
  else
  System.out.println("Neither increasing nor decreasing");
}

else if(a>b && a>c)
{
  if(b>c)
  System.out.println("The numbers are Decreasing");
  else
  System.out.println("Neither increasing nor decreasing");
}
else
  System.out.println("Neither increasing nor decreasing");
}
}
 
/*
-----------output------------------

C:\Users\USER\java_pgms\exercise 1>javac NumberOrder.java

C:\Users\USER\java_pgms\exercise 1>java NumberOrder
Enter first Number:
45
Enter Second Number:
56
Enter Third Number:
78
The numbers are Increasing

C:\Users\USER\java_pgms\exercise 1>java NumberOrder
Enter first Number:
56
Enter Second Number:
45
Enter Third Number:
22
The numbers are Decreasing

*/