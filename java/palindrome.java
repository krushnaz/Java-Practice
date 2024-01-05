class palindrome{
    public static void main(String[] args) {
    //     String original = "madam";
    //     String rev ="";
    //     int len = original.length();
    //     for(int i=(len-1);i>=0;i--){
    //         rev= rev + original.charAt(i);
    //     }
    //     // System.out.println(rev);
    //     if(rev.equals(original)){
    //         System.out.println("this String is palindrome");
    //     }
    //     else{
    //         System.out.println("this String is not palindrome");
    //     }

    int num = 121;
    int temp = num;
    int rem,sum = 0;
    temp = num; while(num> 0){
        rem = num % 10;
        sum = (sum * 10)+rem;
        num = num/10;
    }
    System.out.println(sum);
    System.out.println(temp);
    if (temp == sum){
        System.out.println("it is palindrome number");
    }
    else{
        System.out.println("it is not palindrome number");
    }
    }
}