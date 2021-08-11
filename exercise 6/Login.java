//1. Write a user defined exception class to authenticate user name and password

import java.util.Scanner;

class UsernameException extends Exception {
 public UsernameException(String msg){
  super(msg);
 }
}

class PasswordException extends Exception {
 public PasswordException(String msg){
  super(msg);
 }
} 
public class Login{
 public static void main(String[] args){
	Scanner sn=new Scanner(System.in);
	String uname,pass;
	System.out.println("Enter Username:");
	uname=sn.nextLine();
	System.out.println("Enter Password:");
	pass=sn.nextLine();
	int length=uname.length();
	try
	{
	 if(length<6)
		throw new UsernameException("Username must be greater than 6 characters");
	 else if(!pass.equals("welcome"))
		throw new PasswordException("invalid password");
	 else
		System.out.println("Login successful !!!");
	}
	catch(Exception u)
	{  
	 System.out.println("CAUGHT:"+u);
	}
	finally
	{
	 	System.out.println("The finally statement is executed");	
	}
}}

/*
-----------output-----------------------


C:\Users\USER\java_pgms\exercise 6>java Login
Enter Username:
rahul
Enter Password:
welcome
CAUGHT:UsernameException: Username must be greater than 6 characters
The finally statement is executed


Enter Username:
sachin
Enter Password:
123456
CAUGHT:PasswordException: invalid password
The finally statement is executed


Enter Username:
sachin
Enter Password:
welcome
Login successful !!!
The finally statement is executed

*/
