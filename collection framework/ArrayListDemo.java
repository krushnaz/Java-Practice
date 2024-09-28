import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        boolean a = list.removeAll(list);
        System.out.println(a);
        // System.out.println(list.size());
        // System.out.println(list.get(2));
        // System.out.println(list.get(Integer.parseInt("1")));
        // list.forEach(System.out::println);
    }
}
