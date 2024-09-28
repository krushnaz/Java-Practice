// public class matrix {
//     public static void main(String[] args) {
//         int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};

//         int total[][] = new int[3][3];
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr2.length;j++){
//                 total[i][j] = arr1[i][j] +arr2[i][j];
//                 System.out.print(total[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

public class matrix {
    public static void main(String[] args) {
     final int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};

        // int total[][] = new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr1[i][j] = arr1[i][j] +arr2[i][j];
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}

