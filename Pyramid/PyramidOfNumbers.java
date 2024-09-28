import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number of rows you want to insert :");
        int noOfRows = sc.nextInt();

        int rowCount = 1;
        System.out.println("Here is your pyramid :");

        for(int i = noOfRows; i > 0; i--){
            for(int j=1; j <=i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j<= rowCount; j++){
                System.out.print(rowCount+" ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
