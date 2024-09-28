public class oddnumberMul {
    public static void main(String[] args) {
        int mul = 1;
        for(int i=1;i<200;i++){
            if(i % 2 == 0){
               mul = mul * i;
            //    System.out.println(i);
            }
        }
        System.out.println(mul);
    }
}
