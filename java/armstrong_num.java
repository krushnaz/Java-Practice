public class armstrong_num {
   
    static public void armstrong(int num,int pow){
     
        int original = 0, sum=0,rem=0,result=0;
        original = num;
        while(original > 0){
            rem = original % 10;
            result +=Math.pow(rem,pow);
            original/= 10;
        }
        if(result == num){
            System.out.println("this is armstrong number");
        }
        else{
            System.out.println("this is not armstrong number");

        }
    }
    public static void main(String[] args) {
       
       armstrong(153, 3);
    }
}
