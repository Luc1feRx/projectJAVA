
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
import models.tbTangLuong;

public class TangLuong_Controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;
    
    public static List<tbTangLuong> LayNguon(){
        List<tbTangLuong> arr = new ArrayList<>();
        conn=null;
        state=null;
        
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Select * From TblTangLuong";
            state=conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()){
                tbTangLuong temp = new tbTangLuong();
                temp.setChucVu(rs.getString("ChucVu"));
                temp.setGioiTinh(rs.getString("GioiTinh"));
                temp.setHoTen(rs.getString("HoTen"));
                temp.setLyDo(rs.getString("LyDo"));
                temp.setMaLuongCu(rs.getString("MaLuongCu"));
                temp.setMaLuongMoi(rs.getString("MaLuongMoi"));
                temp.setMaNV(rs.getString("MaNV"));
                temp.setNgayTang(rs.getString("NgayTang"));
                arr.add(temp);
            }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TangLuong_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(TangLuong_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TangLuong_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        return arr;
    }
}
