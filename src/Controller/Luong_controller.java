/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import models.tblLuong;
/**
 *
 * @author taihd
 */
public class Luong_controller {
    public static Connection conn;
    public static Statement state;
    public static PreparedStatement pstate;
    public static ResultSet rs;
    public static String sql;
    public static List<tblLuong> LayNguon() {
        List<tblLuong> arr = new ArrayList<>();
        conn=null;
        state=null;
        try{
        conn=DriverManager.getConnection(dbUrl);
        sql = "Select * from TblBangLuongCTy Order By MaLuong";
        state = conn.createStatement();
        ResultSet rs =state.executeQuery(sql);
        while(rs.next()){
        tblLuong temp = new tblLuong();
         temp.setMaLuong(rs.getString("MaLuong"));
         temp.setLCB(rs.getInt("LCB"));
         temp.setPC(rs.getInt("PCChucVu"));
         temp.setNgayNhap(rs.getString("NgayNhap"));
         temp.setNgaySua(rs.getString("NgaySua"));
         temp.setGhiChu(rs.getString("GhiChu"));
         arr.add(temp);
        }
        state.close();
        conn.close();
        }catch(SQLException ex){
         Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return arr;
 }
    
     public static void ThemMoi(tblLuong luong) {

        conn =  null;
        pstate = null;
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql ="Insert into TblBangLuongCTy(MaLuong,LCB,PCChucVu,"
                    + ",NgayNhap,NgaySua,GhiChu)"
                    + " values (?,?,?,?,?,?) ";
           pstate = conn.prepareStatement(sql);
           pstate.setString(1, luong.getMaLuong());
           pstate.setInt(2,  luong.getLCB());
           pstate.setInt(3, luong.getPC());
           pstate.setString(4,  luong.getNgayNhap());
           pstate.setString(5,  luong.getNgaySua());
           pstate.setString(6, luong.getGhiChu());
           pstate.execute();
           conn.close();
           pstate.close();
        } catch (SQLException ex) {
            Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     
     
    public static void Sua(tblLuong luong, int LCB, int PC, java.util.Date NgayNhap, java.util.Date NgaySua, String GhiChu){
        conn =  null;
        pstate = null;
       try {
           conn=DriverManager.getConnection(dbUrl);
           sql ="Update TblBangLuongCTy Set MaLuong=?, LCB=?,PCChucVu=?,"
                   + "NgayNhap=?,GhiChu=? "
                   + "Where MaLuong=?, LCB=?,PCChucVu=?,NgayNhap=?,"
                   + "GhiChu=?";
           pstate = conn.prepareStatement(sql);
           pstate.setString(1,  luong.getMaLuong());
           pstate.setInt(2,  luong.getLCB());
           pstate.setInt(3,  luong.getPC());
           pstate.setString(4, luong.getNgayNhap());      
           pstate.setString(5, luong.getNgaySua());
           pstate.setString(6,  luong.getGhiChu());
           
           pstate.execute();
           conn.close();
           pstate.close();
       } catch (SQLException ex) {
           Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
       }
    finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    public static void Xoa(String manv){
        conn =  null;
        pstate = null;
              try{
        conn = DriverManager.getConnection(dbUrl);
        sql = "Delete From TblBangLuongCTy WHERE MaLuong=?";
        pstate = conn.prepareStatement(sql);
            String MaLuong = null;
           // int LCB = 0;
        pstate.setString(1, MaLuong);
           
        pstate.execute();//cau truy van
        pstate.close();
       conn.close();
      }catch(SQLException ex){
          Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
      }
         finally{
            if(state!=null)
                try {
                    state.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(Luong_controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }

    public static void Xoa(int MaLuong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
