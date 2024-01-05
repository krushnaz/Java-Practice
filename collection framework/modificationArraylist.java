import java.util.ArrayList;
import java.util.ListIterator;

public class modificationArraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("krushna");
        list.add("tejas");
        list.add("kishor");
        list.add("omakr");
        list.add("ganesh");
         System.out.println(list);
        ArrayList<String> list2 = new ArrayList<String>(list);
        list2.addAll(3,list2);
        System.out.println(list2);
        // list2.removeAll(list2);
        // System.out.println(list2);
        ListIterator itr = list2.listIterator();
        while(itr.hasNext()){
             System.out.print(itr.next());
             System.out.println();
            //  System.out.print(itr.previous());
        }
    }
}
