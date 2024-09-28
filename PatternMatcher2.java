import java.util.regex.Pattern;

public class PatternMatcher2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]", "k"));
        System.out.println(Pattern.matches("[a-zA-Z]", "Kr"));
        // Meta Charecters
        System.out.println("-----------------------------------------------");
        System.out.println(Pattern.matches("[b-z]?", "a"));
        System.out.println(Pattern.matches("[a-zA-Z]+", "Krushna"));
        System.out.println(Pattern.matches("[^a-z]?", "4"));
        System.out.println(Pattern.matches("[krshn]*", "zarekar"));
        System.out.println("-----------------------------------------------");
        // Java regex finder
        System.out.println(Pattern.matches("\\d+", "1234"));
        System.out.println(Pattern.matches("\\D+", "1234"));
        System.out.println(Pattern.matches("\\D+", "sdfg"));
        System.out.println(Pattern.matches("\\S+", "Krushna"));

    }
}
