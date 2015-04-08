
package cis550;
import java.sql.*;
import java.util.ArrayList;

import cis550.controller.DBLayer;
import cis550.controller.FunWithDB;
import cis550.model.Business;

public class JDBCConnection {
   
   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
   static final String DB_URL = "jdbc:oracle:thin:@//cis550hw1.cfoish237b6z.us-west-2.rds.amazonaws.com:1521/IMDB";

   
   static final String USER = "cis550students";
   static final String PASS = "cis550hw1";
   
//   String docRoot = AdfmfJavaUtilities.getDirectoryPathRoot
//           (AdfmfJavaUtilities.ApplicationDirectory);
//   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      
      Class.forName("org.sqlite.JDBC");
      
      System.out.println("Connecting to database...");
      String dir = "jdbc:sqlite:/home/vibhor/git/cis550-project/db/development-sqlite3";
      conn = DriverManager.getConnection(dir);
      System.out.println("Success");
//      conn = new SQLite.JDBCDataSource("jdbc:sqlite:" + docRoot +
//              "/sample.db").getConnection();

      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      String state ="PA";
      sql = "select * from businesses where state = 'PA' and city ='Pittsburgh'";
      System.out.println(sql);
      ResultSet rs = stmt.executeQuery(sql);
      FunWithDB fun = new FunWithDB(rs);
      fun.experiment(stmt);
//      ArrayList <DBLayer> dbList = new ArrayList<DBLayer>();
      //System.out.print("YEAR "+"\t"+"GENRE"+"\n");
//      int count =0;
//      while(rs.next() && count <5){
//         
//    	   DBLayer db = new DBLayer();
//    	   Business bs = new Business();
//    	   db.setBusiness(bs);
//    	   db.getBusiness().setName(rs.getString("name"));
//    	   db.getBusiness().setCity(rs.getString("city"));
//    	   db.getBusiness().setId(rs.getInt("id"));
//    	   db.getBusiness().setYelpid(rs.getString("yelpId"));
//    	   db.getBusiness().setFull_address(rs.getString("full_address"));
//    	   db.getBusiness().setState(rs.getString("state"));
//    	   db.getBusiness().setStars(rs.getFloat("stars"));
//    	   db.getBusiness().setCategories(rs.getString("categories"));
//    	   db.getBusiness().setYelp_attributes(rs.getString("yelp_attributes"));
//    	   db.getBusiness().setHours(rs.getString("hours"));
//    	   dbList.add(db);
//    	   db.getBusiness().setCity(rs.getString("city"));
////         String name = rs.getString("name");
////         System.out.print( name+"\n");
////         count++;
//
//      }
//      System.out.println("All records undertaken");
//      FunWithDB fun = new FunWithDB(dbList);
//      fun.display();
      
      rs.close();
      stmt.close();
      conn.close();
      
   }catch(SQLException se){
      
      se.printStackTrace();
   }catch(Exception e){
      
      e.printStackTrace();
   }finally{
      
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }

}
}