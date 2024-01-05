class Shape{
    // Shape(){

    // }
  public void area(){
        System.out.println("Area of any shape");
    }
}
class Triangle extends Shape{
    double b,h;
    Triangle(double b,double h){
        this.b = b;
        this.h = h;
    }

    public void area(){
        double a = b*h/2;
        System.out.println("the area of trangle is :"+a);
    }
}

class Circle extends Shape{
    double r;
    final double PI = 3.14;
    Circle(double r){
        this.r = r;
    }

    public void area(){
        double a = PI*r*r;
        System.out.println("area of circle is :"+a);
    }
}

class Rectangle extends Shape{
    double b ,l;
    Rectangle(double b,double l){
        this.b = b;
        this.l = l;
    }
    public void area(){
        double a = b * l;
        System.out.println("the area of rectangle is :"+a);
    }
}

public class calculateSpape {
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.area();

        s = new Triangle(2.5, 7.5);
        s.area();

        s = new Circle(5);
        s.area();

        s = new Rectangle(10.5, 15.5);
        s.area();
    }
}
