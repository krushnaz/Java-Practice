interface calInterface{
    public void add();    
    public void sub();
    public void multi();
    public void div();
}

public class calculation implements calInterface {
        int a,b;
    calculation(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void add(){
       System.out.println("Addition :"+(a+b));
    }
      public void sub(){
               System.out.println("substraction :"+(a-b));

        
    }  public void multi(){
               System.out.println("multiplication :"+(a*b));

        
    }  public void div(){
               System.out.println("division :"+(a/b)); 
    }
    public static void main(String[] args) {
        calculation c = new calculation(20, 10);
        c.add();
        c.sub();
        c.multi();
        c.div();
    }
}
