public class propogation {
    void m1(){
        int a = 40/0;
        

    }
    void n1(){
        m1();
    }
    void p1(){
        try{
            n1();
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        propogation p1 = new propogation();
        p1.m1();
        p1.n1();
        p1.p1();
    }
}
