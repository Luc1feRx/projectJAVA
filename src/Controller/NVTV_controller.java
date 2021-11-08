/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static QLNS.QLNS.dbUrl;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.tblNVTV;

/**
 *
 * @author taihd
 */
public class NVTV_controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static String sql;
    public static List<tblNVTV> LayNguon() {
        List<tblNVTV> arr = new ArrayList<>();
        conn=null;
        state=null;
        try{
        conn=DriverManager.getConnection(dbUrl);
        sql = "Select * from TblBangCongThuViec Order By MaNV";
        state = conn.createStatement();
        ResultSet rs =state.executeQuery(sql);
        while(rs.next()){
        tblNVTV temp = new tblNVTV();
         temp.setTenbp(rs.getString("TenBoPhan"));
         temp.setTenphong(rs.getString("TenPhong"));
         temp.setManvtv(rs.getString("MaNVTV")); 
         temp.setLuongtv(rs.getInt("LuongTViec"));
         temp.setNgaynhan(rs.getDate("NgayNhanLuong"));
         temp.setNgaycong(rs.getInt("SoNgayCongThang"));
         temp.setNgaynghi(rs.getInt("SoNgayNghi"));
         temp.setGiolamthem(rs.getInt("SoGioLamThem"));
         temp.getLuong(rs.getInt("Luong"));
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
    
     public static void ThemMoi(tblNVTV nvtv) {

        conn =  null;
        pstate = null;
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql ="Insert into TblBangCongThuViec(TenBoPhan,TenPhong,MaNVTV,LuongTV"
                    + "NgayNhanLuong,SoNgayCong,SoNgayNghi,SoGioLamThem,Luong,GhiChu)"
                    + " values (?,?,?,?,?,?,?,?,?,?) ";
           pstate = conn.prepareStatement(sql);
           pstate.setString(1, nvtv.getTenbp());
           pstate.setString(2, nvtv.getTenphong());
           pstate.setString(3,  nvtv.getManvtv());
           pstate.setInt(4, nvtv.getLuongtv());
           pstate.setDate(5, (Date) nvtv.getNgaynhan());
           pstate.setInt(6, nvtv.getNgaycong());
           pstate.setInt(7, nvtv.getNgaynghi());
           pstate.setInt(8, nvtv.getGiolamthem());
           pstate.setInt(9, nvtv.getLuong());
           pstate.setString(10, nvtv.getGhichu());
           pstate.execute();
           conn.close();
           pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     
     
    public static void Sua(tblNVTV nvtv,String tenbp, String tenphong, String manvtv, 
            int luongtv,java.util.Date ngaynhan, int ngaycong, int ngaynghi, int giolamthem,
            int luong, String ghichu ){
        conn =  null;
        pstate = null;
       try {
           conn=DriverManager.getConnection(dbUrl);
           sql ="Update TblBangCongThuViec Set TenBoPhan=?,TenPhong=?,MaNVTV=?,LuongTV=?"
                   + "NgayNhanLuong=?,SoNgayCong=?,SoNgayNghi=?,SoGioLamThem=?,Luong=?,GhiChu=? "
                   + "Where TenBoPhan=?,TenPhong=?,MaNVTV=?,LuongTV=?,"
                   + "NgayNhanLuong=?,SoNgayCong=?,SoNgayNghi=?,SoGioLamThem=?,Luong=?,GhiChu=? ";
           pstate = conn.prepareStatement(sql);
           pstate.setString(1, nvtv.getTenbp());
           pstate.setString(2, nvtv.getTenphong());
           pstate.setString(3,  nvtv.getManvtv());    
           pstate.setInt(4, nvtv.getLuongtv());     
           pstate.setDate(5, (Date) nvtv.getNgaynhan());      
           pstate.setInt(6, nvtv.getNgaycong());
           pstate.setInt(7, nvtv.getNgaynghi());
           pstate.setInt(8, nvtv.getGiolamthem());
           pstate.setString(9, nvtv.getGhichu()); 
           pstate.setInt(10, nvtv.getLuong());
           pstate.execute();
           conn.close();
           pstate.close();
       } catch (SQLException ex) {
           Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
       }
    finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    public static void Xoa(String manvtv){
        conn =  null;
        pstate = null;
              try{
        conn = DriverManager.getConnection(dbUrl);
        sql = "Delete From TblBangCongThuViec WHERE MaNVTV=?";
        pstate = conn.prepareStatement(sql);
        pstate.setString(1, manvtv);
           
        pstate.execute();//cau truy van
        pstate.close();
       conn.close();
      }catch(SQLException ex){
          Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
      }
         finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(NVTV_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
    
    
}
