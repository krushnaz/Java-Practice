public class countEvenOdd {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row,col,countEven = 0,CountOdd =0;

        row= arr1.length;
        col = arr1[0].length;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j < arr1.length;j++){
                if(arr1[i][j] % 2 == 0){
                    countEven++;
                }
                else{
                    CountOdd++;
                }
            }
        }
        System.out.println("the friquency of even numbers :"+countEven);
        System.out.println("the friquency of odd numbers :"+CountOdd);
    }
}
