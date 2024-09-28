import java.util.Arrays;

public class LeadersInArray {
    public static void main(String[] args) {
        int arr[] = {10,2,3,4,1,5,7,4,2};
        System.out.println("the leader of "+Arrays.toString(arr) +" are :");

        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i]);
            }
        }
    }
}
