import java.util.StringTokenizer;

public class toostring {
//     String name;
//   toostring(String name){
//        this.name = name;
//        disp();
//   }

//   void disp(){
//     System.out.println(name);
//   }
    public static void main(String[] args) {
        StringTokenizer s1 = new StringTokenizer("my name is krishna"," ");
        while(s1.hasMoreTokens()){
            System.out.println(s1.nextToken());
        }
        System.out.println(s1.countTokens());
    }
}
