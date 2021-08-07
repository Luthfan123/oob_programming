package Graphics;
import java.util.*;
//interface for square
interface SqrInterface
{
  void input();
  void area();
}
public class Square implements  SqrInterface
{
  int side;
  double area;
  public void input()                                 
  {
    Scanner sn=new Scanner(System.in);       
    side=sn.nextInt();
  }
  public void area() //method for calculate area
  { 
     area=side*side;
     System.out.println("AREA OF SQUARE : "+area);
  }
}