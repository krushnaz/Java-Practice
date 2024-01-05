public class swapNumber {
    public static void main(String[] args) {
        int a = 5,b=10 ;
        // temp = a;
        // a = b;
        // b = temp;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = "+a + " b = "+ b);
    }
}
