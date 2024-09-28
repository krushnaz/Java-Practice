public class CheckRotatedVersionOfString {
    public static void main(String[] args) {
        String s1 = "HelloWorld";
        String s2 = "HelloWorld";

        String s3 = s1 + s2;
        if(s1.length() != s2.length()){
            System.out.println(s1 + " is not rotated version of "+s2);
        }else{
            if(s3.contains(s2)){
                System.out.println(s1 + " is rotated version of "+s2);
            }else{
            System.out.println(s1 + " is not rotated version of "+s2);
            }
        }
        
    }
}
