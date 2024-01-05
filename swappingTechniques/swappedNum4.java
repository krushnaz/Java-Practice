public class swappedNum4 {
    public static void main(String arg[]){
        int a = 10, b = 20;

        a = (a + b)-(b = a);

        System.out.println("swapped number :"+a +"   "+b);

    }
}
