public class factorialnumber {
    static int fact(int num){
        if(num == 0){
            return 1;
        }
        
     return(num *fact(num-1));  
    }
    public static void main(String[] args) {
       int fact = fact(5);
       System.out.println(fact);
    }
}
