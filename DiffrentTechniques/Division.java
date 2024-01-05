public class Division {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int count = 0;

       while(a >= b){
        a = a-b;
        count++;
       }
       System.out.println("the division of two number is :"+count);
    }
}
