class sumOfnum{
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        do{
            sum += i;
            i++;
        }while(i < 20);
        System.out.println("the sum of 20 numbers :"+sum);
    }
}