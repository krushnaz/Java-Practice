public class sumOfAllDigits {
    sumOfAllDigits(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("sum of digit is :"+sum);
    }
    public static void main(String[] args) {
        sumOfAllDigits s = new sumOfAllDigits(12345);
    }
}
