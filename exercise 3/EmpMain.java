/* 2.Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ 
  information and Search for an employee given eNo, using the concept of Array of Objects*/

import java.util.Scanner;

class Employee
{
  String eName;
  int eNo,eSalary;
}

//main class
class EmpMain
{
public static void main(String args[])
{

 int e,i,en,search=1;
 Scanner sn=new Scanner(System.in);

 System.out.print("Enter no.of employees:");  //read number of employees
 e=sn.nextInt();
 Employee emp[]=new Employee[e];  //declare array object

 for(i=0;i<e;i++)
 {
  emp[i]=new Employee();

  System.out.print("Enter employee number:");
  emp[i].eNo=sn.nextInt();
  System.out.print("Enter employee name:");
  emp[i].eName=sn.next();
  System.out.print("Enter employee salary:");
  emp[i].eSalary=sn.nextInt();
 }
  System.out.println("\nEMPLOYEE INFORMATION");
  System.out.println("---------------------");
  for(i=0;i<e;i++)
  {
   System.out.println("Employee Number:" + emp[i].eNo);
   System.out.println("Employee Name:" + emp[i].eName);
   System.out.println("Employee Salary:" + emp[i].eSalary);
  } 

   System.out.print("\nEnter eNo of an employee to be searched:");
   en=sn.nextInt();

  for(i=0;i<e;i++)
  {
    if(emp[i].eNo==en) //checking the searched employee is in array
    {
      search=1;
      
      System.out.println("Employee found!");
      System.out.println("Employee Number:" + emp[i].eNo);
      System.out.println("Employee Name:" + emp[i].eName);
      System.out.println("Employee Salary:" + emp[i].eSalary);
      break;
    }
    else
    {
      search=0;
    } 
  }
  if(search==0)
  {
     System.out.println("Employee not found!");
  }

}
}

/*
----------------output-------------------


C:\Users\USER\java_pgms\exercise 3>java EmpMain
Enter no.of employees:3
Enter employee number:1
Enter employee name:rahul
Enter employee salary:25000
Enter employee number:2
Enter employee name:arun
Enter employee salary:15000
Enter employee number:3
Enter employee name:sam
Enter employee salary:30000

EMPLOYEE INFORMATION
---------------------
Employee Number:1
Employee Name:rahul
Employee Salary:25000
Employee Number:2
Employee Name:arun
Employee Salary:15000
Employee Number:3
Employee Name:sam
Employee Salary:30000

Enter eNo of an employee to be searched:2
Employee found!
Employee Number:2
Employee Name:arun
Employee Salary:15000

C:\Users\USER\java_pgms\exercise 3>java EmpMain
Enter no.of employees:2
Enter employee number:10
Enter employee name:vimal
Enter employee salary:50000
Enter employee number:11
Enter employee name:nirmal
Enter employee salary:35000

EMPLOYEE INFORMATION
---------------------
Employee Number:10
Employee Name:vimal
Employee Salary:50000
Employee Number:11
Employee Name:nirmal
Employee Salary:35000

Enter eNo of an employee to be searched:12
Employee not found!


*/
