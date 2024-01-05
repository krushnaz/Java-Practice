class A{
    void m1(){
        System.out.println("hello");
    }
}
class is_a_inherit extends A{
void m2(){
    System.out.println("hii");
}
public static void main(String[] args) {
    is_a_inherit s1 =new is_a_inherit();
s1.m1();
s1.m2();
 A s2 = new A();
 s2.m1();
 A s3 = new is_a_inherit();
 s3.m1();

}
}