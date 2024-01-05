public class throws1 {
    static void m1() throws NullPointerException{
       throw new NullPointerException("this is arthematic exception");
    }
    public static void main(String[] args) {
        // throws1 t1 = new throws1();
        // t1.m1();
        try{
            m1();
            
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
    }

}
