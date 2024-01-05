import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range to find prime numbers: ");
        int n = scanner.nextInt();
        System.out.println("Prime numbers between 2 and " + n + " are:");
        
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count == 2) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
