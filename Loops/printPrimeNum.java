public class printPrimeNum {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // Initialize isPrime to true for each i

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false; // If i is divisible by any number in the range [2, i/2], it's not prime
                    break; // No need to continue checking, exit the inner loop
                }
            }

            if (isPrime) {
                System.out.println(i); // If isPrime is still true, then i is prime
            }
        }
    }
}
