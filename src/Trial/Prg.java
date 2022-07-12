package Trial;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
public class Prg {

	public static void main(String args[])
	{
		try {
			System.out.println("Start");
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Work","root","root");
			Statement st=con.createStatement();
			
			
			System.out.println("Java DataBase Connectivity setup successful");
			st.executeUpdate("insert into details values('53','Ananya')");
			ResultSet rs=st.executeQuery("select * from details");
			while(rs.next())
			System.out.println("Id is "+rs.getInt("id")+" Name is "+rs.getString("name"));
			
			System.out.println(" Terminating Program");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		
	}
	
}
