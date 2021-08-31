//7.Write a Java program to compare two hash set

import java.util.*;

class HashSetCom
{
   public static void main(String args[])
   {
       System.out.println("COMPARING TWO HASHSET");
       System.out.println("----------------------");
     // Creating a hash set

       HashSet<String>set1 = new HashSet<String>();

     //adding elements

	set1.add("Java");
	set1.add("Python");
	set1.add("Adbms");
	set1.add("Html");
	set1.add("PHP");

       //Traversing elements

         Iterator<String> itr1=set1.iterator();
        System.out.println("FIRST HASHSET: ");
         while(itr1.hasNext()){
           System.out.println(itr1.next());
         }
	

      //Another hash set

	HashSet<String>set2 = new HashSet<String>();

       //adding elements

	set2.add("Red");
	set2.add("Black");
	set2.add("Blue");
	set2.add("Pink");
	set2.add("Yellow");

         //Traversing elements

         Iterator<String> itr2=set2.iterator();
         System.out.println("SECOND HASHSET: ");
         while(itr2.hasNext()){
           System.out.println(itr2.next());

        }
	boolean res=set1.equals(set2);

	System.out.println("Are both sets are equal?: "+ res);
   }
}


/*
------------output--------------------
C:\Users\USER\java_pgms\exercise 8>java HashSetCom

COMPARING TWO HASHSET
----------------------
FIRST HASHSET:
Java
Adbms
Html
PHP
Python
SECOND HASHSET:
Red
Pink
Blue
Yellow
Black
Are both sets are equal?: false
*/