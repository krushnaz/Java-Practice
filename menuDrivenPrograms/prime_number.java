import java.util.Scanner;
class prime_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        int num  = 0,mid = 0;
        num = sc.nextInt();
        boolean flag = true;
         mid = num/2;
         if(num == 0 || num == 1){
            System.out.println(num+" it is not prime number");
         }
         else {
            for(int i=2;i<=mid;i++){
                if(num % i == 0){
                    System.out.println(num+" it is not prime number");
                    flag = false;
                    break;
                }
            }

         if(flag == true){
                        System.out.println(num+" it is prime number");

         }
    }
         }

}