import java.util.Scanner;

public class ReverseAddPalindrome {
    static int reverse(int num) {
        int rem = 0;
        int rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        return rev;
    }

    static boolean checkPalindrome(int num) {
        int reverse = reverse(num);
        if (reverse == num) {
            return true;
        } else {
            return false;
        }
    }

    static void reverseAndAdd(int num){
        if(checkPalindrome(num)){
            System.out.println("this number is palindrome");
        }else{
            while(!checkPalindrome(num)){
                int reverse = reverse(num);
                int sum = num + reverse;
                System.out.println(num+" + "+reverse+" = "+ sum);
                num = sum;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        reverseAndAdd(num);
    }
}
