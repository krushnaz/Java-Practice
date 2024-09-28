import java.util.Scanner;

public class RemoveWhiteSpaces2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        char [] charArr = inputString.toCharArray();
        System.out.println(charArr);
        String withoutSpaces = "";
        for(int i=0; i < charArr.length; i++){
            if(charArr[i] != ' ' && charArr[i] != '\t' ){
                withoutSpaces += charArr[i];
            }
        }
        System.out.println(withoutSpaces);
    }
}
