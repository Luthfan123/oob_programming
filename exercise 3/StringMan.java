/* 4.Write a program to illustrate the following String manipulation methods.

1. Create new strings using new.
2. Getting String length
3. String Concatenation
4. Character extraction
5. String Comparison
6. Searching substrings
7. Modifying a string
8. Data conversion using valueOf()  */


class StringMan
{
 public static void main(String args[])
 {
  System.out.println("\n***CREATION OF STRINGS***");
  char c1[] = {'S','T','R','I','N','G'};     //initial values
  String s1 = new String(c1);
  System.out.println("Create new string from char[]:" + s1);
  
  byte asc[] = {80,82,79,71,82,65,77};      //using byte arrays
  String s2= new String(asc);
  System.out.println("Create from byte[]:" +s2);
  
  System.out.println("\n***GETTING STRING LENGTH***");
  System.out.println("Length of the string is : " +s1.length());    //string length

  System.out.println("\n***STRING CONCATENATION***");
  System.out.println("Concatenation using 'concat()': " +s1.concat(s2));      //finding length using concat()
  System.out.println("Concatenation using '+' operator:" +s1+s2);             //finding length using '+' operator
  
 System.out.println("\n***CHARACTER EXTRACTION***");
 System.out.println("Character extraction using charAt():");
 System.out.println("Character at 2nd position of " + s1 + " is:" +s1.charAt(1));
 System.out.print("\nCharacter extraction using getChars():");
 char c2[]= new char[3];
 s2.getChars(2,5,c2,0);
 System.out.println(c2);

 System.out.println("\nCharacter extraction using getBytes():");
 byte[] bar=s1.getBytes();
 for(int i=0;i<bar.length;i++){
 System.out.println(bar[i]);
 }
 
 System.out.print("\nCharacter extraction using toCharArray():");
 char c3[]=s1.toCharArray();
 System.out.println(c3);

 System.out.println("\n***STRING COMPARISON***");
 System.out.print("Comparison using equals():");
 System.out.println(s1+" equals " +s2 +" -> " +s1.equals(s2));
 System.out.print("Comparison using equalsIgnoreCase():");
 System.out.println(s1+" equalsIgnoreCase " +s2 +" -> " +s1.equalsIgnoreCase(s2));

 System.out.println("Comparison using regionMatches():" +s1.regionMatches(3,s2,0,4));

 System.out.println("Comparison using startsWith():" +s1.startsWith("JA"));
 System.out.println("Comparison using endsWith():" +s2.endsWith("JA"));

 System.out.println("Second form startsWith():" +s1.startsWith("A",3));
 System.out.println("Comparison using '==' operator:" +(s1==s2));
 System.out.println("Comparison using compareTo():" +s1.compareTo(s2));
 System.out.println("Comparison using compareToIgnoreCase():" +s2.compareToIgnoreCase(s1));

 System.out.println("\n***SEARCHING SUBSTRINGS***");
 System.out.println("Searching using indexOf():" +s1.indexOf("VA"));
 System.out.println("Searching using lastIndexOf():" +s2.lastIndexOf("RAM"));

 System.out.println("\n***MODIFYING A STRING***");
 System.out.println("Modifying string using replace():"+s2.replace('A','M'));

 System.out.print("White space removing trim():");
 String s4 = "       Hello World!       ";
 System.out.println("String-" +s4);
 System.out.println("After trim: "+s4.trim());

  System.out.println("Using toLowerCase(): " +s1.toLowerCase());
  System.out.println("Using toUpperCase(): " +s4.toUpperCase());
  
 System.out.println("\n***DATA CONVERSION***");
 System.out.println(" Data conversion using valueOf(): "+String.valueOf(s2));


}
}

/*
-----------output------------------------

C:\Users\USER\java_pgms\exercise 3>java StringMan

***CREATION OF STRINGS***
Create new string from char[]:STRING
Create from byte[]:PROGRAM

***GETTING STRING LENGTH***
Length of the string is : 6

***STRING CONCATENATION***
Concatenation using 'concat()': STRINGPROGRAM
Concatenation using '+' operator:STRINGPROGRAM

***CHARACTER EXTRACTION***
Character extraction using charAt():
Character at 2nd position of STRING is:T

Character extraction using getChars():OGR

Character extraction using getBytes():
83
84
82
73
78
71

Character extraction using toCharArray():STRING

***STRING COMPARISON***
Comparison using equals():STRING equals PROGRAM -> false
Comparison using equalsIgnoreCase():STRING equalsIgnoreCase PROGRAM -> false
Comparison using regionMatches():false
Comparison using startsWith():false
Comparison using endsWith():false
Second form startsWith():false
Comparison using '==' operator:false
Comparison using compareTo():3
Comparison using compareToIgnoreCase():-3

***SEARCHING SUBSTRINGS***
Searching using indexOf():-1
Searching using lastIndexOf():4

***MODIFYING A STRING***
Modifying string using replace():PROGRMM
White space removing trim():String-       Hello World!
After trim: Hello World!
Using toLowerCase(): string
Using toUpperCase():        HELLO WORLD!


***DATA CONVERSION***
 Data conversion using valueOf(): PROGRAM

*/