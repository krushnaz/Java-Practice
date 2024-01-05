public class exception_handling {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 5/x;
       
        }
        catch(ArithmeticException e){
          System.out.println("Exception");
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finished");
        }
    }
}
