 package realproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class crtacc_conn {
    public static Connection dbconnect()
    { 
        try
        {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crt_account","root","khadgi986");
            System.out.println("connected");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("error");
        }
        return null;
    }
    
}
