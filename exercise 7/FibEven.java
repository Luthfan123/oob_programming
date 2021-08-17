/* 2.Define 2 classes; one for generating Fibonacci numbers and other for displaying even numbers in a given range.
 Implement using threads. (Runnable Interface) */

import java.util.Scanner;
class Fibonacci implements Runnable
{
   public void run()
   {
        int a=0,b=1,i,c=0,limit;               
        Scanner sn= new Scanner(System.in);
        System.out.print("Enter limit of Fibonacci series :");
        limit = sn.nextInt(); 
        System.out.println("Fibonacci number: "+a);       
        System.out.println("Fibonacci number: "+b);
  
       try{
           for(i=2;i<limit;i++)   
            {    
                   c=a+b;    
                   System.out.println("Fibonacci number: "+c);    
                   a=b;    
                   b=c;    
                   Thread.sleep(200); 
              }    
        
     }catch(InterruptedException e)
     {
            System.out.println(e);       
     }           
    }          
}
      
class Even implements Runnable
{
  public void run()
  {
    int n,i;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter limit of even numbers : ");
    n = sn.nextInt();
  
   try{
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
               System.out.println("Even number:" +i);
               Thread.sleep(250);
            }
        }
        
     }catch(InterruptedException e)
     {
        System.out.println(e);       
     } 
 }          
}
//main class
class FibEven 
{
    public static void main(String args[])
    {        
      Fibonacci f= new Fibonacci(); 
      Even e = new Even(); 
      //create threads

      Thread fib = new Thread(f);       
      Thread eve = new Thread(e);   
                      
       fib.start();  //start thread
       eve.start();                   
    }
}
/*
-----------output---------------

C:\Users\USER\java_pgms\exercise 7>java FibEven

Enter limit of even numbers : Enter limit of Fibonacci series :6
Even number:2
Even number:4
Even number:6
10
Fibonacci number: 0
Fibonacci number: 1
Fibonacci number: 1
Fibonacci number: 2
Fibonacci number: 3
Fibonacci number: 5
Fibonacci number: 8
Fibonacci number: 13
Fibonacci number: 21
Fibonacci number: 34
*/

