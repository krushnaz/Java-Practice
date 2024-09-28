
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Krushna");
        Matcher m = pattern.matcher("KrushnaZarekarKrushna");

        while(m.find()){
            System.out.println("Pattern found from "+m.start()+" to "+(m.end()-1));
        }
    }

}
