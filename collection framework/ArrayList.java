import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        String nameArray[] = new String[1000];
        System.out.println("-----------------Array -------------------");
        long startTime = System.currentTimeMillis();
        for(int i=0;i<nameArray.length; i++){
            nameArray[i] = "name"+i; 
        }
        long endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;
        System.out.println("total time of array:"+totalTime);

        System.out.println("-----------------Array List-------------------");
        List<String> nameArrayList = new java.util.ArrayList<String>();
        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<nameArrayList.size(); i++){
            nameArrayList.add("name"+i);
        }
        long endTime1 = System.currentTimeMillis();

        long totalTime1 = endTime1 - startTime1;
        System.out.println("total time of array list:"+totalTime1);
        

    }
}
