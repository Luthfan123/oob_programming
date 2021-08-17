/* 1.Define 2 classes; one for generating multiplication table of 5 and other for displaying first N prime numbers. 
Implement using threads. (Thread class) */

import java.util.Scanner;

//create thread class for multiplication

class Mul extends Thread 
{
   public void run()
   {
     try
     {
       Scanner sn=new Scanner(System.in);
       int n;
       System.out.println("Enter limit of multiplication table:");
       n=sn.nextInt();
     
       for(int i=1;i<=n;i++)
       {
         System.out.println("Multiplication:" +i+"*5="+(i*5));
         Thread.sleep(200);
       }
      }
      catch(InterruptedException e)
      {
         System.out.println(e);
      }
    }
}

//create thread class for prime number

class Prime extends Thread
{
  public void run()
  {
   try
   {

      Scanner sn=new Scanner(System.in);
      int a;
      System.out.println("Enter limit of prime number:");
      a=sn.nextInt(); 
      int count=0,num=2;

    while(count!=a)
    {
      boolean prime=true;
      for(int i=2;i<=Math.sqrt(num);i++)   //prime number checking
      {
        if(num%i==0)
        {
          prime=false;
          break;
        }
      }
       if(prime)
       {
         count++; //increase the count 
         System.out.println("Prime Number:"+num);
       }
        num++; //increase number
        Thread.sleep(200);
     }
    }
      catch(InterruptedException e)
      {
         System.out.println(e);
      }
     
    }
}
//main class
class MulPrime
{
  public static void main(String args[])
  {
    Mul m= new Mul(); 
    Prime p = new Prime();  
      m.start();      //threads start
      p.start();
   
   }
}   
/*
---------------output-----------
C:\Users\USER\java_pgms\exercise 7>java MulPrime

Enter limit of multiplication table:
Enter limit of prime number:
6
6
Prime Number:2
Multiplication:1*5=5
Prime Number:3
Multiplication:2*5=10
Multiplication:3*5=15
Prime Number:5
Multiplication:4*5=20
Multiplication:5*5=25
Prime Number:7
Multiplication:6*5=30
Prime Number:11
Prime Number:13
*/