// 1. Write a program in Java to display the cube of the number upto given an integer.

//importing scanner class
import java.util.Scanner;

class CubeNumber{
public static void main(String args[]){
int number,i;
System.out.println("Enter a number:");

//creating scanner object
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
System.out.println("The cube upto given number "+number+" is:");
for(i=1;i<=number;i++)
{
System.out.println(i*i*i);
}
}
}

/*
------------output----------------

C:\Users\USER\java_pgms\exercise 1>javac CubeNumber.java

C:\Users\USER\java_pgms\exercise 1>java CubeNumber
Enter a number:
6
The cube upto given number 6 is:
1
8
27
64
125
216
*/
