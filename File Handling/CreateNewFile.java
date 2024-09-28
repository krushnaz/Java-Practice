import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class CreateNewFile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        String pathName = "";
        try{
            System.out.println("Enter File Name :");
            fileName = br.readLine();

            System.out.println("Enter File Path :");
            pathName = br.readLine();

            File file1 = new File(pathName + "" + fileName + ".txt");
            if(file1.createNewFile()){
                System.out.println("file created sucessfully");
            }
            else{
                System.out.println("error occured while creating file...");
            }
            if(file1.delete()){
                System.out.println("file deleted sucessfully");
            }else{
                System.out.println("error occured");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
