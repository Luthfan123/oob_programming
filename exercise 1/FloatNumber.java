/* 1. Write a Java program to read a floating-point number and if the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the
     absolute value of the number is less than 1, or "large" if it exceeds 1,00,000. */

//importing scanner class
import java.util.Scanner;

class FloatNumber{
public static void main(String args[]){
float number;
System.out.println("Enter a number:");

//creating scanner object
Scanner sc=new Scanner(System.in);
number=sc.nextFloat();
if(number==0)
{
System.out.println("The number is Zero");
}
else if(number>0)
{
   if(number<1)
   {
     System.out.println("The number is small"); 
   }
   else if(number>100000)
   {
     System.out.println("The number is large");
   }
System.out.println("The number is Positive");
}
else
{
System.out.println("The number is Negative");
}
}
}

/*
-----------output--------------

C:\Users\USER\java_pgms\exercise 1>java FloatNumber
Enter a number:
0
The number is Zero

C:\Users\USER\java_pgms\exercise 1>java FloatNumber
Enter a number:
1000020
The number is large
The number is Positive

C:\Users\USER\java_pgms\exercise 1>java FloatNumber
Enter a number:
-8
The number is Negative

C:\Users\USER\java_pgms\exercise 1>java FloatNumber
Enter a number:
0.45
The number is small
The number is Positive

*/