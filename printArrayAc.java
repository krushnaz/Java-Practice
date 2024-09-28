public class printArrayAc {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = {9,8,7,6,5,4,3,2,1};
      System.out.println("original array :");
      for(int i = 0; i < arr.length;i++){
        System.out.print(" "+arr[i]);
      }
      for(int i=0;i < arr.length;i++){
        for(int j= i+1;j<arr.length;j++){
            if(arr[i] > arr[j]) {    
                temp = arr[i];    
                arr[i] = arr[j];    
                arr[j] = temp;    
            }  
        }
      }
      System.out.println();

      System.out.println("sorted array :");
       for(int i=0; i< arr.length;i++){
        System.out.print(" "+arr[i]);
       }
    }
}
