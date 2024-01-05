import java.util.*;
public class collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("pravin");
        list.add("krishna");
        list.add("tejas");
        list.add("omkar");
        list.add("kishor");
        Iterator<String> i1 = list.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
