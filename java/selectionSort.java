public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {9,7,5,4,3,2};
        // System.out.print("original array :"+arr);
        for(int i=0;i<arr.length-1;i++){
            int samllest = i;
            for(int j=i+1;j<arr.length;j++){
               if(arr[samllest] > arr[j]){
                samllest = j;
               }
            }
            int temp = arr[samllest];
            arr[samllest] =arr[i];
            arr[i] = temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i] +" ");
        }
    }
}
