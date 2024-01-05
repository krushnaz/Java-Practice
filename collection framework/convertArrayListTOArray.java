import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class convertArrayListTOArray {
    public static void main(String[] args) {
        String arr[]={"krushna","sopan","zarekar"};
        for(String a1 : arr){
            System.out.println(a1);
        }
        // ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        // System.out.println(list);
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,arr);
        System.out.println(list);
    }
}
