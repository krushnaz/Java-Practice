import java.util.Arrays;

public class MissingNumberInArray {
    static int sumOfNumber(int num){
        int sum = (num *(num+1))/2;
        return sum;
    }

    static int sumOfElements(int[] arr){
        int sum = 0;
        for(int i=0;i < arr.length;i++){
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int num = 8;
        int arr[] = {1,4,5,3,7,8,6};
        int sumOfNum = sumOfNumber(num);
        
        System.out.println("sum of number :"+sumOfNum);
        int sumOfElement = sumOfElements(arr);
        System.out.println("sum of element is :"+sumOfElement);

        int missingNumber = sumOfNum - sumOfElement;

        System.out.println("the missing number is :"+missingNumber);
    }
}
