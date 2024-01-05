import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class reverseArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("gold");
        list.add("cobalt");
        list.add("iron");
        list.add("nikel");
        list.add("silver");
        list.add("zinc");
        list.add("copper");
         System.out.println("before reverse list :");
         System.out.println(list);
         System.out.println("after reverse list :");
         Collections.reverse(list);
         System.out.println(list);
         Collections.rotate(list, 2);
         System.out.println(list);
    }
}
