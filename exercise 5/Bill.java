/* 2.Prepare bill with the given format using calculate method from  interface

Order No.
Date:
---------------------------------------------------
Product Id     Name   Quantity   Unit_Price  Total
---------------------------------------------------
101              A        2         25        50
102              B        1         100       100
---------------------------------------------------
Net.Amount 150
*/


import java.util.*;
interface BillGen
{
  int calculate();
}

class ProductB implements BillGen
{
  String name;
  int pid,quantity,unit_price,total;
  ProductB(){}
  ProductB(String n,int p,int q, int u)
  {
    name=n;
    pid=p;
    quantity=q;
    unit_price=u;
  }
public int calculate()
{
  total=quantity+unit_price;
  return total;
}
}

//main class
public class Bill{
  public static void main(String args[])
  {
    ProductB[][]order;
    System.out.println("Enter number of orders:");
    Scanner sn=new Scanner(System.in);
    int n=sn.nextInt();
    order=new ProductB[n][];

    for(int i=0;i<n;i++)
    {
     System.out.print("Enter number of products:");
     int m=sn.nextInt();
     order[i]=new ProductB[m];
     for(int j=0;j<m;j++)
     {
       System.out.print("\nEnter product  name:");
       String a=sn.next();
       System.out.print("Enter product id:");
       int b=sn.nextInt();
       System.out.print("Enter product quantity:");
       int c=sn.nextInt();
       System.out.print("Enter product unit price:");
       int d=sn.nextInt();
       
       ProductB pb=new ProductB(a,b,c,d);
       order[i][j]=pb;
       order[i][j].total=order[i][j].calculate();
      }

  }
     for(int i=0;i<n;i++)
     {
       int sum=0;
       System.out.println("\nOrder No:"+(i+1));
       Date date=java.util.Calendar.getInstance().getTime(); //current time and date
       System.out.println(date);
       System.out.println("------------------------------------------------------------------------------------");
       System.out.printf("%5s %20s %25s %10s %10s","ProductId","Name","Quantity","Unit_Price","Total");
       System.out.println(); 
       System.out.println("------------------------------------------------------------------------------------");
       for(int j=0;j<order[i].length;j++)
       {
          System.out.printf("%5s %20s %25s %10s %10s",order[i][j].pid,order[i][j].name,order[i][j].quantity,order[i][j].unit_price,order[i][j].total);
          System.out.println(); 
        }
        System.out.println("-----------------------------------------------------------------------------------");
        for(int k=0;k<order[i].length;k++)
         sum=sum+order[i][k].total;
         System.out.println("Net Amount:" +sum);
         System.out.println("----------------------------------------------------------------------------------");
 }
}
}

/*
-----------output----------------

C:\Users\USER\java_pgms\exercise 5>java Bill

Enter number of orders:
1
Enter number of products:2

Enter product  name:pencil
Enter product id:001
Enter product quantity:20
Enter product unit price:5

Enter product  name:Eraser
Enter product id:002
Enter product quantity:10
Enter product unit price:3

Order No:1
Thu Aug 05 15:27:08 IST 2021
------------------------------------------------------------------------------------
ProductId                 Name                  Quantity Unit_Price      Total
------------------------------------------------------------------------------------
    1               pencil                        20          5         25
    2               Eraser                        10          3         13
-----------------------------------------------------------------------------------
Net Amount:38
----------------------------------------------------------------------------------

*/
//Verified
