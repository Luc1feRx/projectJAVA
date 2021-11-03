/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static QLNS.QLNS.dbUrl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.TaiKhoan;

/**
 *
 * @author tu
 */
public class TaiKhoan_Controllers {
    public Connection conn = null;
    public Statement st = null;
    public ResultSet rs = null;
    public List<TaiKhoan> userLists = new ArrayList<>();
    
    public List<TaiKhoan> userList(String sql) throws SQLException{
        userLists.removeAll(userLists);
        conn = DriverManager.getConnection(dbUrl);
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        TaiKhoan user;
        while(rs.next()){
            user = new TaiKhoan(rs.getString("Username"), rs.getString("Pass"), rs.getString("Quyen"), rs.getString("Ten"));
            userLists.add(user);
        }
        conn.close();
        st.close();
        return userLists;
    }
    
     public void RefreshTable(String query, JTable table) throws SQLException{
         List<TaiKhoan> list = userList(query);
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         Object[] row = new Object[4];
         for(int i = 0; i < list.size(); i++){
             row[0] = list.get(i).getUsername();
             row[1] = list.get(i).getPass();
             row[2] = list.get(i).getQuyen();
             row[3] = list.get(i).getTen();
             model.addRow(row);
         }
    }
}
