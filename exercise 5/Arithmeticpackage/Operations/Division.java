package Operations;
import java.util.*;
  
interface Div                           
{
  void input();
  void div();
}
 
public class Division implements Div               
{
  int n1,n2,b;
  public void input()                             
  {
    Scanner sn=new Scanner(System.in);
    n1=sn.nextInt();
    n2=sn.nextInt();
  }
  
  public void div()                     
  {
   b=n1/n2;
   System.out.println("Division:" +b);
  }
} 