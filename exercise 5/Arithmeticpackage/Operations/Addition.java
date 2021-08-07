package Operations;
import java.util.*;
  
interface Add                            
{
  void input();
  void addition();
}
 
public class Addition implements Add               
{
  int n1,n2,a;
  public void input()                             
  {
    Scanner sn=new Scanner(System.in);
    n1=sn.nextInt();
    n2=sn.nextInt();
  }
  
  public void addition()                     
  {
   a=n1+n2;
   System.out.println("Addition:" +a);
  }
} 