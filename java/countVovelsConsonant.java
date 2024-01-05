public class countVovelsConsonant {
    public static void main(String[] args) {
        int vCount = 0,cCount = 0;
           String str = "I am The Desco Dancer!";
           String vowel = "";
           String consonant = "";
           str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vCount ++;
                vowel += str.charAt(i);
            }
            else{
                if(str.charAt(i) != ' '){
                    cCount++;
                    consonant += str.charAt(i);

                }
            }
        }
           System.out.println("the present vowels are :"+vCount);
           System.out.println(vowel);
           System.out.println("the present consonants are :"+cCount);
           System.out.println(consonant);

    }
}
