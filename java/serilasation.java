import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
    int i=0;
    int j=0;
    student(int i,int j){
         this.i = i;
         this.j = j;
    }
}
public class serilasation {
    public static void main(String[] args)throws Exception {
        student s1 = new student(10, 20);
        System.out.println("serilation started");
        FileOutputStream fos = new FileOutputStream("yxz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        System.out.println("serilation ended");
        System.out.println("DeSerilation started");
        FileInputStream fis = new FileInputStream("yxz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        student s2 = (student) ois.readObject();
        System.out.println("DeSerilation ended");
        System.out.println(s2.i+".........."+s2.j);
    }
}
