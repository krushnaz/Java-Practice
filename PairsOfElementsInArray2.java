import java.sql.Array;
import java.util.Arrays;

public class PairsOfElementsInArray2 {
    static void PairsOfElements(int arr[],int number){
        System.out.println("the pair of element whose sum is "+number);
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;

        while(i < j){
            if(arr[i] + arr[j] == number){
                System.out.println("("+arr[i]+","+arr[j]+")");

                i++;
                j--;
                // System.out.println("i from if :"+i);
                // System.out.println("j from if :"+j);

            }else if(arr[i] + arr[j] < number){
                i++;
                // System.out.println("i from else if :"+i);

            }else if(arr[i] + arr[j] > number){
                j--;
                // System.out.println("j from else if :"+j);

            }
        }
    }
    public static void main(String[] args) {
        PairsOfElements(new int[]{1,2,3,4,5,6,7}, 5);
        PairsOfElements(new int[]{1,2,-3,4,5,6,7}, 5);
    }
}
