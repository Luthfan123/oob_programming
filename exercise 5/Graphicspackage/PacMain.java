/* 4.Create a Graphics package that has classes and interfaces for figures
Rectangle, Triangle, Square and Circle. Test the package by finding the
area of these figures*/

import Graphics.*;               //import package
import java.util.*;
 
class PacMain        
{
  public static void main(String [] args)
  {
    int ch;
    Scanner sn=new Scanner(System.in);

    Square sqr=new Square();
    Rectangle rec=new Rectangle();
    Circle cir=new Circle();
    Triangle tri=new Triangle();
    
    System.out.println("***select the option***");
    System.out.println("1.AREA OF SQUARE");
    System.out.println("2.AREA OF RECTANGLE");
    System.out.println("3.Area of CIRCLE");
    System.out.println("4.Area of TRIANGLE");
    System.out.println("5.EXIT");
   
    lp:while(true)                                          
         {
           System.out.print("\nEnter your choice : ");
           ch=sn.nextInt();
           switch(ch)
           {

	      case 1:
		     System.out.print("Enter the side of Square:");
		     sqr.input();
		     sqr.area();						
		     break;
	      case 2:
		     System.out.print("Enter the length and breadth of Rectangle :");
		     rec.input();
		     rec.area();						
		     break;
	      case 3:
		     System.out.print("Enter the radius of Circle:");
		     cir.input();
		     cir.area();						
		     break;
	      case 4:
		     System.out.print("Enter the base and height of Triangle :");
		     tri.input();
		     tri.area();						
		     break;
	      case 5:
		     break lp;                                            
	      default:
		      System.out.print("INVALID CHOICE");
           }
         }
  }
}

/*
--------------output-------------
C:\Users\USER\java_pgms\exercise 5\Graphicspackage>java PacMain

***select the option***
1.AREA OF SQUARE
2.AREA OF RECTANGLE
3.Area of CIRCLE
4.Area of TRIANGLE
5.EXIT

Enter your choice : 1
Enter the side of Square:8
AREA OF SQUARE : 64.0

Enter your choice : 2
Enter the length and breadth of Rectangle :6
9
AREA OF RECTANGLE :54.0

Enter your choice : 3
Enter the radius of Circle:5
AREA OF CIRCLE :78.5

Enter your choice : 4
Enter the base and height of Triangle :4
8
AREA OF TRIANGLE :16.0

Enter your choice : 5

*/