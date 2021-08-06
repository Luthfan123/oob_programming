// 2.Find the area of different shapes using override

import java.util.Scanner;
class Figure{

 void area(){
	System.out.println("Area of shapes");
        System.out.println("----------");
	}

}

class Square extends Figure{
	int side;
	Square(int side){
	this.side=side;
	}

	void area(){
	int area = side*side;
	System.out.print("Area of Square :"+area);
	}
 }

class Rectangle extends Figure{
	int length,width;
	Rectangle(int length, int width){
	  this.length=length;
	  this.width=width;
	}

	void area(){
	int area = length*width;
	 System.out.print("Area of Rectangle :"+area);
	}
 }


//main class
class Areas{

	public static void main(String args[]){
        
	Figure F = new Figure();// object created
        Figure Refvar; // object reference varible

        Refvar = F;
        Refvar.area();
	
	Scanner sn = new Scanner(System.in);
	
	//Reading length and width
	System.out.print("Enter the length of Rectangle:");
        int length = sn.nextInt();
	System.out.print("Enter the width of Rectangle:");
        int width = sn.nextInt();

	Rectangle R = new Rectangle(length,width);         //object created
   	Refvar = R;
        Refvar.area();
	
	//Read sides of square
	System.out.print("\nEnter Side of Square:");
        int side = sn.nextInt();
	Square S = new Square(side);

	Refvar=S;
	Refvar.area();
	}

}

/*
--------------output--------------

C:\Users\USER\java_pgms\exercise 4>javac Areas(override).java

C:\Users\USER\java_pgms\exercise 4>java Areas

Area of shapes
----------
Enter the length of Rectangle:8
Enter the width of Rectangle:6
Area of Rectangle :48
Enter Side of Square:8
Area of Square :64

*/