// 1) Iterative Method :
// In this method, first we check length of two given arrays. If the length of both arrays is same, then we compare corresponding pairs of elements of both the arrays. If all corresponding pairs of elements are equal, then given arrays will be considered as equal. This method will be time consuming if the arrays have lots of elements. This method is not recommended to check the equality of two arrays if the arrays are big in size. But in the interview, interviewer may ask you to compare two arrays without using in-built functions. In that time, this method may help you.
public class EqualityOfTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

        boolean isEqual = true;

        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    isEqual = false;
                }
            }
        }
        else{
            isEqual = false;
        }

        if(isEqual){
            System.out.println("Both arrays are equal");
        }else{
            System.out.println("both arrays are not equal");
        }
    }
}
