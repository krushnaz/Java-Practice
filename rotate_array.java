public class rotate_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 3;
        System.out.println("printing before rotating array...");
        for(int i = 0; i < arr.length;i++){
             System.out.print(" "+arr[i]);
        }
        //rotating array
        int first,j;
        for(int i = 0; i< n;i++){
            first = arr[0];
            for(j = 0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println();
        System.out.println("after rotating the array :");
        for(int i = 0; i < arr.length;i++){
            System.out.print(" "+arr[i]);
        }

    }
}
