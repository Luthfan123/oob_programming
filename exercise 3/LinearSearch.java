// 1.a Program  for linear search

import java.util.Scanner;
class LinearSearch
 {
  public static void main(String args[])
  {
    int num,s,i,search=0;
    Scanner sn=new Scanner(System.in);

    System.out.print("Enter no.of elements:");        //read number of elements
    num=sn.nextInt();
 
  int arr[]=new int[num];                             //array declaration
  System.out.println("Enter elements:");              //read elements in array
  for(i=0;i<num;i++)
  {
   arr[i]=sn.nextInt();
  }
  
 System.out.print("Enter element to be search:");      //read element to search
 s=sn.nextInt();
 
 for(i=0;i<num;i++)
 {
  if(arr[i]==s)//checking the searched element is in array
  {
   search=1;
   break;
  }
   else
   {
    search=0;
   }
}

if(search==1)
{
  System.out.println("Element found!");
}
else
{
 System.out.println("Element not found!!");
}
  }
}

/*
-------------output---------------
C:\Users\USER\java_pgms\exercise 3>javac LinearSearch.java

C:\Users\USER\java_pgms\exercise 3>java LinearSearch
Enter no.of elements:4
Enter elements:
1
2
3
4
Enter element to be search:2
Element found!


C:\Users\USER\java_pgms\exercise 3>java LinearSearch
Enter no.of elements:3
Enter elements:
7
8
9
Enter element to be search:4
Element not found!!

*/
