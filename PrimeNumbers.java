public class PrimeNumbers {
    

    // Function to check if a number is prime
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any other number, it's not prime
            }
        }

        return true; // If the number is not divisible by any other number, it's prime
    }
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");

        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

    }
}
