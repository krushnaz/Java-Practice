import java.util.Scanner;

public class PyramidOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of row :");
        int numOfRow = sc.nextInt();

        int rowCount = numOfRow;

        for(int i=0; i < numOfRow; i++){
            for(int j = 1; j <= i * 2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= rowCount;j++ ){
                System.out.print(j+" ");
            }
            for(int j = rowCount -1; j>= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount--;
        }
    }
}
