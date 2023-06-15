
package CONTROLLER;
import MODEL.*;
import VIEW.*;
import java.sql.*;
public class logincontroller {
loginmodel mymodel;
LoginView myview;
ResultSet rs;
PreparedStatement pst;
Statement stmt;

public logincontroller(LoginView myView)
{
    this.myview=myView;
    new LoginList().actionPerformed();
}


class LoginList
{
    public void actionPerformed() 
    {
        try
        {
        mymodel=myview.getMymodel();
        if(checkMyData(mymodel))
        {
           myview.showMessageBox("Login Successfully");
        }
        else
        {
            myview.showMessageBox("Login Failed");
        }
        }
        catch(Exception e1)
        {
            
        }
    }
}

public boolean checkMyData(loginmodel mymodel) throws Exception
{
       try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crt_account", "root", "khadgi986");
           String sql="select * from e_info where emp_phone='"+mymodel.getUsername()+"' and emp_password='"+mymodel.getPassword()+"'";
           try
           {
              
              stmt=connection.createStatement();
              rs=stmt.executeQuery(sql);
              if(rs.next())
              {
                  return true;
              }
           }
           catch(Exception e)
           {
               
           }
       
       }
       catch(Exception e)
       {
           
       }
    
    
    return false;
}


    
}
