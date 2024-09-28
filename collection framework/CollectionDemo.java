import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        // Collection Interface
        Collection<Integer> col = new ArrayList<>();
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);

        Collection<Integer> col2 = new ArrayList<>();
        col2.add(11);
        col2.add(12);
        col2.add(13);
        col2.add(14);
        col.addAll(col2);

        // col.clear();
        System.out.println("printing elements of collection : ");
        col.forEach(System.out::println);
        int hashcode = col.hashCode();
        System.out.println("Hash Code :" + hashcode);

        boolean isRemoved = col.remove(1);
        System.out.println("Is Removed :"+isRemoved);
        // Object arrayCol[] = col2.toArray();
        // Boolean isContain = col.contains(arrayCol);

        // System.out.println("contains :"+isContain);
        // Iterator<Integer> itr = col.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }
        // Integer size = col.size();
        // System.out.println("Size of collection :" + size);

        // System.out.println(itr.next());
        // System.out.println(col);
    }
}
