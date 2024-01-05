import java.util.*;
public class listiterator {
    public static void main(String[] args) {
        List<String> list = new LinkedList();
        list.add("krushna");
        list.add("tejas");
        list.add("kishor");
        list.add("omkar");
        list.add("ram");

        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            String s = (String)itr.next();
            if(s.equals("ram")){
                itr.remove();
            }
            if(s.equals("omkar")){
                itr.add("pratik");
            }
        }
        System.out.println(list);
    }
}
