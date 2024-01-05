public class pattern {
    public static void main(String[] args) {
        // for(int i=0;i<=5;i++){
        //     for(int j=0;j<=4;j++){
        //         System.out.print("$");
        //     }
        //     System.err.println();
        // }

        //  int n = 5;
        //  int m = 5;
        // for(int i = 1; i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //        if(i == 1 || i == n || j == 1 || j ==m){
        //         System.out.print("* ");
        //        }
        //        else{
        //         System.err.print("  ");
        //        }
        //     }
        //     System.out.println();
        // }





    //     int n = 5;
    //    for(int i = 1; i<=n;i++){
    //        for(int j=1;j<=i;j++){
    //        System.out.print("*");
              
    //        }
    //        System.out.println();
    //    }

    int n = 5;
    for(int i = n; i <=1;i++){
        for(int s = 0; s <= n-i;s++){
            System.out.println(" ");
        }
        for(int j=1;j<=i;j--){
        System.out.print("*");
           
        }
        System.out.println();
    }
    }

}
