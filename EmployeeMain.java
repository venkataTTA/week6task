Package venkataWeek6Task;
public class EmployeeMain {
    public static void main(String[] args) {
        
 EmployeeQuery obj = new EmployeeQuery();

 

       //1. display all data
         obj.display();
        
        
        
       //2. delete record
        int delete = obj.delete(2);
        if(delete == 1)
        {
            System.out.println("row deleted succesfully;");
        }
        else
        {
            System.out.println("Can not delete. Id could not match");
        }
        
      
       // 3. display all data after delete
       obj.display();
        
        
     // update data
     obj.update(3,32000.00);
     
 

    }
}
