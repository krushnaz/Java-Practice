public class taworOfhonoi {
    public static void honoi(int n,String source,String helper,String destination){
        if(n == 1){
            System.out.println("transfer "+n+" from "+source+" to "+destination); 
            return;

        }
              honoi(n-1,source,destination,helper);
              System.out.println("transfer "+n+" from "+source+" to "+destination); 
              honoi(n-1,helper,source,destination);   
    }
    public static void main(String[] args) {
        int n = 3;
        honoi(n,"S","H","D");
    }
}
