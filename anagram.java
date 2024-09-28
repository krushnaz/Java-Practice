import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str1="Brag";  
        String str2="Grab"; 

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("this anagram is not equal");
        }
        else{
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2) == true){
            System.out.println("this anagram is equal");
            }
            else{
            System.out.println("this anagram is not equal");

            }
        }
    }
}
