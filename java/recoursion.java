public class recoursion {
    static void febo(int n,int a,int b){
        if(n == 0){
            return ;
        }
        
        System.out.println(a);
    
        febo(n-1,b,a+b);
    }
    public static void main(String[] args) {
        febo(8, 0,1);

    }
}
