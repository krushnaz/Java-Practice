public class factorial {
    public static void main(String rushi[]){
        int fact = 0;
        int num = 5;

        while(num > 0){
            fact *= num;
            num --;
        }
        System.out.println(fact);

    }
}
