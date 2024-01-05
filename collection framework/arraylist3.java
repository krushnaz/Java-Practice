import java.util.ArrayList;

public class arraylist3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("krushna");
        list.add("ram");
        list.add("soma");
        list.addAll(list);
        ArrayList list1 = new ArrayList<>(20);
        System.out.println(list1.size());
        ArrayList list2 = new ArrayList<>(list);
        System.out.println(list2);
       list2.ensureCapacity(20);
       list2.trimToSize();
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());
        System.out.println();
        Object [] array= list2.toArray();

        for(Object a1 : array){
            System.out.println(a1);
        }

        System.out.println("\n");
        System.out.println(list2.get(2));
        System.out.println(list2.set(2,"bb"));
        System.out.println(list2);
        list2.clear();
        System.out.println(list);
    }
}
