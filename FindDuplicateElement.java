// How To Find Duplicates In Array In Java Using Brute Force method?
// In this method, we compare each element of an array with other elements. If any two elements are found equal, we declare them as duplicates. The time complexity of this method is O(n^2).
public class FindDuplicateElement {
    FindDuplicateElement(int arr[]){
        for(int i=0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] == arr[i]){
                   System.out.println(arr[i]);
                }
               
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        FindDuplicateElement FDE = new FindDuplicateElement(arr);
    }
}
