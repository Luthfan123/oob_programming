// 4.Add complex numbers


import java.util.Scanner;
class Complex
{
 int real,img;
 Complex add(Complex c1,Complex c2)   //create method
 {
  Complex myresult=new Complex();      //create object
  myresult.real=c1.real+c2.real;
  myresult.img=c1.img+c2.img;
  return myresult;
}
}


//main class

class ComplexAdd
{
public static void main(String[]args)
{
  Complex num1=new Complex();     //creating object for accessing value from user
  Complex num2=new Complex();

  Scanner sc=new Scanner(System.in);
  System.out.print("Enter real part of 1st complex number:");
  num1.real=sc.nextInt();
  System.out.print("Enter imaginary part of 1st complex number:");
  num1.img=sc.nextInt();
  System.out.print("Enter real part of 2nd complex number:");
  num2.real=sc.nextInt();
  System.out.print("Enter imaginary part of 2nd complex number:");
  num2.img=sc.nextInt();

  System.out.println("1st complex number:"+num1.real+"+"+num1.img+"i");
  System.out.println("2nd complex number:"+num2.real+"+"+num2.img+"i");

  Complex num3=new Complex(); 
  num3=num3.add(num1,num2);
  System.out.println("After addition:"+num3.real+"+"+num3.img+"i");
  
}
}



/*
--------------output-----------------

C:\Users\USER\java_pgms\exercise 2>javac ComplexAdd.java

C:\Users\USER\java_pgms\exercise 2>java ComplexAdd
Enter real part of 1st complex number:5
Enter imaginary part of 1st complex number:4
Enter real part of 2nd complex number:6
Enter imaginary part of 2nd complex number:3
1st complex number:5+4i
2nd complex number:6+3i
After addition:11+7i


*/