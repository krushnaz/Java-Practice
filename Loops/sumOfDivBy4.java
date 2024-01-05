public class sumOfDivBy4 {
    public static void main(String[] args) {
        int sum = 0 ;
        int i = 0;
        do{
            sum += i;
            i+=4;
            // System.out.println(sum);
        }while(i <= 10 );
        System.out.println(sum);
    }
}
