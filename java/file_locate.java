import java.io.File;
import java.util.Date;

public class file_locate {
     public static void main(String a[])
     {
        File file = new File("/home/Documents/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
