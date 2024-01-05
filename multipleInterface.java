interface Add{
     public void add();
}
interface Sub{
     public void sub();
}
interface Mul{
     public void mul();
}
interface Div{
     public void div();
}
interface truncateInterface{
     public void truncateDiv();
}

class truncateDivision implements truncateInterface{
    int a ,b;
    truncateDivision(int a, int b){
        this.a = a;
        this.b = b;

    }
    public void truncateDiv(){
        System.out.println("Truncate Division is :"+(a/b));
    }
}

public class multipleInterface extends truncateDivision implements Add,Sub,Mul,Div  {
    int a,b;
    multipleInterface(int a, int b){
        super(a,b);
        this.a = a;
        this.b = b;
    }
    public void add(){
        System.out.println("Addition :"+(a+b));
     }
       public void sub(){
                System.out.println("substraction :"+(a-b));
 
         
     }  public void mul(){
                System.out.println("multiplication :"+(a*b));
 
         
     }  public void div(){
                System.out.println("division :"+(a/b)); 
     }
     public static void main(String[] args) {
         multipleInterface c = new multipleInterface(15, 2);
         c.add();
         c.sub();
         c.mul();
         c.div();
         c.truncateDiv();
         
     }
}
