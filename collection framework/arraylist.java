import java.util.*;
public class arraylist {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       list.add(1);
       System.out.println(list.size());
       list.add(1);
       list.add(1);
       list.add(1);
       System.out.println(list.size());

    System.out.println( list.containsAll(list));
    
    System.out.println(list.iterator());
    list.add(20);
       
    }
}
