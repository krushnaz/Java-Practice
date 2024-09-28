import java.util.Scanner;

class MatrixCreation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row :");
        int row = sc.nextInt();
        System.out.println("enter a column :");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j = 0; j< col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing matrix :");
        for(int i=0;i < row; i++){
            for(int j = 0; j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}