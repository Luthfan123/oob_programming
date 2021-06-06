/* 1. Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the 
      product having the lowest price. */



import java.util.Scanner;
 class Product
{
  int pcode;                                             //data member or instance variable
  String pname;
  float price;
  
  public Product(int c, String n,float p)
   {                                                     //create constructor
    pcode=c;
    pname=n;
    price=p;
   }
  public static void main(String args[])
  {
  Product p1=new Product(1,"Benz",500000);              //create object
  Product p2=new Product(2,"Hyundai",25000);
  Product p3=new Product(3,"Audi",45000);

  if(p1.price<=p2.price && p1.price<=p3.price)
  System.out.println("lowest Product code is:"+p1.pcode);
                                                                   //find the lowest price of 3 products
  if(p2.price<=p1.price && p2.price<=p3.price)                     
  System.out.println("lowest Product code is:"+p2.pcode);
  
  if(p3.price<=p2.price && p3.price<=p1.price)
  System.out.println("lowest Product code is:"+p3.pcode);

  System.out.println("****Details of first product*****");	
  System.out.println("code : " + p1.pcode);
  System.out.println("name : " + p1.pname);
  System.out.println("price : " + p1.price);                      //print the details of product1,product2 and product3
		
  System.out.println("*****Details of second product*****");	
  System.out.println("code : " + p2.pcode);
  System.out.println("name : " + p2.pname);
  System.out.println("price : " + p2.price);
		
  System.out.println("*****Details of third product*****");	
  System.out.println("code : " + p3.pcode);
  System.out.println("name : " + p3.pname);
  System.out.println("price : " + p3.price);
  }
}


/*
----------output-------------------

C:\Users\USER\java_pgms\exercise 2>java Product
lowest Product code is:2
****Details of first product*****
code : 1
name : Benz
price : 500000.0
*****Details of second product*****
code : 2
name : Hyundai
price : 25000.0
*****Details of third product*****
code : 3
name : Audi
price : 45000.0
*/