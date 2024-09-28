public class demo {
    public static void main(String[] args) {
        int large = Integer.MIN_VALUE;
        int arr[] = {15,12,18,11,19,16,14};
        for(int i = 0; i < arr.length;i++){
           
                if(arr[i] % 2 == 0){
                if(arr[i] > large){
                        large = arr[i];
                    }
                }
            
        }
        System.out.println(large);
    }
}
