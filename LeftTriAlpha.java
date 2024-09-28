public class LeftTriAlpha {
    public static void main(String[] args) {
        int a = 65;
        for (int i = 0; i <= 5; i++) {
            for (int k = 5; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + a) + "");
            }
            System.out.println();
        }
    }
}
