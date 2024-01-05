import java.util.LinkedList;
public class linklist2 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("krushna");
        l1.add("tejas");
        l1.add("kishor");
        l1.add("vaishnav");
        l1.add("omkar");
        l1.add(1);
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.addFirst("krushna");

        System.out.println(l1);
        l1.add("ram");
        System.out.println(l1);
        l1.add(3, "sham");
        System.out.println(l1);
    }
}
