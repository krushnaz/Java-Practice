import java.util.*;
class ArthOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
      

        String option = "y";
        while(option.equals("y") || option.equals("Y")){
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.println("press number to perform the operation");
         int number = sc.nextInt();

            System.out.println("Enter Number 1");
            num1 = sc.nextInt();
            System.out.println("Enter Number 2");
            num2 = sc.nextInt();
        
           
        switch(number){

            case 1 :
                  result = num1 + num2;
                  System.out.println("Addtion of "+num1+" and "+num2+" is :"+result);
                  break;

            case 2 :
                  result = num1 - num2;
                  System.out.println("Substraction of "+num1+" and "+num2+" is :"+result);
                  break; 
                  
            case 3 :
                  result = num1 * num2;
                  System.out.println("Multiplication of "+num1+" and "+num2+" is :"+result);
                  break; 
                  
            case 4 :
                  result = num1 / num2;
                  System.out.println("Division of "+num1+" and "+num2+" is :"+result);
                  break;

            case 0 :
                  System.exit(0);
                  break;

            default :
            System.out.println("enter valid number");


        }
            System.out.println("Do you want to continue [Y/N]");
            option = sc.next();
            
        }
        sc.close();
    }
}