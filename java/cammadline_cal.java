public class cammadline_cal{
    /**
     * @param args
     */
    public static void main(String []args){
        int num1 =0;
        int num2 = 0;
        String oper ="";
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        // oper = Integer.toString(args[2]);
        switch(oper){
            case "+" :
            int add = num1 + num2;
            break;

            case "-" :
            int sub = num1 + num2;
            break;

            case "*" :
            int mul = num1 + num2;
            break;

            case "/" :
            int div = num1 + num2;
            break;
            default :
            System.out.println("enter a valid operator..");

        }

    }
}