package jdbc;
import java.sql.*;
public class NewjdbcClass 
{
		public static void main(String[] args) throws ClassNotFoundException,SQLException
		{
		// TODO Auto-generated method stub
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection com=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				Statement stat=com.createStatement();
				ResultSet rs=stat.executeQuery("select * from Jobs");
				while(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4));
				}
				com.close();
			}
				catch(SQLException e)
				   {
					System.out.println(e);
				   }
			    }
	}


