package Graphics;
import java.util.*;
interface TriInterface
{
  void input();
  void area();
}
public class Triangle implements  TriInterface
{
  int base,height;
  double area;
 public void input()
 {
   Scanner tn=new Scanner(System.in);
   base=tn.nextInt();
   height=tn.nextInt();
 }
  public void area() 
  {
    area=0.5*base*height;
    System.out.println("AREA OF TRIANGLE :"+area);
  }  
}