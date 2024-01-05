import java.util.*;
public class joinArraytoLinkList {
    public static void main(String[] args) {
      
        LinkedList<String> linklist = new LinkedList<String>();
        // linklist.add("krushna");
        // linklist.add("tejas");
        // linklist.add("kishor");
        // linklist.offer("ram");        
        // linklist.offerFirst("hari");
        // linklist.offerLast("omkar");
        //  System.out.println(linklist);
            // linklist.poll();
            // linklist.remove();
            // linklist.removeFirst();
            // linklist.pollFirst();
            // linklist.pollLast();
            // linklist.set(0, "zero");
             
            // System.out.println(linklist.getFirst());
            // System.out.println(linklist.get(4));
            // System.out.println(linklist.getLast());

            // System.out.println();
            // System.out.println(linklist.peekFirst());
            // System.out.println(linklist.peek());
            // System.out.println(linklist.peekLast());
        //     System.out.println(linklist.size());

        // System.out.println(linklist);
             
        linklist.push("one");
        linklist.push("two");
        linklist.push("three");
        linklist.push("four");
        linklist.push("six");
        linklist.push("seven");
        // linklist.pop();
        System.out.println(linklist);
        Collections.reverse(linklist);
        System.out.println(linklist);
    }
}
