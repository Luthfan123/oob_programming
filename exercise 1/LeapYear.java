// 3. Write a Java program to find the number of days in a month for a given year. Check Leap year also.

import java.util.Scanner;
class LeapYear{
public static void main(String args[]){

int year;
String leap;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year:");
year=sc.nextInt();
System.out.println("Enter a Month");
String month=sc.next();

if((year%4 == 0) || ((year%100 == 0) &&(year%400 == 0)))
leap="Leap Year";
else
leap="Not a Leap Year";

switch(month)
{
case "january":
case "march":
case "may":
case "july":
case "august":
case "october":
case "december":
               System.out.println("Has 31 days");
	       System.out.println(leap);
               break;

case "february":
                if(leap=="Leap Year")
                {
                  System.out.println("Has 29 days");
	          System.out.println(leap);
                }
                else
                {
                  System.out.println("Has 28 days");
	          System.out.println(leap);
                }
                break;

case "april":
case "june":
case "september":
case "november":
	         System.out.println("Has 30 days");
	         System.out.println(leap);
                 break;

default:
    System.out.println("Invalid");
                
}

}
}

/*

--------------output----------------

C:\Users\USER\java_pgms\exercise 1>java LeapYear
Enter the year:
2015
Enter a Month
march
Has 31 days
Not a Leap Year

C:\Users\USER\java_pgms\exercise 1>java LeapYear
Enter the year:
2020
Enter a Month
march
Has 31 days
Leap Year


*/