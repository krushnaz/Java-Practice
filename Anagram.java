// Two strings are called anagrams if they contain same set of characters but in different order. For example, “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams.

import java.util.Arrays;

public class Anagram {
    static void isAnagram(String str1, String str2){
        // removing white spaces from string
        String copyOfstr1 = str1.replaceAll("\\s", "");
        String copyOfstr2 = str2.replaceAll("\\s", "");

        boolean status = true;

        if(copyOfstr1.length() != copyOfstr2.length()){
            status = false;
        }else{
            //converting in lower case and into in array
            char []str1Array = copyOfstr1.toLowerCase().toCharArray();
            char []str2Array = copyOfstr2.toLowerCase().toCharArray();

            // sorting array
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            status = Arrays.equals(str1Array, str2Array);
        }

        if(status){
        System.out.println(str1 +" and "+str2 + " are the Anagram String");
        }else{
            System.out.println(str1 +" and "+str2 + " are NOT the Anagram String");
        }
    }
    public static void main(String[] args) {
        isAnagram("keep", "peaek");
        isAnagram("Bad Credit ", "Debit Card");
    }
}
