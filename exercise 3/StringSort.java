/* 3.Write a menu driven program that would choose either in-built method 
    or call a user defined method to sort an array of strings*/

import java.util.Scanner;
import java.util.Arrays;

class StringSort
{
 void UserDefine(String arr[],int length)      //user defined method
 {
   String temp;
   int i,j;
   for(i=0;i<length;i++)
   {
     for(j=i+1;j<length;j++)
     {
        if(arr[i].compareTo(arr[j])>0)
        {
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
         }
      }
    }
      System.out.println("Sorted array:");
      for(i=0;i<length;i++)
      {
        System.out.println(arr[i]);
      }
 }
 
public static void main(String args[])
{
  int length,i,choice;
  
  StringSort sort=new StringSort();
  Scanner sn=new Scanner(System.in);
  System.out.print("Enter number of words:");
  length=sn.nextInt();

   String arr[]=new String[length];             // declare a string array
   System.out.println("Enter the words:");
   for(i=0;i<length;i++) 
   {
       arr[i]=sn.next(); 
   }

   System.out.println("\nEntered Array is:");
   for(i=0;i<length;i++)
   {
      System.out.println(arr[i]);
   }
  
    System.out.println("\nChoices:");
    System.out.println("1.Buil in Method");
    System.out.println("2.User Defined Method");
    System.out.println("3.Exit");
    System.out.print("Enter your choice:");
    choice=sn.nextInt();                   // read the choice

     while(choice!=3)
     {
        switch(choice)
        {
           case 1:
             Arrays.sort(arr);                 // built in method
             System.out.println("\nSorted array:");
             for(i=0;i<length;i++)
             {
                System.out.println(arr[i]);
             }
             break;
        
   	   case 2:
                 sort.UserDefine(arr,length);         // calling user defined method
             break;
        
          default:
             System.out.println("Invalid choice!!");
        
        }
       
      System.out.print("\nChoose your choice:");
      choice=sn.nextInt();  

    }


 }          
}

/*
----------------output---------------------


C:\Users\USER\java_pgms\exercise 3>java StringSort
Enter number of words:4
Enter the words:
Hello
Java
Adbms
World

Entered Array is:
Hello
Java
Adbms
World

Choices:
1.Buil in Method
2.User Defined Method
3.Exit
Enter your choice:1

Sorted array:
Adbms
Hello
Java
World

Choose your choice:2
Sorted array:
Adbms
Hello
Java
World

Choose your choice:3
---------------------
*/