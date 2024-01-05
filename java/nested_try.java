public class nested_try{    
    public static void main(String args[]){   
    //outer try block   
    
    try{
        System.out.println("this is outer block ");
        try{
        System.out.println("this is first inner  block ");
            
            int a = 40/0;
        }
        catch(ArithmeticException e){
            System.out.println("cant divided zero!");
        }
        try{
        System.out.println("this is second inner block ");

            int b[] = new int[5];
            b[5] = 4;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("cant assign value to the array because array is not mutable");
        }
    }  
    catch(Exception e){
        System.out.println(e);
    }
    finally{
        System.out.println("finally done");
    }
    }    
   }  
