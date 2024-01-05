import java.io.*;
import java.util.*;

public class file_operation {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String file = " ";
    File f;
    int ch = 0;

    do
    {
        System.out.println();
        System.out.println("1. create file ");
        System.out.println("2. delete file ");
        System.out.println("3. read file ");
        System.out.println("4. rename file ");
        System.out.println("0 . exit");
        System.out.println();
        System.out.println("enter your choice :");
        ch = sc.nextInt();

    switch(ch){
      case 1:
      System.out.println("enter file name :");
      file = sc.next();
      f= new File(file);

      try{
        f.createNewFile();
        System.out.println("file created...");
      }
      catch(Exception e){
        System.out.println("failed to create file");
      }
      break;

      case 2 :
      System.out.println("enter file name for deleting :");
      file = sc.next();
      f = new File(file);
      f.delete();
      System.out.println(file+" file deleted...");
      
      break;

      case 3 :
      System.out.println("enter file name for read :");
      file = sc.next();
      f= new File(file);
      int chr;
      
      try{
        FileInputStream fi = new FileInputStream(f);
        System.out.println(".......reading file.......");
        while((chr = fi.read()) != -1){
            System.out.print((char)chr);
        }
        fi.close();
      }
      catch(Exception e){
        System.out.println("unable to read file...");
      }
      break;

      case 4 :
            System.out.println("enter file name for rename :");
            file = sc.next();
            System.err.println("new file name :");
            String newName = sc.next();

            f = new File(file);
            File f2 = new File (newName);
            f.renameTo(f2);
            System.out.println("file renamed....");
            break;

            default :
            if(ch == 0){
                System.out.println("invalid input");
                break;
            }
    }

    
}
while(ch != 0);
sc.close();
    }
}
