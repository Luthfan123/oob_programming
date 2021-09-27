// 1.Client server communication using Socket – TCP/IP

import java.io.*; 
import java.net.*; 

public class Client 
{ 
 public static void main(String[] args) 
 { 
  try
  { 
     Socket s=new Socket("localhost",6666); 
     DataOutputStream dt=new DataOutputStream(s.getOutputStream()); 
     dt.writeUTF("Welcome java...."); 
     dt.flush(); 
     dt.close(); 
     s.close(); 
   }
   catch(Exception e){System.out.println(e);} 
 } 
} 
