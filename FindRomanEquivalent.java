import java.util.Scanner;

public class FindRomanEquivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String romanSymbols[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int decimals[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        System.out.println("Enter the decimal number between 1 and 3999");
        int input = sc.nextInt();

        int copyNum = input;
        String roman = "";

        if (input >= 1 && input <= 3999) {
            for (int i = 0; i < 13; i++) {
                while (input >= decimals[i]) {
                    input = input - decimals[i];
                    roman = roman + romanSymbols[i];
                }
            }

            System.out.println("Roman equivalent of "+copyNum+" is :"+roman);
        }else{
            System.out.println("Invalid Number");
        }
    }
}
