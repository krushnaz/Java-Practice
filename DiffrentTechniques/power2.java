public class power2 {
    public static void main(String[] args) {
        int a = 10, b = 5, n = a;
        int pow = 0;

        for(int i=1;i< b;i++){
            pow = 0;
        for(int j=1;j<=a;j++){
            pow +=n;
        }
        n = pow;
        }
        System.out.println(a+"'s power "+b+" is :"+pow);

    }
}
