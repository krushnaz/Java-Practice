import java.util.Arrays;

public class SeparateZerosFromNonZeros {
    static void moveZerosToEnd(int input[]){
        int counter = 0;
        for(int i=0; i< input.length;i++){
            if(input[i] != 0){
                input[counter] = input[i];
                counter++;
                System.out.println("counter 1 :"+counter);
            }
        }
        while(counter < input.length){
            input[counter] = 0;
            counter++;
            System.out.println("counter 2 :"+counter);
        }
        System.out.println(Arrays.toString(input));
    }
    public static void main(String[] args) {
        moveZerosToEnd(new int[]{1,2,3,4,0,8,6,7,0});
    }
}
