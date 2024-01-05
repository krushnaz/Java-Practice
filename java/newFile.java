import java.io.*;
public class newFile {
    static int count = 0;
    public static void main(String[] args) throws IOException {
          FileWriter fw =new FileWriter("demo.txt");
          fw.write(65);
          fw.write("krushna zarekar");
          char ch[] = {'a','b','c','d'};
          fw.write(ch);
          
        //   System.out.println(fw.getClass());
        fw.flush();
        fw.close();
          FileReader fr = new FileReader("demo.txt");
          int i = fr.read();
          while(i != -1){
            System.out.print((char)i);
            i = fr.read();
          }
       


    }
}
