
package Controller;

import Model.tbPhongBan;
import static QLNS.QLNS.dbUrl;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class PhongBan_Controller {
    
    public static Connection conn;
    public static Statement state; 
    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;
    //1.Lay Nguon
    public static List<tbPhongBan> LayNguon(){
        DefaultTableModel tblDanhsach;
        List<tbPhongBan> arr = new ArrayList<>();
        conn= null;
        state = null;
        
        try{
        conn = DriverManager.getConnection(dbUrl);
        sql="Select * From TblPhongBan Order By MaPhong";
        state= (Statement) conn.createStatement();
        rs = state.executeQuery(sql);
        while (rs.next()){
            tbPhongBan temp = new tbPhongBan();
            temp.setMabophan(rs.getString("MaBoPhan"));
            temp.setMaphong(rs.getString("MaPhong"));
            temp.setTenphong(rs.getString("TenPhong"));
            temp.setNgaythanhlap(rs.getDate("NgayThanhLap"));
            temp.setGhichu(rs.getString("GhiChu"));
            arr.add(temp);
        }
        state.close();
        rs.close();
        conn.close();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(PhongBan_Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null){
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            }
        }
        return arr;
    }
    //2.Insert them 
    public static void ThemPhongBan(tbPhongBan pb){
        conn= null;
        ps= null;
        
        try {
            conn=  DriverManager.getConnection(dbUrl);
            sql= "Insert Into TblPhongBan(MaBoPhan,MaPhong,TenPhong,NgayThanhLap,GhiChu) Values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,pb.getMabophan());
            ps.setString(2,pb.getMaphong());
            ps.setString(3,pb.getTenphong());
            ps.setDate(4, new java.sql.Date(pb.getNgaythanhlap().getTime()));
            ps.setString(5,pb.getGhichu());
            ps.execute();
            ps.close();try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(ps!=null)
                try {
                    ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //3 Update tk: cap nhat 
    public static void CapNhat(tbPhongBan pb,String macu){
        conn=null;
        ps=null;
    
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Update TblPhongBan Set MaBoPhan=?, MaPhong=?, TenPhong=?, NgayThanhLap=?, GhiChu=? Where MaPhong=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, pb.getMabophan());
            ps.setString(2,pb.getMaphong());
            ps.setString(3,pb.getTenphong());
            ps.setDate(4, new java.sql.Date(pb.getNgaythanhlap().getTime()));
            ps.setString(5,pb.getGhichu());
            ps.setString(6, macu);
            ps.execute();
            ps.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
        if(ps!=null)
           try {
               ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
    }
    //4.Delete: Xoa 
    public static void XoaBo(String macu){
      conn= null;
      ps=null;
      
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Delete From TblPhongBan Where MaPhong=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, macu);
            ps.execute();
            ps.close();conn.close();
                    } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally{
        if(ps!=null)
           try {
               ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
    //5.Kiem tra trung ma
    public static boolean KiemTraTrungMa(String manhap, boolean ktThem, String macu){
        boolean kq= false;
        state= null;
        conn= null;
        
        try {
            conn= DriverManager.getConnection(dbUrl);
            if( ktThem==true)
                sql="Select MaPhong From TblPhongBan Where MaPhong= '"+ manhap+ "'";
            else
                sql="Select MaPhong From TblPhongBan Where MaPhong= '"+ manhap+ "' and MaPhong <>'"+ macu+"'";
            state= (Statement) conn.createStatement();
            rs = state.executeQuery(sql);
            if(rs.next()){
                kq= true;
                state.close();
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PhongBan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
}

