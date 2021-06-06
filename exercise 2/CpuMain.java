/*  5.Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer)and static nested class RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.  */

import java.util.Scanner;
class Cpu  //outer class
{
 int price;
  
 class Processor              //inner class
 { 
   String no_of_cores,manufacturer;
 }
  static class Ram          //nested class
  {
   String manufacturer;
   int memory;
  }
}

//main class

class CpuMain
{
 public static void main(String args[])
 {
  Cpu cp = new Cpu();           //object for main class
  Cpu.Processor processor = cp.new Processor();      //object for processor class
  Cpu.Ram ram=new Cpu.Ram(); //object for ram class
  
   Scanner sn=new Scanner(System.in);

   System.out.print("Enter no.of cores:");
   processor.no_of_cores=sn.next();
   System.out.print("Enter manufacturer:");
   processor.manufacturer=sn.next();
   
   System.out.print("Enter memory:");
   ram.memory=sn.nextInt();
   System.out.print("Enter manufacturer:");
   ram.manufacturer=sn.next();

   System.out.print("Enter the Price:");
   cp.price=sn.nextInt();
   
   System.out.println("-----INFORMATION OF PROCESSOR AND RAM-----");
   System.out.println("Processor Manufacturer:" + processor.manufacturer);
   System.out.println("No of Cores of Processor:" + processor.no_of_cores);

   System.out.println("RAM Memory:" + ram.memory);
   System.out.println("RAM Manufacturer:" + ram.manufacturer);

   System.out.println("Price:" + cp.price);
 }
}

/*
---------------output--------------


C:\Users\USER\java_pgms\exercise 2>javac CpuMain.java

C:\Users\USER\java_pgms\exercise 2>java CpuMain
Enter no.of cores:16
Enter manufacturer:intel
Enter memory:16
Enter manufacturer:kingston
Enter the Price:45000
-----INFORMATION OF PROCESSOR AND RAM-----
Processor Manufacturer:intel
No of Cores of Processor:16
RAM Memory:16
RAM Manufacturer:kingston
Price:45000

*/

