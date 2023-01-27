/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class tables {
    public static   void main(String[] args)
    {
        Connection con=null;
        Statement st =null;
        try {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            st.executeUpdate ("create table user( name varchar(200) not null,password varchar(500) not null,email varchar(500) not null,securityQuestion varchar(500) not null,answer varchar(200) not null,status varchar(20) not null) ");
                JOptionPane.showMessageDialog(null,"table is created"  );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
             try {
            con.close();
            st.close();
        } 
             catch (Exception e) {
        }
        }
    }
}
