import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(new myComparator());
        ts.add("minki");
        ts.add("pinki");
        ts.add("rama");
        ts.add("rana");
        ts.add("naga");
        ts.add("chinki");
        System.out.println(ts);
    }

}

 class myComparator implements Comparator{
      public int campare(Object obj1,Object obj2){
        String l1 = obj1.toString();
        String l2 = (String)obj2;  
        // if(l1 < l2)
        // return +1;
        // else if(l1>l2)
        // return -1;
        // else
        // return 0;   
        
        return l2.compareTo(l1);
        // return l1.compareTo(l2);
      }
}