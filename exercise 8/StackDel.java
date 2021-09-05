// 3.Program to remove an object from the Stack when the position is passed as parameter

import java.util.*;
class StackDel
{
  public static void main(String args[])
  {
    //create a stack

    Stack<String> stack = new Stack<String>();
    
    stack.push("Red");
    stack.push("Black");
    stack.push("Yellow");
    stack.push("Green");
    stack.push("Blue");

   System.out.println("Original Stack:");

   Iterator<String> itr=stack.iterator();
   while(itr.hasNext())
   {
       System.out.println(itr.next());
   }
    Scanner sn=new Scanner(System.in);
    System.out.print("enter index position to be removed:");
    int st=sn.nextInt();

   stack.removeElementAt(st); 
   System.out.println("Resultant Stack: "+ stack);


  }
}

/*
-------------output----------------
C:\Users\USER\java_pgms\exercise 8>java StackDel

Original Stack:
Red
Black
Yellow
Green
Blue
enter index position to be removed:1
Resultant Stack: [Red, Yellow, Green, Blue]
*/
Verified
