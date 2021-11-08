
package Controller;

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
import models.tblNVCT;


public class NVCT_controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static String sql;
    public static List<tblNVCT> LayNguon() {
        List<tblNVCT> arr = new ArrayList<>();
        conn=null;
        state=null;
        try{
        conn=DriverManager.getConnection(dbUrl);
        sql = "Select * from TblCongKhoiDieuHanh Order By MaNV";
        state = conn.createStatement();
        ResultSet rs =state.executeQuery(sql);
        while(rs.next()){
        tblNVCT temp = new tblNVCT();
         temp.setManv(rs.getString("MaNV"));
         temp.setTenphong(rs.getString("TenPhong"));
         temp.setHoten(rs.getString("HoTen"));
         temp.setMaluong(rs.getString("MaLuong"));
         temp.setLCB(rs.getInt("LCB"));
         temp.setPC(rs.getInt("PCChucVu"));
         temp.setThuong(rs.getInt("Thuong"));
         temp.setKyluat(rs.getInt("KyLuat"));
         temp.setNgaynhan(rs.getDate("NgayNhanLuong"));
         temp.setNgaycong(rs.getInt("SoNgayCongThang"));
         temp.setNgaynghi(rs.getInt("SoNgayNghi"));
         temp.setGiolamthem(rs.getInt("SoGioLamThem"));
         temp.setLuong(rs.getInt("Luong"));
         temp.setGhichu(rs.getString("GhiChu"));
         arr.add(temp);
        }
        state.close();
        conn.close();
        }catch(SQLException ex){
         Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
 }
    
     public static void ThemMoi(tblNVCT nvct) {

        conn =  null;
        pstate = null;
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql ="Insert into TblCongKhoiDieuHanh(MaNV,TenPhong,HoTen,MaLuong,LCB,PCChucVu,Thuong,"
                    + "KyLuat,NgayNhanLuong,SoNgayCongThang,SoNgayNghi,SoGioLamThem,Luong,GhiChu)"
                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
           pstate = conn.prepareStatement(sql);
           pstate.setString(1,  nvct.getManv());
           pstate.setString(2, nvct.getTenphong());
           pstate.setString(3, nvct.getHoten());
           pstate.setString(4, nvct.getMaluong());
           pstate.setInt(5, nvct.getLCB());
           pstate.setInt(6, nvct.getPC());
           pstate.setInt(7, nvct.getThuong());
           pstate.setInt(8, nvct.getKyluat());
           pstate.setDate(10, (Date) nvct.getNgaynhan());
           pstate.setInt(11, nvct.getNgaycong());
           pstate.setInt(12, nvct.getNgaynghi());
           pstate.setInt(13, nvct.getGiolamthem());
           pstate.setInt(14, nvct.getLuong());
           pstate.setString(15, nvct.getGhichu());
           pstate.execute();
           conn.close();
           pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     
     
    public static void Sua(tblNVCT nvct, String manv, String tenphong, String hoten, String maluong, String thuong, String kyluat, String thang, String nam, String ghichu, int LCB, int PC, int PCK, int ngaycong, int ngaynghi, int giolamthem, int luong){
        conn =  null;
        pstate = null;
       try {
           conn=DriverManager.getConnection(dbUrl);
           sql ="Update TblCongKhoiDieuHanh Set MaNV=?,TenPhong=?,HoTen=?,MaLuong=?,LCB=?,PCChucVu=?,"
                   + "Thuong=?,KyLuat=?,NgayNhanLuong=?,SoNgayCongThang=?SoNgayNghi=?,SoGioLamThem=?,Luong=?,GhiChu=? "
                   + "Where MaNV=?,TenPhong=?,HoTen=?,MaLuong=?,LCB=?,PCChucVu=?,Thuong=?,KyLuat=?,NgayNhanLuong=?,"
                   + "SoNgayCongThang=?SoNgayNghi=?,SoGioLamThem=?,Luong=?,GhiChu=?";
           pstate = conn.prepareStatement(sql);
           pstate.setString(1,  nvct.getManv());
           pstate.setString(2, nvct.getTenphong());
           pstate.setString(3, nvct.getHoten());
           pstate.setString(4, nvct.getMaluong());
            pstate.setInt(5, nvct.getLCB());
           pstate.setInt(6, nvct.getPC());
           pstate.setInt(7, nvct.getThuong());
           pstate.setInt(8, nvct.getKyluat());
           pstate.setDate(9, (Date) nvct.getNgaynhan());      
           pstate.setInt(10, nvct.getNgaycong());
           pstate.setInt(11, nvct.getNgaynghi());
           pstate.setInt(12, nvct.getGiolamthem());
           pstate.setString(13, nvct.getGhichu()); 
           pstate.setInt(14, nvct.getLuong());
           pstate.execute();
           conn.close();
           pstate.close();
       } catch (SQLException ex) {
           Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
       }
    finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    public static void Xoa(String manv){
        conn =  null;
        pstate = null;
              try{
        conn = DriverManager.getConnection(dbUrl);
        sql = "Delete From TblCongKhoiDieuHanh WHERE MaNV=?";
        pstate = conn.prepareStatement(sql);
        pstate.setString(1, manv);
           
        pstate.execute();//cau truy van
        pstate.close();
       conn.close();
      }catch(SQLException ex){
          Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
      }
         finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVCT_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
    
    
}

