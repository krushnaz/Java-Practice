class findMax{
    public static void main(String arg[]){
        int a = 20; 
        int b = 40;
        int c = 10;

        //find max number without using if else
        // int c = a < b  && a >b ? a : b;
        // System.out.println("the maximum number is :"+c);
        int D = a > b && a < c ? a : b > c ? b : c;
        System.out.println("Maximum number is :"+D);
    }
}