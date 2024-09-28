public class PairsOfElementsInArray {
   static void PairsOfElements(int arr[], int num){
        System.out.println("the pair of element whose sum is "+num);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == num){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        PairsOfElements(new int[]{1,2,3,4,5,6,7}, 5);
        PairsOfElements(new int[]{1,2,-3,4,5,6,7}, 5);
    }
}
