public class krishna {
    public static void main(String[] args) {
        String name = "KRISHNA";
        int len = name.length();

        // loop through each letter in the name
        for (int i = 0; i < len; i++) {
            // print spaces for the letters before the current letter
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // print the current letter
            System.out.print(name.charAt(i));

            // print spaces for the letters after the current letter
            for (int j = i + 1; j < len; j++) {
                System.out.print("  ");
            }

            // print stars on either side of the letter
            System.out.print("  *  ");

            // print stars for the letters before the current letter
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            // print stars for the letters after the current letter
            for (int j = i + 1; j < len; j++) {
                System.out.print("* ");
            }

            // print a new line for the next letter
            System.out.println();
        }
    }
}
