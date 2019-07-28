
package simanu;

import java.sql.*;
import javax.swing.*;

public class KoneksiDB {
    
    Connection conn = null;
    
    public static Connection simanuDb(){
        try{
            Connection conn=
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/simanu?", "root", "");
            return conn;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    ResultSet getData(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
