public class swappedNum2 {
    public static void main(String arg[]){
        int a = 10, b = 20;
        // a = a - b;
        // b = a + b ;
        // a = a - b;

        b = b - a;
        a = b + a;

        System.out.println("swapped number is :"+a +"  "+b);
    }
}
