import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rows :");
        int row = sc.nextInt();
        System.out.println("Enter a columns :");
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] sum = new int[row][col];

        System.out.println("Enter Data for First matrix :");
        for(int i=0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Data for Second matrix :");
        for(int i=0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing Data for First matrix :");
        for(int i=0; i < row; i++){
            for(int j = 0; j < col; j++){
               System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Printing Data for Second matrix :");
        for(int i=0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(matrix2[i][j]+"\t");
            }
            System.err.println();
        }

        System.out.println("Printing Sum of Matrix1 and Matrix2 :");
        for(int i=0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.err.println();
        }
    }
}
