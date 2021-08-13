/* 1.create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data members department, Subjects taught and constructors to initialize these data members and also include display
function to display all the data members. Use array of objects to display details of N teachers.
*/

import java.util.Scanner;
class Employee{              //class employee
	int Empid;
	String Name;
	int Salary;
	String Address;

	Employee(int Empid,String Name,int Salary,String Address)   //constructor for employee
		{
		this.Empid = Empid;
		this.Name = Name;
		this.Salary = Salary;
		this.Address = Address;
		}
	
}
class Teacher extends Employee               //sub class teacher of employee
{
	String Department;
	String Subject;
	
	Teacher(int Empid,String Name,int Salary,String Address,String Department,String Subject)
	{
		super(Empid,Name,Salary,Address);       //using super
		this.Department = Department;
		this.Subject = Subject;
	}

	void display()            //display method for details of teacher
	{
		System.out.println("employee id ="+Empid);
		System.out.println("employee name ="+Name);
		System.out.println("employee salary ="+Salary);
		System.out.println("employee address ="+Address);
		System.out.println("employee Department ="+Department);
		System.out.println("employee Subject ="+Subject);
		System.out.println("-----------------------------------\n");
	}
	
}


class Employees{               //main class
public static void main(String args[]){
	int n,id,salary;
	String name,add,dep,sub; 
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number of employee");
	n = s.nextInt();
	Teacher a[] = new Teacher[n];
	for(int i= 0 ; i<n ; i++)
	{
		System.out.println("\nEnter details of employee "+(i+1));
		System.out.println("1.Enter employee id:");
		id = id = s.nextInt();
		System.out.println("2.Enter employee name:");
		name = s.next();
		System.out.println("3.Enter employee salary:");
		salary = s.nextInt();
		System.out.println("4.Enter employee address:");
		add = s.next();
		System.out.println("5.Enter employee department:");
		dep = s.next();
		System.out.println("6.Enter employee subject:");
		sub = s.next();
		a[i] = new Teacher(id,name,salary,add,dep,sub);
		
	}
	System.out.println("--------------DETAILS---------------");
	for(int i = 0 ;i<n ; i++)
	{
		a[i].display();
	}
	
 
 }
}


/*
-----------------output------------------------


C:\Users\USER\java_pgms\exercise 4>javac Employee(super).java

C:\Users\USER\java_pgms\exercise 4>java Employees
enter the number of employee
2

Enter details of employee 1
1.Enter employee id:
100
2.Enter employee name:
sebin
3.Enter employee salary:
40000
4.Enter employee address:
kerala
5.Enter employee department:
mca
6.Enter employee subject:
java

Enter details of employee 2
1.Enter employee id:
200
2.Enter employee name:
vibin
3.Enter employee salary:
50000
4.Enter employee address:
jammu
5.Enter employee department:
mba
6.Enter employee subject:
business
--------------DETAILS---------------
employee id =100
employee name =sebin
employee salary =40000
employee address =kerala
employee Department =mca
employee Subject =java
-----------------------------------

employee id =200
employee name =vibin
employee salary =50000
employee address =jammu
employee Department =mba
employee Subject =business
-----------------------------------

*/	
//Verified
