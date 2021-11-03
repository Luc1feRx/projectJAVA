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
import models.TTNS;
import models.TaiKhoan;

/**
 *
 * @author tu
 */
public class TTNS_Controllers {
    public Connection conn = null;
    public Statement st = null;
    public ResultSet rs = null;
    public List<TTNS> TTNSLists = new ArrayList<>();
    public List<TTNS> ttnsList(String sql) throws SQLException{
        TTNSLists.removeAll(TTNSLists);
        conn = DriverManager.getConnection(dbUrl);
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        TTNS ttns;
        while(rs.next()){
             ttns = new TTNS(rs.getString("MaBoPhan"), rs.getString("MaPhong"), rs.getString("MaNV"), rs.getString("HoTen"), 
                     rs.getString("MaLuong"), rs.getString("NgaySinh"), rs.getString("GioiTinh"), rs.getString("TTHonNhan"), rs.getString("CMTND"), 
                     rs.getString("NoiCap"), rs.getString("ChucVu"), rs.getString("LoaiHD"), rs.getString("ThoiGian"), rs.getString("NgayKy"), rs.getString("NgayHetHan"),
                     rs.getString("GhiChu"), rs.getBytes("AnhNV"));
             TTNSLists.add(ttns);
        }
        conn.close();
        st.close();
        return TTNSLists;
    }
    
    public void RefreshTable(String query, JTable table) throws SQLException{
         List<TTNS> list = ttnsList(query);
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         Object[] row = new Object[17];
         for(int i = 0; i < list.size(); i++){
             row[0] = list.get(i).getMBP();
             row[1] = list.get(i).getMP();
             row[2] = list.get(i).getMNV();
             row[3] = list.get(i).getHoTen();
             row[4] = list.get(i).getMaLuong();
             row[5] = list.get(i).getNgaySinh();
             row[6] = list.get(i).getGioiTinh();
             row[7] = list.get(i).getTTHonNhan();
             row[8] = list.get(i).getCCCD();
             row[9] = list.get(i).getNoiCap();
             row[10] = list.get(i).getChucVu();
             row[11] = list.get(i).getLoaiHD();
             row[12] = list.get(i).getThoiGian();
             row[13] = list.get(i).getNgayKy();
             row[14] = list.get(i).getHetHan();
             row[15] = list.get(i).getGhiChu();
             row[16] = list.get(i).getImg();
             model.addRow(row);
         }
    }
}
