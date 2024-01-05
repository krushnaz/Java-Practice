import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("krushna");
        list.add("tejas");
        list.add("kishor");

        // boolean con = list.contains("krushna");
        // if(con == true){
        //     System.out.println("list contain this element ");
        //    int data =  list.indexOf("zarekar");
        //    System.out.println(data);
        // }
        // else{
        //     System.out.println("list does not contain this element ");
        // }

        Iterator<String> it = list.descendingIterator();
        while(it.hasNext()){
          System.out.println(it.next());
        }
    }
}
