public class NumberPyramid {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1; i<= row; i++){
            for(int j=row; j > i; j--){
                System.out.print(" ");
            }
            for(int k=1; k <= i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
