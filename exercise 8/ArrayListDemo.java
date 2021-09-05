// 1.Maintain a list of Strings using ArrayList from collection framework, perform built-in operations.

import java.util.*;
class ArrayListDemo {
public static void main(String args[]) {

// Create an array list.

ArrayList<String> al = new ArrayList<String>();

System.out.println("Initial size of al: " + al.size());

// Add elements to the array list

al.add("C");
al.add("A");
al.add("E");
al.add("B");
al.add("D");
al.add("F");
al.add(1, "A2");

System.out.println("Size of al after additions: " + al.size());

// Display the array list

System.out.println("Contents of al: " + al);

// Remove elements from the array list

al.remove("F");
al.remove(2);

System.out.println("Size of al after deletions: " + al.size());
System.out.println("Contents of al: " + al);
}
}

/*
------------output-----------------


C:\Users\USER\java_pgms\exercise 8>java ArrayListDemo

Initial size of al: 0
Size of al after additions: 7
Contents of al: [C, A2, A, E, B, D, F]
Size of al after deletions: 5
Contents of al: [C, A2, E, B, D]
*/
Verified
