class test{
   public void m1(){
       System.out.println("salty");
    }
}
public class anonomus_class {
    public static void main(String[] args) {
     test t1 = new test(){
        public void m1(){
            System.out.println("spicy");
            super.m1();
        }
     };
     test t2 = new test();
     t2.m1(); 
     t1.m1();  
    }
}
