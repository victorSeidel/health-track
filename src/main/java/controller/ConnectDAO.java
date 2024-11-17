package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectDAO 
{
    public Connection ConnectDB()
    {
        Connection conn = null;
        
        try 
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/HealthTrackDB?user=root&password=96913841a");
        } 
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null, "Error (ConnectDAO): " + erro.getMessage());
        }
        
        return conn;
    }
}
