import java.util.Scanner;

class Utility{
    static boolean numberOrNot(String number){
        try{
            Integer.parseInt(number);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
public class CheckMobileNumber {
    public static void main(String arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 digit phone number...");
        String input = sc.next();
        if(Utility.numberOrNot(input) && input.length() == 10){
            System.out.println("Good...! you have entered valid phone number");
        }else{
            System.out.println("please enter valid phone number");

        }
    }
}
