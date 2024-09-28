public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str1 = "Krushna Sopan Zarekar";
        String withoutSpace = str1.replaceAll("\\s+", "");
        System.out.println(withoutSpace);
    }
}
