import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {
    DuplicateCharactersInString(String inputString){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
      
        char [] charArr = inputString.toCharArray();

        for (char c : charArr) {
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }

        Set<Character> charInString = charCountMap.keySet();
        System.out.println("duplicate character in "+inputString);

        for (Character ch : charInString) {
            if(charCountMap.get(ch) > 1){
                System.out.println(ch +" : "+charCountMap.get(ch));
            }
            
        }
    }

    public static void main(String[] args) {
        DuplicateCharactersInString dcs = new DuplicateCharactersInString("better and mutter");
    }
}
