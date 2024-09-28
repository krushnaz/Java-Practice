import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateEle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
        list.add("JSP");
        list.add("ASP");
        list.add("JAVA");
        list.add("C++");

        System.out.println("printing list with duplicate element :");
        System.out.println(list);
        HashSet<String> set = new HashSet<String>(list);
        System.out.println("printing list without duplicate elements :");
        System.out.println(set);

    }
}
