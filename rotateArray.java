public class rotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("original array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         int n = 3;
        int j,last;
        for(int k = 0; k < n;k++){
            last = arr[arr.length-1];
            for(int i = arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }

       System.out.println();
       System.out.println("after rotating element :");
       for(int i= 0; i< arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
}
