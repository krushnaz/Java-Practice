import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int inputNumber = sc.nextInt();

        int copyNum = inputNumber;
        String octal = "";

        int rem = 0;
        while(inputNumber > 0){
            rem = inputNumber % 8;
            octal = rem + octal;
            inputNumber /= 8;
        }
        System.out.println("octal equivalent to "+copyNum+" is :"+octal);
    }
}
