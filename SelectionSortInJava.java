public class SelectionSortInJava {
    static void selection(int input[]){
        int temp , pos;
        for(int i= 0; i < input.length -1; i++){
            pos = i;
            for(int j = i+1; j < input.length;j++){
                if(input[j] < input[pos]){
                    pos = j;
                }
            }
            temp = input[i];
            input[i] = input[pos];
            input[pos] = temp;
        }
        for(int i=0; i < input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        selection(new int[]{45, 84, 101, 62, 12, 45});
    }
}
