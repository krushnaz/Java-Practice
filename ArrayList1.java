import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.trimToSize();
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(30));
        System.out.println(list.indexOf(30));
        System.out.println(list.lastIndexOf(30));
        System.out.println(list.get(1));
        // list.set(0, 1);
        // list.remove(0);
        // list.clear();
        Object[] obj = list.toArray();
        System.out.println(obj);
        for (Object x : obj) {
            System.out.print(" "+x);
        }
        System.out.println();
        System.out.println(list);
        List<Integer> lst = list.subList(1, 4);
        System.out.println(lst);
    }
}
