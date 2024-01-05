import java.util.*;
import java.sql.*;
public class menuDriven {
	static String url = "jdbc:mysql://localhost/krushna";
	static String uname = "root";
	static String pass = "";

	public static void main(String[] args) throws SQLException {
	
		Scanner sc = new Scanner(System.in);
        Connection conn = DriverManager.getConnection(url,uname,pass);
//        if(conn == null) {
//     	   System.out.println("connection not established..");
//        }
//        else {
//     	   System.out.println("connection established..");
//        }
//        System.out.println("enter the query :");
//        String sqlQuery = sc.nextLine();
        Statement st = conn.createStatement();
//        
//     	   boolean value = st.execute(sqlQuery);   
     	   
     	   
     	   System.out.println("1: CREATE DATABASE :");
           System.out.println("2: CREATE TABLE :");
          
           System.out.println("3: SHOW TABLES DATA");
           System.out.println("4: DELETE DATABASE");
           System.out.println("5: DELETE TABLE");
           System.out.println("6: DELETE ITEMS");
           System.out.println("7: INSERT DATA ");
//           System.out.println("7: Program termination");
           String dbname ="";
           String tbname ="";
          while(true) {
        	  System.out.print("Make your choice: ");  
        	  int ch = sc.nextInt();
        	  switch(ch) {
        	  case 1 :
//        		  String dbname ="";
        		  System.out.println("enter the database name :");
        		  dbname = sc.next();
        		  String sqlQuery ="CREATE DATABASE "+dbname;
        		  
        		boolean value = st.execute(sqlQuery); 
        		
        		 if(value == false) {
              	   ResultSet rs = st.getResultSet();
//              	   System.out.println("id\t\t first name\t\t last name \t\t age");
              	 int count = st.getUpdateCount();
              	 
            	   System.out.println(count +" database created...");
                 }
               	  break;
               	  
        	  case 2 :
        		  
//        		  String tbname2 ="";
        		  System.out.println("enter the table name :");
        		  tbname = sc.next();
        		  String sqlQuery2 ="CREATE TABLE "+tbname+"(id INTEGER not NULL, " +
                       " firstName VARCHAR(255), " + 
                       " lastName VARCHAR(255), " + 
                       " age INTEGER, " + 
                       " PRIMARY KEY ( id ))";;
        		  
        		boolean value2 = st.execute(sqlQuery2); 
        		
        		 if(value2 == false) {
              	   ResultSet rs = st.getResultSet();
//              	   System.out.println("id\t\t first name\t\t last name \t\t age");
              	 int count = st.getUpdateCount();
              	 
            	   System.out.println(count +" table created...");
                 }
               	  break;
               	  
               	  
        	  case 3 :

        		  String tbname3 =" ";
        		  System.out.println("enter the table name :");
        		  tbname3 = sc.next();
        		  String sqlQuery3 ="SELECT * FROM "+tbname3;
        		  
        		  boolean value3 = st.execute(sqlQuery3); 
        		  if(value3 == true) {
               	   ResultSet rs = st.getResultSet();
               	   System.out.println("id\t\t first name\t\t last name \t\t age");
               	   while(rs.next()){
                          //Display values
//                      	 System.out.println("|ID    |AGE   |FIRST           | LAST         ");
//                          System.out.print( "| "+rs.getInt("id")+"    |");
//                          System.out.print(" "+ rs.getInt("age")+"    |");
//                          System.out.print(  rs.getString("first")+"      |");
//                          System.out.println( rs.getString("last")+"      |");
               		   String ID = rs.getString("id");
                          String first = rs.getString("firstName");
                          String last = rs.getString("lastName");
                          String age = rs.getString("age");
                          System.out.println( "" + ID
                                             + "\t\t" + first
                                             +"\t\t"+last
                                             +"\t\t"+age);
                       }
                  }
                  else {
               	   int count = st.getUpdateCount();
               	 
               	   System.out.println(count +" row affected");
                  }
                       break;
               
                       
        	  case 4:
        		  
        		  String deletedb ="";
        		  System.out.println("enter the database name for delete :");
        		  deletedb = sc.next();
        		  String sqlQuery4 ="DELETE DATABASE "+deletedb;
        		  
        		boolean value4 = st.execute(sqlQuery4); 
        		
        		 if(value4 == false) {
              	   ResultSet rs = st.getResultSet();
//              	   System.out.println("id\t\t first name\t\t last name \t\t age");
              	 int count = st.getUpdateCount();
              	 
            	   System.out.println(count +" database deleted...");
                 }
        		 break;
        		 
        	  case 5 :
//        		  String deletetb ="";
//        		  System.out.println("enter the TABLE name for delete :");
//        		  tbname = sc.next();
        		  String sqlQuery5 ="DELETE TABLE "+tbname;
        		  
        		boolean value5 = st.execute(sqlQuery5); 
        		
        		 if(value5 == false) {
              	   ResultSet rs = st.getResultSet();
//              	   System.out.println("id\t\t first name\t\t last name \t\t age");
              	 int count = st.getUpdateCount();
              	 
            	   System.out.println(count +" table deleted...");
                 }
        		 break;
        		  
        	  case 6 :
        		  String deleteitems="";
//        		  System.out.println("enter the table name for delete items :");
//        		 String tbname1 = sc.next();
        		  System.out.println("enter the id for delete item :");
        		 String tbid = sc.next();
        		  String sqlQuery6 ="DELETE FROM "+tbname+" WHERE id="+tbid;
        		  
        		boolean value6 = st.execute(sqlQuery6); 
        		
        		 if(value6 == false) {
              	   ResultSet rs = st.getResultSet();
//              	   System.out.println("id\t\t first name\t\t last name \t\t age");
              	 int count = st.getUpdateCount();
              	 
            	   System.out.println(count +" item deleted...");
                 }
        		 break;
        	  case 7 :
//        		  String sql7 = "INSERT INTO REGISTRATION(id,first,last,age) VALUES(03,'vaishnav','wakchaure',21)";
//                st.executeUpdate(sql);
                
        		  String tbname7 =" ";
        		  System.out.println("enter the table name :");
        		  tbname7 = sc.next();
        		  String id ="";
        		  String firstName ="";
        		  String lastName ="";
        		  String age ="";
        		  System.out.println("enter id :");
        		  id = sc.next();
        		  System.out.println("enter first name :");
        		  firstName = sc.next();
        		  System.out.println("enter last name :");
        		  lastName = sc.next();
        		  System.out.println("enter age :");
        		  age = sc.next();
      		
      		  System.out.println("enter data for insert :");
//      		  String insert = sc.next();
      		  String sqlQuery7 = "INSERT INTO "+tbname7+"(id,firstName,lastName,age) VALUES("+id+",'"+firstName+"','"+lastName+"',"+age+")";
      		  
      		boolean value7 = st.execute(sqlQuery7); 
      		
      		 if(value7 == false) {
            	   ResultSet rs = st.getResultSet();
//            	   System.out.println("id\t\t first name\t\t last name \t\t age");
            	 int count = st.getUpdateCount();
            	 
          	   System.out.println(count +" value inserted...");
               }
      		 break;
        	  }
        	   
          }
//       

	}

}