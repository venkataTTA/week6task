Package venkataWeek6Task;
//Only DB Coonection
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static Connection connect()
    {
        Connection con = null;
        try
        {
             Class.forName("org.apache.derby.jdbc.ClientDriver");//mysql DB
        String URL = "jdbc:derby://localhost:1527/TTA1";//DB location
        String user = "root";//DB user name
        String pwd = "root";//DB password
        
        con = DriverManager.getConnection(URL , user , pwd);           
        }//try ends
        catch(Exception ex)
        {
            System.out.println("DB Error :"+ex);
        }//catch ends
        
        return con;
        
    }//main ends
}//class ends
