import java.util.*;
public class collection_sort {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("mango");
        a1.add("papai");
        a1.add("apple");
        a1.add("banana");
        Collections.sort(a1);
        System.out.println("sorting Strings....");
        for(String fruits : a1){
            System.out.println(fruits);
        }
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(10);
        l1.add(34);
        l1.add(23);
        l1.add(29);
        Collections.sort(l1);
        System.out.println("sorting integers....");

        for(int num : l1){
            System.out.println(num);
        }
System.out.println();
        System.out.println("traversing the array ......");
        ListIterator<Integer> list1 =l1.listIterator(l1.size()); 
        while(list1.hasPrevious()){
            Integer str = list1.previous();
            System.out.println(str);
        }
    }
}
