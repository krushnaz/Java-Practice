import java.util.*;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("krushna");
        list.add("tejas");
        list.add("kishor");
        list.add("ram");
        list.add("sham");
        list.add("vaishnav");
        ListIterator iterator = list.listIterator();
        System.out.println("element in forward direction ....");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("element in backword direction ....");
        while(iterator.hasPrevious()){
             System.out.println(iterator.previous());
        }
      


    }
}
