abstract class ArthiOp{
    int a,b;
    abstract void add();
    abstract void sub();
    abstract void div();
    void multi(){
        int a = 10; 
        int b = 20;
        int c = a * b;
        System.out.println("multiplication :"+c);
    }

} 


public class AbstractClass  extends ArthiOp{
    AbstractClass(){
        this.a =20;
        this.b = 10;
    }

    public void add(){
           System.out.println("Addition :"+(a + b));
    }
     public void sub(){
         System.out.println("Substraction :"+(a - b));
    } public void div(){
         System.out.println("Division :"+(a / b));
    }

    public static void main(String[] args) {
        AbstractClass as = new AbstractClass();
        as.add();
        as.sub();
        as.div();
        as.multi();
    }

}
