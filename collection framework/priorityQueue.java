import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue<>();
        
        for(int i=10;i>=0;i--){
             q.offer(i);
        }
        System.out.println(q);
        Collections.sort(q);
        

    }
}
