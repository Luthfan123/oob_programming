/*1.Define a class ‘product’ with data members pcode, pname and price. Create 3
objects of the class and find the product having the lowest price*/

import java.util.Scanner;

class Product{               //create class
    int pcode,price;
    String pname;

 Product(int c,String n,int p)          //constructor
 {
   pcode=c;
   pname=n;
   price=p;
}
}

//main class

class Productmain{
  public static void main(String args[]){

  Product P1= new Product(101,"Audi",5000000);

  System.out.println("****Details of first product*****");
  System.out.println("Product name:" + P1.pname);
  System.out.println("Product code:" + P1.pcode);
  System.out.println("Product price:" + P1.price);

  int pcode,price;
  String pname;
  
  pcode=102;
  price=250000;
  pname="Hyundai";

Product P2=new Product(pcode,pname,price);
  System.out.println("****Details of second product*****");
  System.out.println("Product name:" + P2.pname);
  System.out.println("Product code:" + P2.pcode);
  System.out.println("Product price:" + P2.price);

 Scanner sn = new Scanner(System.in);
 
 System.out.print("Enter product name : ");
 pname = sn .next();
 
 System.out.print("Enter product code: ");
 pcode = sn .nextInt();
 
 System.out.print("Enter product price : ");
 price = sn .nextInt();
 
 Product P3 =new Product(pcode,pname,price);
   System.out.println("****Details of third product*****");
   System.out.println("Product name  : "+ P3.pname); 
   System.out.println("Product code  : "+ P3.pcode);
   System.out.println("Product price : "+ P3.price); 

    System.out.println("---------Lowest price---------");
 if(P1.price < P2.price && P1.price < P3.price){
    System.out.println("Lowest price : "+ P1.pname);
    System.out.println("Code : "+ P1.pcode);
    System.out.println("Price: "+ P1.price);
   }
 else if( P2.price < P1.price && P2.price < P3.price ){
 
    System.out.println("Lowest price : "+ P2.pname);
    System.out.println("Code : "+ P2.pcode);
    System.out.println("Price: "+ P2.price);

 }
 else{
     System.out.println("Lowest price : "+ P3.pname);
     System.out.println("Code : "+ P3.pcode);
    System.out.println("Price: "+ P3.price);   
 }

}
}


/*
--------------output-----------------------

C:\Users\USER\java_pgms\exercise 2>javac Productmain.java

C:\Users\USER\java_pgms\exercise 2>java Productmain
****Details of first product*****
Product name:Audi
Product code:101
Product price:5000000
****Details of second product*****
Product name:Hyundai
Product code:102
Product price:250000
Enter product name : Benz
Enter product code: 103
Enter product price : 7500000
****Details of third product*****
Product name  : Benz
Product code  : 103
Product price : 7500000
---------Lowest price---------
Lowest price : Hyundai
Code : 102
Price: 250000
*/