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
        myview1.resetme();
                myview1.addLoginListner(this);
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
public boolean checkMyData(NewAdminmodel mymodel1) {  
    Connection conn = null;
    try {
        conn = DataConnection.dbconnect();
        String sql = "insert into e_info(emp_fname, emp_lname, emp_phone, emp_email, emp_password) values(?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, mymodel1.getFname());
        pst.setString(2, mymodel1.getLname());
        pst.setInt(3, mymodel1.getPhone());
        pst.setString(4, mymodel1.getEmail());
        pst.setString(5, mymodel1.getPassword());
        pst.executeUpdate();
        System.out.println("Data inserted");
        return true;
    } catch (Exception e2) {
        e2.printStackTrace();
    } finally {
        if (pst != null) {
            try {
                pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    return false;
}
}

