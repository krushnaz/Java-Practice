//swapping two numbers using two variable

// public class swap{
//      public static void main(String arg[]){
//         int a = 10;
//         int b = 20;
//         System.out.println(" befored Swapped number :"+a +" "+b);

//         b = b - a;
//         a = a + b;

//         System.out.println("Swapped number :"+a +" "+b);

//      }
// }

// swapping two number without using third variable

// public class swap{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 20;

//         int temp;
//        temp = b;
//        b = a;
//        a = temp;

//         System.out.println("Swapped numbers :"+a+"  "+b);

//     }
// }

//swapping two number without using third variable and arthimatic operator
public class swap{
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 20;
        System.out.println(" before Swapped two number : "+num1 + " " +num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("Swapped two number : "+num1 + " " +num2);
    }
}