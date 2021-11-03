
package Controller;

import static QLNS.QLNS.dbUrl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.tbThaiSan;

public class ThaiSan_Controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs; 
    
    public static List<tbThaiSan> LayNguon(){
        List<tbThaiSan> arr = new ArrayList<>();
        conn=null;
        state=null;
        
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Select * From TblThaiSan";
            state=conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()){
                tbThaiSan temp = new tbThaiSan();
                temp.setMaBoPhan(rs.getString("MaBoPhan"));
                temp.setMaPhong(rs.getString("MaPhong"));
                temp.setMaNV(rs.getString("MaNV"));
                temp.setHoTen(rs.getString("HoTen"));
                temp.setNgaySinh(rs.getString("NgaySinh"));
                temp.setNgayVeSinh(rs.getString("NgayNghiSinh"));
                temp.setNgayLamLai(rs.getString("NgayLamTroLai"));
                temp.setTroCap(rs.getString("TroCapCTY"));
                temp.setGhiChu(rs.getString("GhiChu"));
                arr.add(temp);
            }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ThaiSan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(ThaiSan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ThaiSan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        return arr;
    }
}
