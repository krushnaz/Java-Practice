public class dupli_ele {
    static int dupllicate(int a[],int n){
        int j=0;
        for(int i = 0;i< n;i++){
          if(a[i] != a[i+1]){
            a[j++] = a[i];
          }
        }
        a[j++] = a[n-1];
        return j;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,2,1,2,4,5,2,3};
        int len = a.length;
       int j= dupllicate(a, len-1);
       for(int i=0;i<j;i++){
        System.out.println(i);
       }
    }
}
