// 4.Using generic method perform Bubble sort.

import java.util.*;
class Bubble
{
  public static <T> T[] bs(T arr[],int n)  //generic method for sorting
  {
     String a,b;
     int i,j;
     for(i=0;i<n;i++)    //sorting
     for(j=0;j<n-1;j++)
     {
        a=arr[j].toString();    //converting to string
        b=arr[j+1].toString();
       if(a.compareTo(b)>0)
       {
          T temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
       }
  }
  return arr;
}
}


class GenericBubble
{
public static void main(String [] args)
{
  int n,i;
  Scanner sn=new Scanner(System.in);
  System.out.println("Enter no.of elements:");
  n=sn.nextInt();
  String str[]=new String[n];   //create array
  
  System.out.println("Enter elements:");
  for(i=0;i<n;i++)  
  {
     str[i]=sn.next();
  }
  
  Bubble bb=new Bubble();
  str=bb.<String>bs(str,n);            //calling generic method of class
  System.out.println("\nBUBBLE SORT"); 
  System.out.println("-------------");
  for(i=0;i<n;i++)  
  {
   System.out.println(str[i]);
  }
}
}

/*
-------------output---------------

C:\Users\USER\java_pgms\exercise 9>java GenericBubble

Enter no.of elements:
3
Enter elements:
45
33
78

BUBBLE SORT
-------------
33
45
78

Enter no.of elements:
3
Enter elements:
Rahul
Zeena
Arun

BUBBLE SORT
-------------
Arun
Rahul
Zeena
*/