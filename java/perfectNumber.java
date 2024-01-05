class perfectNumber{
    public static void main(String arg[]){
        int num = 30;
        int i = 1;
        int sum =0;

        while(i <= num/2){
              if(num % i == 0){
                sum += i;
            }
            i++;
        }
        if (sum ==num){
            System.out.println(num+" is perfect number");
        }
        else{
            System.out.println(num+" is not perfect number");
        }
    }
}