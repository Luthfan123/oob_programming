/* 5.Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations. Test the package by implementing all operations on two given numbers*/


import Operations.*;               //import package
import java.util.*;
class ArithmeticMain       
{
  public static void main(String [] args)
  {
    int ch;
    Scanner sn=new Scanner(System.in);

    Addition a=new Addition();
    Subtraction s=new Subtraction();
    Multiplication m=new Multiplication();
    Division d=new Division();
    
    System.out.println("--------select the option---------");      
    System.out.println("1.ADDITION");
    System.out.println("2.SUBTRACTION");
    System.out.println("3.MULTIPLICATION");
    System.out.println("4.DIVISION");
    System.out.println("5.EXIT");
   
    lp:while(true)                                          
         {
           System.out.print("\nEnter your choice : ");
           ch=sn.nextInt();
           switch(ch)
           {

	      case 1:
		     System.out.print("Enter numbers for addition :");
		     a.input();
		     a.addition();						
		     break;
	     case 2:
		    System.out.print("Enter numbers for subtraction:");
		    s.input();
		    s.diff();						
		    break;
	     case 3:
		    System.out.print("Enter numbers for multiplication :");
		    m.input();
		    m.multiplication();						
		    break;
	     case 4:
		    System.out.print("Enter numbers for division :");
		    d.input();
		    d.div();						
		    break;
	     case 5:
		    break lp;                                             
	     default:
		     System.out.print("INVALID CHOICE!!");
           }
         }
  }
}

/*
--------output-------------------------
C:\Users\USER\java_pgms\exercise 5\Arithmeticpackage>java ArithmeticMain

--------select the option---------
1.ADDITION
2.SUBTRACTION
3.MULTIPLICATION
4.DIVISION
5.EXIT

Enter your choice : 1
Enter numbers for addition :5
6
Addition:11

Enter your choice : 2
Enter numbers for subtraction:8
6
Subtraction:2

Enter your choice : 3
Enter numbers for multiplication :2
3
Multilpication:6

Enter your choice : 4
Enter numbers for division :10
2
Division:5

Enter your choice : 5
*/
