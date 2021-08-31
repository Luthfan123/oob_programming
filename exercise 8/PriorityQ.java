// 4.Program to demonstrate the creation of queue object using the PriorityQueue class

import java.util.*;
class PriorityQ
{
  public static void main(String args[])
  {
    //create PriorityQueue

    PriorityQueue<String> queue=new PriorityQueue<String>();

    queue.add("Arun");
    queue.add("Rahul");
    queue.add("Vibin");
    queue.add("Sonam");

    System.out.println("head:"+queue.element());  //it is used to retrieves, but does not remove, the head of this queue.
    System.out.println("head:"+queue.peek());  //it is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty

    System.out.println("Iterating the queue elements:");
    Iterator<String> itr=queue.iterator();
    while(itr.hasNext())
    {
      System.out.println(itr.next());
     }
   queue.remove();  //It is used to retrieves and removes the head of this queue
   queue.poll();    //It is used to retrieves and removes the head of this queue, or returns null if this queue is empty
   System.out.println("After removing two elements:");

   Iterator<String> itr2=queue.iterator();
   while(itr2.hasNext()){
   System.out.println(itr2.next());
   }
}
}

/*
---------output-------------------
C:\Users\USER\java_pgms\exercise 8>java PriorityQ

head:Arun
head:Arun
Iterating the queue elements:
Arun
Rahul
Vibin
Sonam
After removing two elements:
Sonam
Vibin
*/
 
