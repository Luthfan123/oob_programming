// 2.Find the average of N positive integers,raising a user defined exception for each negative input

import java.util.Scanner;
import java.util.*;

class AverageException extends Exception //exception class
{
    AverageException(String str)
    {
        super(str);
    }
}

//main class

class AveragePositive
{
  public static void main(String args[]) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter number of integers:");
  int num = s.nextInt();
  int sum=0;
  int[] array = new int[num];  //array created 
  int i=0;
  while(i<num)
  {
     int number=s.nextInt();
              
         try
         {
           if(number<0)
           throw new AverageException("negative Input"); 
           else
           {
             array[i]=number;
             i=i+1;
            }        
          }     
           catch(Exception e)
            {
               System.out.println("Alert! it's a negative number!\nenter new number:");  
                  continue;
             }
           } 
             for(i =0;i<num;i++)
             {
               sum=sum+array[i]; //calculate sum
              }
               int average = sum/num;
               System.out.println("average of N positive integers : "+ average); //calculate average     
   }
}

/*
--------output-------------------

C:\Users\USER\java_pgms\exercise 6>java AveragePositive

Enter number of integers:5
1
2
3
-4
Alert! it's a negative number!
enter new number:
4
5
average of N positive integers : 3
*/