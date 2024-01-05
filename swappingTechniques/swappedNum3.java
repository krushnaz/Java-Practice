public class swappedNum3 {
   public static void main(String arg[]){
    int a = 10, b = 20;
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("swapped number is :"+ a +"  "+ b);
   } 
}
