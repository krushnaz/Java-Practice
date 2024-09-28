import java.io.File;

public class FileProperties {
public static void main(String[] args) {
    String fileName = "xyz.txt";

    File file = new File(fileName);

    System.out.println(file.getName());
    System.out.println(file.getParentFile());
    System.out.println(file.getAbsolutePath());
    System.out.println(file.exists());
    System.out.println(file.canWrite());
    System.out.println(file.length());
}
    
}