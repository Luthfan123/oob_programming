//5.Program to demonstrate the addition and deletion of elements in deque

import java.util.*;
class DequeDemo
{
 public static void main(String[] args) {

//Creating Deque and adding elements

 Deque<String> deque = new ArrayDeque<String>();
 deque.add("Apple");
 deque.addFirst("Orange");
 deque.addLast("Mango");

 Iterator<String> itr=deque.iterator();
 System.out.println("DEQUE ADDITION" );
 System.out.println("---------------");
    while(itr.hasNext())
    {
      System.out.println(itr.next());
     }

  System.out.println("\nDEQUE DELETION");
  System.out.println("--------------");
  System.out.println("Elements in deque:" +deque);
  System.out.print("Removing element at head:");
  deque.remove();
  System.out.println(deque); 
  System.out.print("Removing next element at head :");
  System.out.println(deque.poll());
  System.out.print("Removing last element :");
  System.out.println(deque.pollLast()); 
  System.out.println("Resultant deque:" +deque);
}
}

/*
--------------output-----------------

C:\Users\USER\java_pgms\exercise 8>java DequeDemo

DEQUE ADDITION
---------------
Orange
Apple
Mango

DEQUE DELETION
--------------
Elements in deque:[Orange, Apple, Mango]
Removing element at head:[Apple, Mango]
Removing next element at head :Apple
Removing last element :Mango
Resultant deque:[]
*/