import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);
        a1.add(10);
        a1.add(11);

        Iterator<Integer> list = a1.iterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        
    }
}
