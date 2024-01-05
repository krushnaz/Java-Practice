//write a program to find a method without using any method
public class Power {
    public static void main(String[] args) {
        int num = 10;
        int pow = 5;
        int result = 1;

        for(int i=1;i<=pow;i++){
            result *= num;
        }
        System.out.println(num+"'s power "+pow+" is :"+result);
    }
}
