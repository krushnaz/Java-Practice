import java.util.Arrays;

public class EqualityOfTwoArray2 {
    public static void main(String[] args) {
        String arr1[] = {"krushna","ram","sangram","shubham","aditya"};
        String arr2[] = {"krushna","ram","sangram","shubham","aditya"};

        String arr3[][] = {{"krushna","ram","sangram","shubham","aditya"},{"kunal","shreyas"}};
        String arr4[][] = {{"krushna","ram","sangram","shubham","aditya"},{"kunal","shreyas"}};


        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr3, arr4));

        //when we want to campare 2 diamentional array then use deep Equal method
        System.out.println(Arrays.deepEquals(arr3, arr4));
    }
}
