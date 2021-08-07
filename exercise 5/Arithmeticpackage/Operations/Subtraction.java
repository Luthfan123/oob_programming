package Operations;
import java.util.*;
  
interface Sub                            
{
  void input();
  void diff();
}
 
public class Subtraction implements Sub               
{
  int n1,n2,d;
  public void input()                             
  {
    Scanner sn=new Scanner(System.in);
    n1=sn.nextInt();
    n2=sn.nextInt();
  }
  
  public void diff()                     
  {
   d=n1-n2;
   System.out.println("Subtraction:" +d);
  }
} 