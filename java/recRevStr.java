public class recRevStr {
    static String printRev (String str){
        if(str.length() == 1){
            return str;
        }
        char currchar = str.charAt(0);
        String nextString = printRev(str.substring(1));
        return nextString + currchar;
    }
    public static void main(String[] args) {
        String str = "abcd";
        String rev = printRev(str);
        System.out.println(rev);
    }
}
