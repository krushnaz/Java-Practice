import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWriter {
    public static void main(String[] args) throws IOException {
      
        PrintWriter pw = new PrintWriter("demo.txt");
        BufferedReader bf = new BufferedReader(new FileReader("file3.txt"));
        String line = bf.readLine();
        while(line != null){
            pw.println(line);
            line = bf.readLine();
        }
        bf = new BufferedReader(new FileReader("file2.txt"));
        line = bf.readLine();
        while(line != null){
            pw.println(line);
            line = bf.readLine();
        }
        pw.flush();
        
    }
}
