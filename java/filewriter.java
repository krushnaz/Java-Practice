import java.io.FileWriter;

public class filewriter {
    public static void main(String[] args) throws Exception {
        FileWriter f1  =new FileWriter("abcd.java");
        f1.write(100);
        f1.write("krushna\n zarekar");
        f1.append("kz");
        f1.flush();
        // f1.notify();    
    }
}
