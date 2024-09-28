import java.util.Scanner;

public class ATM {
    static int withrow = 0;
    static int deposite = 0;
    static int balance = 0;


    static int deposite(int n){
        if(n >= 1){

            balance = balance+n;
            System.out.println("you have been deposited : "+n);
        }
        else{
            System.out.println("you have enter 0 or negative value");
        }
    return balance;
    }

    static int withrow(int n){
        if(n >= 1){

            balance = balance - n;
            System.out.println("you have been withrawed :"+n);

        }
        else if(balance <= 0){
            System.out.println("no sufficent balance available");
        }
        else{
            System.out.println("you have enter 0 or -ve ammount");
        }
        return balance;
    }

    static int checkBalance(){
        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        while(true){
            System.out.println("1. DEPOSITE MONEY");
            System.out.println("2. WITHRAW MONEY");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4.EXIT");
            System.out.println("choice the operation do you want to perform :");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :
                System.out.println("enter amount for deposite :");
                int depo = sc.nextInt();
                deposite(depo);
                // System.out.println("you have been deposited : "+depo);
                break;

                case 2 :
                System.out.println("enter ammount do you want to withraw :");
                int with = sc.nextInt();
                withrow(with);
                // System.out.println("you have been withrawed :"+with);
                break;

                case 3 :
                System.out.println("your total balance is "+checkBalance() );
                break;
                case 4 :
                System.out.println("exit.....");
                break;
                default :
                System.out.println("enter right option .......");

            }
        }
    }
}
