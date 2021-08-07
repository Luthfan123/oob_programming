package Operations;
import java.util.*;
  
interface Mult                            
{
  void input();
  void multiplication();
}
 
public class Multiplication implements Mult              
{
  int n1,n2,p;
  public void input()                             
  {
    Scanner sn=new Scanner(System.in);
    n1=sn.nextInt();
    n2=sn.nextInt();
  }
  
  public void multiplication()                     
  {
   p=n1*n2;
   System.out.println("Multilpication:" +p);
  }
} 