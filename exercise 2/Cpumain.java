/* 5.Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.  */

import java.util.Scanner;
class Cpu  //outer class
{
 int price;
  
 class Processor   //inner class
 { 
        int no_of_cores;
       String manufacturer;

   //display
   void display()
   {
      System.out.println("Number of cores: " +no_of_cores);
      System.out.println("The Processor manufacturer: " +manufacturer);
   }
     
 }
  static class Ram  //nested class
  {
   String manufacturer;
   int memory;
   
    void display()
    {
      System.out.println("RAM Manufacturer: " +manufacturer);
      System.out.println("RAM memory: " +memory);
     }

  }
  void display() //display of price
   {
     System.out.println("Price: " +price);
   }
}

//main class

class Cpumain
{
 public static void main(String args[])
 {
  Cpu cp = new Cpu();               //object for cpu
  Cpu.Processor processor = cp.new Processor();          //object for processor class
  Cpu.Ram ram=new Cpu.Ram();            //object for ram class
  
   Scanner sn=new Scanner(System.in);

   System.out.print("Enter no.of cores:");
   processor.no_of_cores=sn.nextInt();
   System.out.print("Enter processor manufacturer name:");
   processor.manufacturer=sn.next();
   
   System.out.print("Enter memory:");
   ram.memory=sn.nextInt();
   System.out.print("Enter ram manufacturer name:");
   ram.manufacturer=sn.next();

   System.out.print("Enter the Price:");
   cp.price=sn.nextInt();
   
   System.out.println("-----INFORMATION OF PROCESSOR AND RAM-----");
   
//calling display  function

   ram.display();
   processor.display();
   cp.display();
 }
}

/*
---------output-----------------


C:\Users\USER\java_pgms\exercise 2>javac Cpumain.java

C:\Users\USER\java_pgms\exercise 2>java Cpumain
Enter no.of cores:16
Enter processor manufacturer name:intel
Enter memory:8
Enter ram manufacturer name:kingston
Enter the Price:45000
-----INFORMATION OF PROCESSOR AND RAM-----
RAM Manufacturer: kingston
RAM memory: 8
Number of cores: 16
The Processor manufacturer: intel
Price: 45000

*/

