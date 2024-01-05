import pack.*;
import java .util.*;
public class test {
    public static void main(String[] args) {
        System.out.print("enter nth number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

     series f = new series();  
     f.feboncci(num);
   
    cube c = new cube();
    c.c(num);
    
    n_of_sqre n1 = new n_of_sqre();
    n1.square(num);
    
    }
}
