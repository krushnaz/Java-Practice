 class A {
    int a;
    A(){
        this.a = 10;
        System.out.println("this is a class A");
    }
    public void displayA(){
        System.out.println("a is :"+a);
    }
}

 public class B extends A{
    int b;
    B(){
        this.b = 20;
                System.out.println("this is a class B");

    }
    public void displayB(){
        System.out.println("b is :"+b);
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.displayB();
        obj.displayA();
    }
}

// write a program to create class person and it has data mem like name age date of birth and  address 1 display method 
//  extend this class with emplpyee class and data mem like name age date of birth salary emp id and dept 