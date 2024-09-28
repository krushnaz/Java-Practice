import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateElement2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,3,5,5,6};
        Arrays.sort(arr);
        HashSet <Integer> set = new HashSet<Integer>();
        for (Integer element : arr) {
            if(!set.add(element)){
                System.out.println("duplicate elements :"+element);
            }
            
        }
    }
}
