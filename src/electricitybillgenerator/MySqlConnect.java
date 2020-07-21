/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricitybillgenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author family
 */
public class MySqlConnect {
    public static Connection connectDb(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebillgen","nikhil","abc123");
            JOptionPane.showMessageDialog(null,"Connection Established successfully", "Connection",JOptionPane.INFORMATION_MESSAGE);
            return conn;
        }catch(SQLException e){  
            JOptionPane.showMessageDialog(null,"Something went wrong" + e.getMessage(), "Connection",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
