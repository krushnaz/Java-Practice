import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
    int i=10;
    int j=20;
}
class teacher implements Serializable{
    int i=100;
    int j=200;
}
public class serilasation2 {
    public static void main(String[] args) throws Exception {
        student s1 = new student();
        teacher t1 = new teacher();

        FileOutputStream fos = new FileOutputStream("seri.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.writeObject(t1);

        FileInputStream fis = new FileInputStream("seri.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        student s2 = (student) ois.readObject();
        teacher t2 = (teacher) ois.readObject();

        System.out.println(s2.i+"........"+s2.j);
        System.out.println(t2.i+"........"+t2.j);
    }
}
