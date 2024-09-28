public class ReverseEachWord {
    static void reverseEachWordOfString(String input){
        String words[] = input.split(" ");
        String reverseString = "";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String revWord = "";
            for(int j = word.length()-1; j >=0; j--){
                revWord +=word.charAt(j);
            }
            reverseString += revWord +" ";
        }
        System.out.println("------------------------------");
        System.out.println(input);
        System.out.println(reverseString);
    }
    public static void main(String[] args) {
        reverseEachWordOfString("java concept of the day!");
    }
}
