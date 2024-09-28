
import java.util.Arrays;

public class equalMatrix {
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        boolean falg = true;
       

        int row1 = arr1.length;
        int col1 = arr1[0].length;

        int row2 = arr2.length;
        int col2 = arr2[0].length;

        if(row1 != col1 || col2 != row2){
            System.out.println("matrix is not equal");
        }
        else{

            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i][j] != arr2[i][j]){
                        //   System.out.println("yes");
                        falg = false;
                        break;
                        
                    }
                  
    
                }
            }
            
        }
        if(falg == true){
            System.out.println("martrix is equal");
        }
        else{
            System.out.println("matrix is not equal");
        }
    }
}
