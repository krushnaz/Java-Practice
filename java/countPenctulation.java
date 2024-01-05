public class countPenctulation {
    public static void main(String[] args) {
        String penctuation = "";
        int count = 0;
        String str = "krushna will be a rich man in the world! and he will buy home,cars and every thing but he wants win the \"hearts\" of people";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) =='!' ||str.charAt(i) =='"' || str.charAt(i) == ',' || str.charAt(i) == '.' ){
                count++;
                penctuation = penctuation + str.charAt(i);
            }
        }
        System.out.println("the penctuations in this String are :"+count);
        System.out.println("penctuations are :"+penctuation);  
    }
}
