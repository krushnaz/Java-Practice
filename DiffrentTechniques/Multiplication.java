//write a program find multiplication without using multiplication operator
class Multiplication{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int mul = 0;
        for(int i=1;i <= b;i++){
            mul = mul+a;
        }
        System.out.println("multiplcation of "+a+" and "+b+" is :"+mul);
    }
}

// 0 = 0 + 10;
//10 = 10 + 10;
//20 = 20 + 10;
// 30 = 30 + 10;