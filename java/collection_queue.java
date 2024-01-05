import java.util.Iterator;
import java.util.PriorityQueue;

import javax.lang.model.element.Element;

public class collection_queue {
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<String>();
        q1.add("omkar");
        q1.add("krishna");
        q1.add("pravin");
        q1.add("ram");
        q1.add("sham");

        System.out.println("head :"+q1.element());
        System.out.println("head :"+q1.peek());

        System.out.println("all element :");
        Iterator<String> itr = q1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            q1.remove();
            q1.poll();
            System.out.println("after removing element :");
            Iterator<String> itr2 = q1.iterator();
            while(itr2.hasNext()){
                System.out.println(itr2.next());
            }
        }

    }
}
