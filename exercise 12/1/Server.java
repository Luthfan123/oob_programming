
import java.io.*; 
import java.net.*; 
public class Server 
{ 
 public static void main(String[] args)
 { 
  try{ 
         ServerSocket ss=new ServerSocket(6666); 
         Socket s=ss.accept();//establishes connection 
         DataInputStream dis=new DataInputStream(s.getInputStream()); 
         String str=(String)dis.readUTF(); 
         System.out.println("MESSAGE= "+str); 
         ss.close(); 
      }
     catch(Exception e){System.out.println(e);} 
  } 
}


/
-----------output---------------

MESSAGE= Welcome java....

*/