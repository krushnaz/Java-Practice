import java.util.PriorityQueue;

public class proirityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(11);
        q.add(32);
        q.add(23);
        q.add(14);
        q.add(12);
        q.add(19);
        System.out.println(q);
        // q.offer(11);
        // q.offer(32);
        // q.offer(23);
        // q.offer(14);
        // q.offer(12);
        // q.offer(19);
        // System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
      
    }
}
