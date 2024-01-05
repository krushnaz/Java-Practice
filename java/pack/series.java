package pack;
 public class series {
   public void feboncci(int nth){
    int num1 = 0;
    int num2 = 1;
    int temp = 0;
    System.out.print(num1 + " "+ num2+" ");
    for(int i= 0; i < nth; i++){
    temp= num1 + num2;
     System.out.print(num1+" ");
     num1 = num2;
     num2 = temp;
    }
   }
}

