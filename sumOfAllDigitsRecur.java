public class sumOfAllDigitsRecur {
    int sumOfAllDigits(int number){
        
        int sum = 0;
      
        if(number == 0){
            return sum;
        }
        else{
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
          sum += sumOfAllDigits(number);
          System.out.println(sum);
        }
        System.out.println("number is :"+number);
        return sum;
    }
    public static void main(String[] args) {
        sumOfAllDigitsRecur s = new sumOfAllDigitsRecur();
        int result = s.sumOfAllDigits(416872);
        System.out.println("sum of the digit is :"+result);
    }
}
