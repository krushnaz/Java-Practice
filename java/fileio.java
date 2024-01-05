import java.io.FileInputStream;

public class fileio {
    public static void main(String[] args) throws Exception {
        FileInputStream oi = new FileInputStream(".txt");
    //    oi.write(65);
    //    oi.close();
    // String s = "welcome to new era of tech";
    // byte b [] = s.getBytes();
    // oi.write(b);
    // int i = oi.read();
   int i = 0;
    while((i = oi.read()) != -1){
          System.out.print((char)i);
    }
        // System.out.println("sucess");
    }
}
