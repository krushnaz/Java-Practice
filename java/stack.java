import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        for(int i = 0; i<10;i++){
            s1.push(i);
        }
        System.out.println(s1);
        Enumeration e = s1.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            if(i % 2 == 0){

                System.out.println(i);
            }
           
        }
        System.out.println(s1);
        
    }
}
