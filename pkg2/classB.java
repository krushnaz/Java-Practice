package pkg2;
import pkg1.classA;
public class classB {
    int b;
   public classB(int b){
        this.b = b;
        classA a = new classA(10);
        a.disp();
    }
   public void disp(){
  System.out.println("B :"+b);
    }
}
