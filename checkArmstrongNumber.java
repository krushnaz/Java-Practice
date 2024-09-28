public class checkArmstrongNumber {
    checkArmstrongNumber(int number){
        int copyOfNum = number;
        int numOfDigit = String.valueOf(copyOfNum).length();
        int sum = 0;
        while(copyOfNum != 0){ 
            int lastDigit = copyOfNum % 10; // get a last digit of number by mod from copied number
            int lastDigitsPower = 1;
            for(int i=0; i < numOfDigit; i++){
                lastDigitsPower *= lastDigit;
            }

            sum += lastDigitsPower;
            copyOfNum /= 10; // remove last digit from copied number
        }
        if(number == sum){
            System.out.println(number + " is a Armstrong number");
        }else{
            System.out.println(number + " is not a Armstrong number");

        }
    }
    public static void main(String[] args) {
        checkArmstrongNumber ck = new checkArmstrongNumber(371);
    }
}
