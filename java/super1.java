abstract class A{
    void m1(){
      System.out.println("hii");

    }
    abstract void m2();

}
class B extends A{
    // void m1(){
    //     System.out.println("hii");
    // }
    void m2(){
        System.err.println("hello");
    }
}
class super1{
        public static void main(String[] args) {
        B b = new B();
        b.m2();
        b.m1();
    }
}