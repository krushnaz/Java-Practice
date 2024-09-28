import java.util.Arrays;
import java.util.Scanner;

public class findTheLeaderElement {
    static void findTheLeader(int input[]){
        int arrLength = input.length;
        int max = input[arrLength-1];
        System.out.println("the leader of "+Arrays.toString(input) +" are :");
        System.out.println(max);
        for(int i = arrLength-1; i >=0; i--){
            if(input[i] > max){
                max = input[i];
                System.out.println(max);
            }
        }
    }
    public static void main(String[] args) {
        findTheLeader(new int[]{10,2,3,4,1,5,7,4,2});
    }
}
