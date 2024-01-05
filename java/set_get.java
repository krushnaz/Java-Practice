import java.util.*;
public class set_get {
    public static void main(String[] args) {
       List<String> list = new ArrayList<String>();
       list.add("mango");
       list.add("apple");
       list.add("custrdapple");
       list.add("orange");
       list.add("banana");

       System.out.println("printing second element :"+list.get(1));
       list.set(1,"papai");
       list.set(1, null);
       for(String list1 : list){
        System.out.println(list1);
       }

    }
}
