public class CheckIsBinaryOrNot {
    static void isBinaryOrNot(int num){
        int copyNum = num;
        boolean isBinary = true;

        
        while(copyNum != 0){
            int temp = copyNum % 10;
            if(temp > 1){
                isBinary = false;
                break;
            }else{
                copyNum /= 10;
            }
        }
        if(isBinary){
            System.out.println(num+" is binary number!");
        }else{
            System.out.println(num+" is not binary number!");

        }
    }
    public static void main(String[] args) {
        isBinaryOrNot(2101);
        isBinaryOrNot(1010);

    }
}
