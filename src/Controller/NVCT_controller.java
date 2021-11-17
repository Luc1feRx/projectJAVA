
package Controller;

import static Controller.BoPhan_Controller.conn;
import static Controller.BoPhan_Controller.rs;
import static Controller.BoPhan_Controller.sql;
import static Controller.BoPhan_Controller.state;
import Model.tbBoPhan;
import static QLNS.QLNS.dbUrl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.tblNVCT;


public class NVCT_controller {
        public static Connection conn;
    public static Statement st; 
    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;
    public List<tblNVCT> LNV = new ArrayList<>();
    public List<tblNVCT> LNVList(String sql) throws SQLException{
        LNV.removeAll(LNV);
        conn = DriverManager.getConnection(dbUrl);
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        tblNVCT tblNVCT;
        while(rs.next()){
             tblNVCT = new tblNVCT(rs.getString("MaNV"), rs.getString("TenPhong"), rs.getString("HoTen"), rs.getString("MaLuong"), 
                     rs.getString("GhiChu"), rs.getString("NgayNhanLuong"), rs.getInt("LCB"), rs.getInt("PCChucVu"), rs.getInt("SoNgayCongThang"),
                     rs.getInt("Thuong"), rs.getInt("SoNgayNghi"), rs.getInt("SoGioLamThem"), rs.getInt("KyLuat"), rs.getFloat("Luong"));
             LNV.add(tblNVCT);
        }
        conn.close();
        st.close();
        return LNV;
    }
    
    public void RefreshTable(String query, JTable table) throws SQLException{
         List<tblNVCT> list = LNVList(query);
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         Object[] row = new Object[17];
         for(int i = 0; i < list.size(); i++){
             row[0] = list.get(i).getManv();
             row[1] = list.get(i).getTenphong();
             row[2] = list.get(i).getHoten();
             row[3] = list.get(i).getMaluong();
             row[4] = list.get(i).getLCB();
             row[5] = list.get(i).getPC();
             row[6] = list.get(i).getThuong();
             row[7] = list.get(i).getKyluat();
             row[8] = list.get(i).getNgaynhan();
             row[9] = list.get(i).getSongaynghi();
             row[10] = list.get(i).getSongaycong();
             row[11] = list.get(i).getGiolamthem();
             row[12] = list.get(i).getLuong();
             row[13] = list.get(i).getGhichu();
             model.addRow(row);
         }
    }
    
    public static List<tbBoPhan> LayNguon(){
        List<tbBoPhan> arr = new ArrayList<>();
        conn= null;
        state = null;
        
        try{
        conn = DriverManager.getConnection(dbUrl);
        sql="Select * From TblBoPhan Order By MaBoPhan";
        state= (Statement) conn.createStatement();
        rs = state.executeQuery(sql);
        while (rs.next()){
            tbBoPhan temp = new tbBoPhan();
            temp.setMabophan(rs.getString("MaBoPhan"));
            temp.setTenbophan(rs.getString("TenBoPhan"));
            temp.setNgaythanhlap(rs.getDate("NgayThanhLap"));
            temp.setGhichu(rs.getString("GhiChu"));
            
            arr.add(temp);
        }
        state.close();
        rs.close();
        conn.close();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(BoPhan_Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null){
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            }
        }
        return arr;
    }
    
    
}

