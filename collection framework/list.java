import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class list{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
    //   int ele = l.get(3);
        // l.removeAll(l);
        // l.remove(2);
       
        System.out.println( l.lastIndexOf(l));
      System.out.println(l);
        ListIterator l1 = l.listIterator();

        
    }
}