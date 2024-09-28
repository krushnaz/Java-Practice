public class countString {
    static int count = 0;
    public static void main(String[] args) {
        String str="krushna zarekar";
    //   int len = str.length();
    for(int i=0;i<str.length();i++){
        if(str.charAt(i) != ' '){
         count++;
        }
    }
      System.out.println("string length is :"+count);
    }
}
