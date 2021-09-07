// 1.Program to demonstrate the working of Map interface by adding, changing and removing elements

import java.util.*;
class MapDemo 
{ 
  public static void main(String args[]) 
  { 
  // Creating a hash map

   Map<Integer,String> hm = new HashMap<Integer,String>();
 
  //adding elements

  hm.put(1,"A"); 
  hm.put(2,"B"); 
  hm.put(3,"C"); 
  hm.put(4,"D");  
  System.out.println("Adding elements in map");
  System.out.println("-------------------------");
  System.out.println(" MAP:" +hm);
 
  //changing elements

  Map<Integer, String> hm1= new HashMap<Integer, String>();
  hm1.put(new Integer(1), "Arun");
  hm1.put(new Integer(2), "Rahul");
  hm1.put(new Integer(3), "John");
  System.out.println("\nchanging elements in map");
  System.out.println("---------------------------");
  System.out.println("Map before changing: " +hm1);
  
  hm1.put(new Integer(2), "Hari");
  
  System.out.println("Changed Map:" +hm1);

  //removing elements

  Map<Integer, String> hm2= new HashMap<Integer, String>();

  //inserting elements

  hm2.put(new Integer(1), "Red");
  hm2.put(new Integer(2), "Blue");
  hm2.put(new Integer(3), "Orange");
  hm2.put(new Integer(4), "Green");
  System.out.println("\nRemoving elements in map");
  System.out.println("---------------------------");

  // Initial Map

  System.out.println("Map before removing elements:" +hm2);
  hm2.remove(new Integer(4));

  // Final Map

  System.out.println("Map after removing elements:" +hm2);
}
}

/*
-----------------output-------------------
C:\Users\USER\java_pgms\exercise 9>java MapDemo

Adding elements in map
-------------------------
 MAP:{1=A, 2=B, 3=C, 4=D}

changing elements in map
---------------------------
Map before changing: {1=Arun, 2=Rahul, 3=John}
Changed Map:{1=Arun, 2=Hari, 3=John}

Removing elements in map
---------------------------
Map before removing elements:{1=Red, 2=Blue, 3=Orange, 4=Green}
Map after removing elements:{1=Red, 2=Blue, 3=Orange}
*/