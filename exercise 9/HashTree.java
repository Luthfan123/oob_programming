// 2.Program to Convert HashMap to TreeMap

import java.util.*;
class HashTree
{
  public static void main(String args[]) 
  {
     //creating a hash map

      Map<Integer, String>mp = new HashMap<Integer, String>();

      //adding elements

      mp.put(1, "Red");
      mp.put(2, "Blue");
      mp.put(3, "Green");
      mp.put(4, "Yellow");
      mp.put(5, "Orange");
      mp.put(6, "Black");
      System.out.println("HASH MAP:" +mp);


      Map<Integer, String> tm = new TreeMap<>();  //treemap
      tm.putAll(mp);     //converting HashMap to TreeMap

      System.out.println("Converted TREE MAP = "+tm);
   }
}

/*
-----------------output--------------------
C:\Users\USER\java_pgms\exercise 9>java HashTree

HASH MAP:{1=Red, 2=Blue, 3=Green, 4=Yellow, 5=Orange, 6=Black}
Converted TREE MAP = {1=Red, 2=Blue, 3=Green, 4=Yellow, 5=Orange, 6=Black}
*/