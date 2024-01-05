import java.io.*;  
class M{  
   
}  
public class exep{  
    static void method()throws IOException{  
  throw new IOException("device error");  
 }
   public static void main(String args[]) throws IOException{  
     method();  
   } 
}  