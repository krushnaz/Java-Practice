import java.util.Iterator;
import java.util.Vector;

public class collection_vector {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<String>();
        v1.add("tejas");
        v1.add("santosh");
        v1.add("akshay");
        v1.add("pravin");
        Iterator<String> itr = v1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
