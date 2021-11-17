/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static QLNS.QLNS.dbUrl;
import Views.frmCoBan;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import models.TaiKhoan;

/**
 *
 * @author tu
 */
public class Connects {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public void MakeConnect(String query) throws SQLException{
        try{
            conn = DriverManager.getConnection(dbUrl);
            st = conn.createStatement();
            rs = st.executeQuery(query);
            rs.close();
        conn.close();
        }catch(SQLException e){
            
        }finally {
            if (st != null) {
                conn.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    public boolean Exitsted(String input, String query) throws SQLException{ //Kiem tra trung lap hay ko
            conn = DriverManager.getConnection(dbUrl);
            st = conn.createStatement();
            rs = st.executeQuery(query);
            boolean check = false;
            while(rs.next()){
                if(rs.getString(1).equals(input)){
                    check = true; //neu bi trung se tra ve true
                }
            }
            st.close();
            rs.close();
            conn.close();
            return check;
    }
    
    public void loadcombobox(JComboBox cb, String query, int cot) throws SQLException
        {
            conn = DriverManager.getConnection(dbUrl);
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                cb.addItem(rs.getString(cot));
            }
             rs.close();
            st.close();
            conn.close();
        }
    
    public void loadtextbox(JTextField txt, String query, int cot) throws SQLException
        {
            conn = DriverManager.getConnection(dbUrl);
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                txt.setText(rs.getString(cot));
            }
            st.close();
            rs.close();
            conn.close();
        }
    
    public void loaddate(JDateChooser dt, String query, int cot) throws SQLException
        {
            conn = DriverManager.getConnection(dbUrl);
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()){
                  try {
                       Date date = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(cot));
                       dt.setDate(date);
                  } catch (ParseException ex) {
                       Logger.getLogger(frmCoBan.class.getName()).log(Level.SEVERE, null, ex);
                  }
            }
            st.close();
            rs.close();
            conn.close();
        }
    
}
