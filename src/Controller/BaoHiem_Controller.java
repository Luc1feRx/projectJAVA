
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
import models.tbBaoHiem;


public class BaoHiem_Controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static String sql;
    public static ResultSet rs;
    
    public static List<tbBaoHiem> LayNguon(){
        List<tbBaoHiem> arr = new ArrayList<>();
        conn=null;
        state=null;
        
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Select * From TblSoBH";
            state=conn.createStatement();
            rs = state.executeQuery(sql);
            while (rs.next()){
                tbBaoHiem temp = new tbBaoHiem();
                temp.setMaNV(rs.getString("MaNV"));
                temp.setMaLuong(rs.getString("MaLuong"));
                temp.setMaBH(rs.getString("MaSoBH"));
                temp.setNgayCapSo(rs.getString("NgayCapSo"));
                temp.setNoiCapSo(rs.getString("NoiCapSo"));
                temp.setGhiChu(rs.getString("GhiChu"));
                arr.add(temp);
            }
            state.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaoHiem_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaoHiem_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BaoHiem_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        return arr;
    }
}
