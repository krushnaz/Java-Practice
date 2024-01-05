import java.util.*;
public class convert_array_to_list {
    public static void main(String[] args) {
        String Array[]= {"ram","sham","mahesh","vinod"};
        System.out.println("printting array :"+Arrays.toString(Array));
        List<String> list = new ArrayList<String>();
        for(String lang : Array){
            list.add(lang);
        }
        System.out.println(list);
    }
}
