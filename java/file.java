import java.io.*;
public class file {
    public static void main(String[] args) throws Exception {
        File f1 = new File("/home/krish/Documents/study/java");
        // FileOutputStream oi = new FileOutputStream("/home/krish/Documents/study/java/pack/demo.txt");
        // String b = "welcome";
        // byte s [] = b.getBytes();
        // oi.write(s);
        // // f1.createNewFile(); 

        int count = 0;
       
        // System.out.println( f1.list());
        // System.out.println( f1.length());
        String s[]  = f1.list(); 
        for(String s1 : s){
            File f2 = new File(f1, s1); 
            if(f2file.isFile()){

                System.out.println(s1);
                count++;
            }
        }
        System.out.println("the total number :"+count);
    }
}
