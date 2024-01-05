import java.util.*;
public class primeNum {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int m = num /2;
      int flag = 0;
      if(num == 0 || num == 1){
        System.out.println(num+" num is not prime number");
      }
      else{
        for(int i = 2;i<=m;i++){
            if(num % i ==0){
                System.out.println(num+" num is not prime number");
                flag = 1;
                break;
            }
        
        }
        if(flag == 0){
            System.out.println(num +" this num is prime number");
        }
      }


    }
}

// int i,m=0,flag=0;      
// int n=15;//it is the number to be checked    
// m=n/2;      
// if(n==0||n==1){  
//  System.out.println(n+" is not prime number");      
// }else{  
//  for(i=2;i<=m;i++){      
//   if(n%i==0){      
//    System.out.println(n+" is not prime number");      
//    flag=1;      
//    break;      
//   }      
//  }      
//  if(flag==0)  { System.out.println(n+" is prime number"); }  
// }
