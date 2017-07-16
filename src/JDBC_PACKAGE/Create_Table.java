package JDBC_PACKAGE;
import java.sql.*;

public class Create_Table {
	public static void main(String args[]){
		try{
			//Step1 Load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Step2 create the connection object
			
			Connection con=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","hr","12345");
			
			//Step3 Create connection statement
			
			Statement stmt=con.createStatement();
			
			//step4 execute query
			
			ResultSet rs=stmt.executeQuery("select * from employees");
			while(rs.next())
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			//step5 close the connection object 
			con.close();
		}catch(Exception e){ System.out.println(e);} 
	}

}
