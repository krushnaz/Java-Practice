public class RightTriPattern {
    public static void main(String[] args) {
        int row = 4;
        for(int i=0; i <= row; i++){
            for(int j=1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
