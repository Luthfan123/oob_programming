package Graphics;

import java.util.*;
interface RectInterface //interface created
{
  void input();
  void area();
}
public class Rectangle implements  RectInterface
{
  int length,breadth;
  double area;
 public void input()
 {
   Scanner rn=new Scanner(System.in);
   length=rn.nextInt();
   breadth=rn.nextInt();
 }
  public void area() 
  {
    area=length*breadth; //calculate area
    System.out.println("AREA OF RECTANGLE :"+area);
  }  
}