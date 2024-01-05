import java.security.DrbgParameters.Capability;
import java.util.*;
public class vector {
    public static void main(String[] args) {
       Vector v = new Vector<>();
       System.out.println(v.capacity());
       for(int i=0;i<10;i++){
        v.addElement(i);
       } 
       System.out.println(v);
       System.out.println();
       System.out.println(v.capacity());
       v.add("v");
       System.out.println(v);
       System.out.println();
       System.out.println(v.capacity());

    }
}
