import java.util.ArrayList;

public class time {
    public static void main(String[] args) {
        String nameArray [] = new String [1000];
        long startTime = System.currentTimeMillis();
        for(int i=0;i<nameArray.length;i++){
            nameArray[i] = "name"+i;
            // System.out.print(i);
        }
         long endTime = System.currentTimeMillis();
         System.out.println("the time taken by array :"+( endTime - startTime)+" ms");

         ArrayList<String> list = new ArrayList<String>();
         startTime = System.currentTimeMillis();
         for(int i=0;i<1000;i++){
            list.add("name"+i);
         }
         endTime = System.currentTimeMillis();
         System.out.println("the time taken by arrayList :"+( endTime - startTime)+" ms");
        //  System.out.println(list);
    }
}
