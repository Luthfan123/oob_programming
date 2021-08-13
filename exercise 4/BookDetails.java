/* 4.Write a program has class Publisher, Book, Literature and Fiction. Read the
information and print the details of books from either the category, using
inheritance */

import java.util.Scanner;
//class Publisher
class Publisher
{
  String publisher_name;
  int year;
 
  Publisher(String pname,int yr) //publisher constructor created
  {
    publisher_name=pname;
    year=yr;
  }
}
//class Book
class Book extends Publisher
{
 String author;
 int price;

 Book(String pname,int yr,String auth,int bprice) //book constructor created
 {

   super(pname,yr);
   author=auth;
   price=bprice;
   
 }
}
//class Literature
class Literature extends Book
{
  String title;
  Literature(String pname,int yr,String auth,int bprice,String name){     // literature constructor created
  
  super(pname,yr,auth,bprice);
  title=name;
 }
  void display()
  {
    System.out.print("\n-----------LITERATURE BOOK DETAILS\n------------");
    System.out.println("\nPublisher Name : " +publisher_name);
    System.out.println("Published Year   : " +year);
    System.out.println("Price of book    : " +price);
    System.out.println("Book name        : " +title);
    System.out.println("Author           : " +author);

  }
}
//class Fiction
class Fiction extends Book
{
  String title;
  Fiction(String pname,int yr,String auth,int bprice,String name){   //fiction constructor created
  
  super(pname,yr,auth,bprice);
  title=name;
 }
  void display()
  {
    System.out.print("\n-------FICTION BOOK DETAILS\n----------");
    System.out.println("\nPublisher Name : " +publisher_name);
    System.out.println("Published Year   : " +year);
    System.out.println("Price of book    : " +price);
    System.out.println("Book name        : " +title);
    System.out.println("Author           : " +author);

  }
}
//main class
class BookDetails
{
 public static void main(String args[])
 {
       Scanner sn=new Scanner(System.in);
        
      System.out.println("-----SELECT CATEGORY------");
      System.out.println(" 1.LITERATURE\n 2.FICTION");
      System.out.print("Choose Your choice : ");
      int ch = sn.nextInt();

        String pname, name, auth;
	int bprice, yr;
        switch(ch){
	 
	  case 1: 
                 System.out.print("\nEnter the name of the publisher : ");
	         pname=sn.next();
	         System.out.print("Enter the name of the book      : ");
	         name=sn.next();
	         System.out.print("Enter the author of the book    : ");
	         auth=sn.next();
	         System.out.print("Enter the price of the book     : ");
	         bprice=sn.nextInt();
	         System.out.print("Enter year of publishing    : ");
	         yr=sn.nextInt();
	         

	         Literature L = new Literature(pname,yr,auth,bprice,name);  //object created
	         L.display();
                 break;
                 
	   case 2: 
                 System.out.print("\nEnter name of the publisher : ");
	         pname=sn.next();
	         System.out.print("Enter name of the book      : ");
	         name=sn.next();
	         System.out.print("Enter author of the book    : ");
	         auth=sn.next();
	         System.out.print("Enter price of the book     : ");
	         bprice=sn.nextInt();
	         System.out.print("Enter year of publishing    : ");
	         yr=sn.nextInt();
	       
	        Fiction F = new Fiction(pname,yr,auth,bprice,name); //object created
	        F.display(); 
                break;

}
}

}

/*
---------output------------------


C:\Users\USER\java_pgms\exercise 4>javac BookDetails.java

C:\Users\USER\java_pgms\exercise 4>java BookDetails
-----SELECT CATEGORY------
 1.LITERATURE
 2.FICTION
Choose Your choice : 1

Enter the name of the publisher : GR
Enter the name of the book      : Animalfarm
Enter the author of the book    : George
Enter the price of the book     : 599
Enter year of publishing    : 1945

-----------LITERATURE BOOK DETAILS-------------
Publisher Name : GR
Published Year   : 1945
Price of book    : 599
Book name        : Animalfarm
Author           : George


-----SELECT CATEGORY------
 1.LITERATURE
 2.FICTION
Choose Your choice : 2

Enter name of the publisher : CC
Enter name of the book      : Dune
Enter author of the book    : Frank
Enter price of the book     : 2999
Enter year of publishing    : 1965

-------FICTION BOOK DETAILS-----------
Publisher Name : CC
Published Year   : 1965
Price of book    : 2999
Book name        : Dune
Author           : Frank

*/
//Verified
