/* 2.Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ 
  information and Search for an employee given eNo, using the concept of Array of Objects*/

import java.util.Scanner;

class Employee
{
  String eName;
  int eNo,eSalary;

  Employee(int Empno,int Empsalary,String name){
  eNo=Empno;
  eSalary=Empsalary;
  eName=name;
}

void display(){
System.out.println("employee number :" +eNo);
System.out.println("employee name :" +eName);
System.out.println("employee salary :" +eSalary);
}
}


//main class
class EmpMain
{
public static void main(String args[])
{

 int e,i,en,search;
 Scanner sn=new Scanner(System.in);

 System.out.print("Enter no.of employees:");  //read number of employees
 e=sn.nextInt();
 Employee emp[]=new Employee[e];  //declare array object

 for(i=0;i<e;i++)
 {
  System.out.println("\nEMPLOYEE INFORMATION");
  System.out.println("---------------------");
 
  System.out.print("Enter employee number:");
  int Empno=sn.nextInt();
  System.out.print("Enter employee name:");
  String name=sn.next();
  System.out.print("Enter employee salary:");
  int Empsalary=sn.nextInt();

  emp[i]=new Employee(Empno,Empsalary,name);

 }
  
  
   System.out.print("\nEnter employee number of an employee to be searched:");
   en=sn.nextInt();
   search=0;

  for(i=0;i<e;i++)
  {
    if(emp[i].eNo==en) //checking the searched employee is in array
    {
      search=0;
      break;
    }
   else
      {   
        search=1;
              continue;
       }
    }
 
  if(search==0){
    System.out.println("\nemployee is found...");
    System.out.println("\n....Employee Details...");
    emp[i].display();
    }

  else

     System.out.println("\nEmployee not found....");

}
}

/*
----------------output-------------------

C:\Users\USER\java_pgms\exercise 3>javac EmpMain.java

C:\Users\USER\java_pgms\exercise 3>java EmpMain
Enter no.of employees:3

EMPLOYEE INFORMATION
---------------------
Enter employee number:1
Enter employee name:rahul
Enter employee salary:25000

EMPLOYEE INFORMATION
---------------------
Enter employee number:2
Enter employee name:arun
Enter employee salary:20000

EMPLOYEE INFORMATION
---------------------
Enter employee number:3
Enter employee name:vibin
Enter employee salary:30000

Enter employee number of an employee to be searched:2

employee is found...

....Employee Details...
employee number :2
employee name :arun
employee salary :20000



C:\Users\USER\java_pgms\exercise 3>java EmpMain
Enter no.of employees:2

EMPLOYEE INFORMATION
---------------------
Enter employee number:5
Enter employee name:vimal
Enter employee salary:80000

EMPLOYEE INFORMATION
---------------------
Enter employee number:10
Enter employee name:harish
Enter employee salary:50000

Enter employee number of an employee to be searched:8

Employee not found....

*/
