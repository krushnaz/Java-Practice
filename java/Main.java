import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String MinWindowSubstring(String[] strArr) {
        String N = strArr[0];
        String K = strArr[1];

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : K.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        String minWindow = "";
        int count = K.length();

        while (right < N.length()) {
            if (charCount.containsKey(N.charAt(right))) {
                if (charCount.get(N.charAt(right)) > 0) {
                    count--;
                }
                charCount.put(N.charAt(right), charCount.get(N.charAt(right)) - 1);
            }

            right++;

            while (count == 0) {
                if (right - left < minLength) {
                    minLength = right - left;
                    minWindow = N.substring(left, right);
                }

                if (charCount.containsKey(N.charAt(left))) {
                    charCount.put(N.charAt(left), charCount.get(N.charAt(left)) + 1);
                    if (charCount.get(N.charAt(left)) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        return minWindow;
    }

    public static void main(String[] args) {
        System.out.println(MinWindowSubstring(new String[]{"aaabaaddae", "aed"}));  // Output: dae
        System.out.println(MinWindowSubstring(new String[]{"aabdccdbcacd", "aad"}));  // Output: aabd
    }
}
{y}