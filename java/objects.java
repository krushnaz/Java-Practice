public class objects {
    int a;
    int b;
    objects(int a, int b){
        this.a = a;
        this.b = b;
    }
    void disp(objects o1){
        System.out.println(o1);
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        objects o1 = new objects(5, 5);
        objects o2 = new objects(6,6);

        try {
            if(o1 == o2){
                System.out.println("this is a same object");
            }
        }
        catch(Exception e){
          System.out.println(e);
        }
        finally{
            System.out.println("code compiles fine");
            String s="";
            if(s == null){
                System.out.println("this is a same object");
           
            }
            else{
                System.out.println("not same");
            }
        }
        
    }
}
