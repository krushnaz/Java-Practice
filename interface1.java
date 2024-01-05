interface cal{
    public void add();
    public void sub();
    public void div();
    public void mul();


}
public class interface1 implements cal {
    int a,b;
    interface1(int a,int b){
         this.a = a;
         this.b = b;
    }
    
    public void add(){
             System.out.println("Addition :"+(a + b));
    }

    public void sub(){
            System.out.println("Substraction :"+(a - b));

        
    }
    
    public void div(){
            System.out.println("Division :"+(a / b));

    }

    public void mul(){
             System.out.println("Multiplication :"+(a * b));

    }
    public static void main(String[] args) {
        interface1 i = new interface1(20, 10);
        i.add();;
        i.sub();
        i.mul();
        i.div();
    }
}
