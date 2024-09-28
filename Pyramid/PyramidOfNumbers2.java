import java.util.Scanner;

public class PyramidOfNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of do you want :");
        int numOfRow = sc.nextInt();

        int rowCount = 0;

        for(int i= numOfRow; i > 0;i--){
            for(int j = 1; j <= i * 2; j++){
                System.out.print(" ");
            }
            for(int j= 1; j <= rowCount;j++){
                System.out.print(j+" ");
            }
            for(int j = rowCount - 1; j>= 1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
