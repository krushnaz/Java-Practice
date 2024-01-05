import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serilation implements Serializable{
    public static void main(String[] args) throws Exception {
       dog d1 = new dog();
       cat c1 = new cat();
       rat r1 = new rat();

       FileOutputStream fos = new FileOutputStream("ser.ser");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
       oos.writeObject(d1);
       oos.writeObject(c1);
       oos.writeObject(r1);

       FileInputStream fis = new FileInputStream("ser.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       dog d2 = (dog)ois.readObject();
       cat c2 = (cat)ois.readObject();
       rat r2 = (rat)ois.readObject();
      String string1 = d2.str1 = "dog2";
     String string2 = c2.str1 = "cat2";
     String string3 = r2.str1 = "rat2";
     
     System.out.println(string1+"...."+ string2+"......"+string3);

    //    System.out.println(d2.str1 + "....."+c2.str1+"......"+r2.str1);

    }
}
