/* 2.Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,Qualification, Salary and its own constructor.
Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data members. Use array of objects to display details of N teachers*/

import java.util.Scanner;
//class Person

class Person
{  
  String Name,Gender,Address;
  int Age;

  Person(String name,String gn,String addr,int age)
  {
     Name=name;
     Gender=gn;
     Address=addr;
     Age=age;
  }
   Person(){}
}

//class Employee
class Employee extends Person
{
  String Company_name,Qualification;
  int Empid,Salary;

  Employee(String name,String gn,String addr,int age,String companyn,String quali,int eid,int sal)
  { 
     super(name,gn,addr,age);
     Company_name=companyn;
     Qualification=quali;
     Empid=eid;
     Salary=sal;
  }
    Employee(){}
}

//class Teacher
class Teacher extends Employee
{
  String Subject,Department;
  int Teacherid;

 Teacher(String name,String gn,String addr,int age,String companyn,String quali,int eid,int sal,String sub,String dept,int tid)
 {
    super(name,gn,addr,age,companyn,quali,eid,sal);
    Subject=sub;
    Department=dept;
    Teacherid=tid;
 }
   //display
    void display()
    {
          System.out.println("Name of the employee                   : " +Name);
          System.out.println("Employee ID                            : " +Empid);
          System.out.println("Gender of the employee                 : " +Gender);
          System.out.println("Age of the employee                    : " +Age); 
          System.out.println("Address of the employee                : " +Address);
          System.out.println("Qualification of the employee          : " +Qualification);
          System.out.println("Company name                           : " +Company_name);
          System.out.println("Subject taught                         : " +Subject); 
          System.out.println("Department                             : " +Department);
          System.out.println("Teacher ID                             : " +Teacherid); 
          System.out.println("Salary                                 : " +Salary);
          System.out.println("\n --------------------------------------------");
    }
}


//main class
class PersonEmployee
{
 public static void main(String args[])
 {
    
    int num,i,age,id,tech_id,sal;
    String nam,gen,add,coname,qualf,subj,dep;

    Scanner sn=new Scanner(System.in);
    System.out.print("Enter number of persons :");
    num=sn.nextInt();
  
    Teacher teach[] = new Teacher [num];
    for(i=0;i<num;i++)
    {

          System.out.println("Enter name of employee : ");
          nam=sn.next();
          System.out.print("Enter gender of employee : ");
          gen=sn.next();
          System.out.print("Enter address of employee : ");
          add=sn.next();
          System.out.print("Enter age of employee : ");
          age=sn.nextInt();
          System.out.print("Enter company name : ");
          coname=sn.next();
          System.out.print("Enter qualification of employee : ");
          qualf=sn.next();
          System.out.print("Enter employee id : ");
          id=sn.nextInt();
          System.out.print("Enter subject taught: ");
          subj=sn.next();
          System.out.print("Enter department : ");
          dep=sn.next();
          System.out.print("Enter teacher id : ");
          tech_id=sn.nextInt();
          System.out.print("Enter salary: ");
          sal=sn.nextInt();
          System.out.println("\n**********************************************");
          
          teach[i]=new Teacher(nam,gen,add,age,coname,qualf,id,sal,subj,dep,tech_id);
     }

   System.out.println("\n------------EMPLOYEE DETAILS-----------");
   System.out.println("-----------------------------------");
   for(i=0;i<num;i++)
   {
      teach[i].display();
   }  

    
 }
}

/*
---------------output-------------------

C:\Users\USER\java_pgms\exercise 4>javac PersonEmployee.java

C:\Users\USER\java_pgms\exercise 4>java PersonEmployee
Enter number of persons :2
Enter name of employee :
Rahul
Enter gender of employee : male
Enter address of employee : jothi-nagar
Enter age of employee : 25
Enter company name : infopark
Enter qualification of employee : mca
Enter employee id : 1
Enter subject taught: java
Enter department : mca
Enter teacher id : 101
Enter salary: 25000

**********************************************
Enter name of employee :
Arathi
Enter gender of employee : female
Enter address of employee : calicut
Enter age of employee : 24
Enter company name : wipro
Enter qualification of employee : mca
Enter employee id : 2
Enter subject taught: networking
Enter department : mca
Enter teacher id : 102
Enter salary: 20000

**********************************************

------------EMPLOYEE DETAILS-----------
-----------------------------------
Name of the employee                   : Rahul
Employee ID                            : 1
Gender of the employee                 : male
Age of the employee                    : 25
Address of the employee                : jothi-nagar
Qualification of the employee          : mca
Company name                           : infopark
Subject taught                         : java
Department                             : mca
Teacher ID                             : 101
Salary                                 : 25000

 --------------------------------------------
Name of the employee                   : Arathi
Employee ID                            : 2
Gender of the employee                 : female
Age of the employee                    : 24
Address of the employee                : calicut
Qualification of the employee          : mca
Company name                           : wipro
Subject taught                         : networking
Department                             : mca
Teacher ID                             : 102
Salary                                 : 20000

 --------------------------------------------
*/