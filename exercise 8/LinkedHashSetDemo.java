// 6.Program to demonstrate the creation of Set object using the LinkedHashset class

import java.util.*;
class LinkedHashSetDemo
{
  public static void main(String args[])
  {
   LinkedHashSet<String> set=new LinkedHashSet<String>();
   set.add("Apple");
   set.add("Mango");    
   set.add("Grapes");
   set.add("Orange");
   set.add("Orange");   //no duplication here

  Iterator<String> itr=set.iterator();
  System.out.println("LINKED HASHSET");
  System.out.println("--------------");

  while(itr.hasNext()){
  System.out.println(itr.next());
  }
 }
}

/*
-------------output----------------

C:\Users\USER\java_pgms\exercise 8>java LinkedHashSetDemo

LINKED HASHSET
--------------
Apple
Mango
Grapes
Orange
*/