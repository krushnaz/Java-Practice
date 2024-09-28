import java.util.Scanner;

public class exaDecimal {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert into hexa decimal :");
        int inputNumber = sc.nextInt();

        int copyNum = inputNumber;
        String hexaDecimal = "";

        char hexa[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem = 0;
        while(inputNumber > 0){
            rem = inputNumber % 16;
            hexaDecimal = hexa[rem] + hexaDecimal;
            inputNumber /= 16;
        }
        System.out.println("hexa equivalent of "+copyNum+" is :"+hexaDecimal);
    }
}
