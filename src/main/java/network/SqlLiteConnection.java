package network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sahtia
 */
public class SqlLiteConnection {
    private static Connection conn = null; 
    
    public static String connect(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:password_manager_arya.db");
            conn.close();
            
            System.out.println("Success connect sql lite database");
            
            return "success";
        } catch (SQLException ex) {
            System.out.println("Failed connect sql lite database : " + ex.getMessage());
            return "failed";
        }
    }
}
