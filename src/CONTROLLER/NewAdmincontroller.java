package CONTROLLER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import MODEL.*;
import VIEW.*;
import java.sql.*;
import javax.swing.JOptionPane;
public class NewAdmincontroller {
NewAdminmodel mymodel1;
NewAdminview myview1;
ResultSet rs;
PreparedStatement pst=null;
Statement stmt;

public NewAdmincontroller(NewAdminview myView1)
{
    this.myview1=myView1;
//    new AdminList().actionPerformed();
            myview1.addLoginListner(new RegisterListener());
}
class RegisterListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try
        {
        mymodel1=myview1.getMymodel();
        if(checkMyData(mymodel1))
        {
        myview1.showMessage("Registered Successfully");
        }
        else
        {
        myview1.showMessage("Invalid username or password");
        }
        }
        catch(Exception e1)
        {
            
        }
    }
}



public boolean checkMyData(NewAdminmodel mymodel1) //throws Exception
    {  
       Connection conn= DataConnection.dbconnect();
       try {
            String sql="insert into e_info(emp_fname,emp_lname,emp_phone,emp_email,emp_password) values(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,mymodel1.getFname());
            pst.setString(2,mymodel1.getLname());
            pst.setInt(3, mymodel1.getPhone());
            pst.setString(4,mymodel1.getEmail());
            pst.setString(5,mymodel1.getPassword());
            pst.executeUpdate();
             System.out.println("Data inserted");
            JOptionPane.showMessageDialog(null,"Data Registered Successfully");
//            try{
//        Connection conn2= DataConnection.dbconnect();
//        String sqlquery="select empid from e_info order by empid desc limit l";
//        pst=conn.prepareStatement(sqlquery);
//        rs= pst.executeQuery();
//        if(rs.next()){
//            int id = rs.getInt(1);
//            int n = id+1;
//            mymodel1.getid(Integer.toString(n))
//        }
//    }
//    catch(Exception e){
//    }
            }
       catch(Exception e2)
       { 
        System.out.println(e2.getMessage());
       }
    return false;
}   
    
}
