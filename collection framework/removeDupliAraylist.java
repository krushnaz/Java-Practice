import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDupliAraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hari");
        list.add("krushna");
        list.add("ram");
        list.add("krushna");
        list.add("hari");
        list.add("sham");
        System.out.println(list);
        System.out.println("duplicate is not allow but insertion order not preserve :");
        HashSet<String> set = new HashSet<String>(list);
        System.out.println(set);
        System.out.println("insertion order preserve :");
        LinkedHashSet<String> linkset = new LinkedHashSet<String>(list);
        System.out.println(linkset);
    }
}
