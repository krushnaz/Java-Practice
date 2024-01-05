public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {9,7,5,4,3,2};
        // System.out.print("original array :"+arr);
        for(int i=0;i<arr.length;i++){
           int current = arr[i];
           int j = i-1;
           while(j>=0 && arr[j]>current){
            arr[j+1] = arr[j];
            j--;
           }
           arr[j+1] = current;

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i] +" ");
        }
    }
}
