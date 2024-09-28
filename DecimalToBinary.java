import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert into binary : ");
        int inputNumber = sc.nextInt();

        String binary = "";
        int copyNum = inputNumber;

        int rem = 0;

        while(inputNumber > 0){
            rem = inputNumber % 2;
            binary = rem + binary;
            inputNumber /= 2;
            System.out.println(inputNumber);
        }

        System.out.println("Binary equivalent of "+copyNum+" is :"+binary);
    }
}
