import java.util.Iterator;
import java.util.LinkedList;

public class collection_linklist {
    static int count = 0;
    public static void main(String[] args) {

        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        // Iterator<Integer> itr = li.iterator();
        // while(itr.hasNext()){
        //     System.out.println("["+(count++)+"]" +itr.next());
        // }
        System.out.println(li);

    }
}
