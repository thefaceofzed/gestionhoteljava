/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import javax.swing.JOptionPane;
  
/**
 *
 * @author ASUS
 */  
public class Select {
 public static ResultSet getData(String query) {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    try {
        con = ConnectionProvider.getcon();
        st = con.createStatement();
        rs = st.executeQuery(query);
        return rs;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e);
        return null;
        

        }
   
    
    }   

    public static ResultSet getDAta(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
