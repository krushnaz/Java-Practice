import java.sql.*;
public class Connection1 {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost?username=root&&password=");
            if(conn == null){
                System.out.println("not");
            }
            else{
                  System.out.println("yes");
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
