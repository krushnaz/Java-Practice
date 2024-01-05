public class method_overloading {
   void method(int radius){
        float pi = 3.14f;
        System.out.println("the area of circle is :"+pi*radius*radius);
    }
   void method(int base,int height){
        System.out.println("the area of triangle is :"+0.5f*(base * height));
    }
   void method(int length,int width,String name){
        System.out.println("the area of rectangle is :"+(length *width));
    }
    public static void main(String[] args) {
        method_overloading m1 = new method_overloading();
        m1.method(10, 20);
        m1.method(10,10, "done");
        m1.method(5);
}
}