import java.util.HashMap;

public class CharOccur {
    static void characterCount(String str){
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        char arr[] = str.toCharArray();
        for (char i : arr) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        System.out.println(str+" : "+map);
    }
    public static void main(String[] args) {
        characterCount("java");
        characterCount("krushna sopan zarekar");
    }
}
