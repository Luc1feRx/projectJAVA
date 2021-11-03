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
import models.HSTV;
import models.TTNS;

/**
 *
 * @author tu
 */
public class HSTV_Controllers {
    public Connection conn = null;
    public Statement st = null;
    public ResultSet rs = null;
    public List<HSTV> HSTVLists = new ArrayList<>();
    public List<HSTV> hstvList(String sql) throws SQLException{
        HSTVLists.removeAll(HSTVLists);
        conn = DriverManager.getConnection(dbUrl);
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        HSTV hstv;
        while(rs.next()){
             hstv = new HSTV(rs.getString("MaPhong"), rs.getString("MaNVTV"), rs.getString("HoTen"), rs.getString("NgaySinh"), 
                     rs.getString("GioiTinh"), rs.getString("DiaChi"), rs.getString("TDHocVan"), rs.getString("ViTriThuViec"), rs.getString("NgayTV"),
                     rs.getString("GhiChu"), rs.getBytes("AnhNVTV"));
             HSTVLists.add(hstv);
        }
        conn.close();
        st.close();
        return HSTVLists;
    }
    
    public void RefreshTable(String query, JTable table) throws SQLException{
         List<HSTV> list = hstvList(query);
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         Object[] row = new Object[11];
         for(int i = 0; i < list.size(); i++){
             row[0] = list.get(i).getMaPhong();
             row[1] = list.get(i).getMaNVTV();
             row[2] = list.get(i).getHoTen();
             row[3] = list.get(i).getNgaySinh();
             row[4] = list.get(i).getGioiTinh();
             row[5] = list.get(i).getDiaChi();
             row[6] = list.get(i).getTDHocVan();
             row[7] = list.get(i).getViTriThuViec();
             row[8] = list.get(i).getNgayTV();
             row[9] = list.get(i).getGhiChu();
             row[10] = list.get(i).getImage();
             model.addRow(row);
         }
    }
}
