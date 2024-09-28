public class transpose {
    public static void main(String[] args) {
        int arr1[][] = {{11,12,13},{14,15,16},{17,18,19}};
        int row = arr1.length;
        int col = arr1[0].length;
        int arr2[][] = new int[col][row];
        System.out.println("given matrix :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
           
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j] = arr1[j][i];
            }
        }
        System.out.println("transpose array :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
