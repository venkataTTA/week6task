Package venkataWeek6Task;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// student table queries
public class EmployeeQuery {
    
    //1. insert -> int
    public int insert(int empId, String empName, double empSalary, String empRole)
    {
        int row_insert = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "insert into Employee(empId,empName,empSalary,empRole) values("+empId+" , '"+empName+"' , "+empSalary+" , '"+empRole+")";
            
            row_insert = stmt.executeUpdate(qry);
             
        }
        catch(Exception ex)
        {
            System.out.println("Insert Error :"+ex);
        }
        
        return row_insert;
    }
    
    //2. update -> int
    public int update(int empId , double up_empSalary)
    {
        int row_update = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "update Employee set empSalary="+up_empSalary+" where empId="+empId;;
            
            row_update = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Update Error :"+ex);
        }
        
        return row_update;
    }
    
    //3. delete -> int
    public int delete(int empId)
    {
        int row_delete = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "delete from Employee where empId="+empId;
            
            row_delete = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }
        
        return row_delete;
    }
    
    //4. select -> void
    public void display()
    {
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "select * from Employee";
            
            ResultSet rs = stmt.executeQuery(qry);//return ResultSet-> holds all rows from table
            
            //read all data
            //next() -> check if next row is present
            while(rs.next())
            {
             
       
                int i = rs.getInt(1);
                String f = rs.getString(2);
              double l = rs.getDouble(3);
               String s = rs.getString(4);
                
                System.out.println("Employee ID :"+i);
                System.out.println("Employee NAME :"+f);
                System.out.println("Employee Salary:"+l);
                System.out.println("Employee Role :"+s);
                
                System.out.println("========================");
                
            }//while ends
            
        }
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }
    }
    
}
