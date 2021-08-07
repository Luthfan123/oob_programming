package Graphics;
import java.util.*;
interface CircleInterface
{
  void input();
  void area();
}

public class Circle implements CircleInterface
{
  int radius;
  double pi=3.14,area;
  public void input()                                 
  {
    Scanner cn=new Scanner(System.in);       
    radius=cn.nextInt();
  }
  public void area() 
  { 
   area=pi*radius*radius;
   System.out.println("AREA OF CIRCLE :"+area);
  }
}

