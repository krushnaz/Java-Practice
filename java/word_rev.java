import java.util.regex.Pattern;

public class word_rev {
    static String rev(String str){
        Pattern pattern = Pattern.compile("\\s");
        String temp[]= pattern.split(str);
        String result ="";
        for(int i=0;i<temp.length;i++){
                 if(i == temp.length-1){
                    result = temp[i] + result;
                 }
                 else{
                        result = " "+ temp[i]+result;
                 }
        }


        return result;
    }
    public static void main(String[] args) {
        String s1 = "welcome to my home";
        System.out.println(rev(s1));
        String s2 = "hello everyone";
        System.out.println(rev(s2));
    }
}
