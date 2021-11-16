
package Controller;


import Model.tbBoPhan;
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
import static QLNS.QLNS.dbUrl;


public class BoPhan_Controller {
    public static Connection conn;
    public static Statement state; 
    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;
    //1.Lay Nguon
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
    //2.Insert them 
    public static void ThemBoPhan(tbBoPhan bp){
        conn= null;
        ps= null;
        
        try {
            conn=  DriverManager.getConnection(dbUrl);
            sql= "Insert Into TblBoPhan (MaBoPhan,TenBoPhan,NgayThanhLap,GhiChu) Values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,bp.getMabophan());
            ps.setString(2,bp.getTenbophan());
            ps.setDate(3, new java.sql.Date(bp.getNgaythanhlap().getTime()));
            ps.setString(4,bp.getGhichu());
            ps.execute();
            ps.close();try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(ps!=null)
                try {
                    ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //3 Update tk: cap nhat 
    public static void CapNhat(tbBoPhan bh,String macu){
        conn=null;
        ps=null;
    
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Update TblBoPhan Set MaBoPhan=?, TenBoPhan=?, NgayThanhLap=?, GhiChu=? Where MaBoPhan=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, bh.getMabophan());
            ps.setString(2,bh.getTenbophan());
            ps.setDate(3, new java.sql.Date(bh.getNgaythanhlap().getTime()));
            ps.setString(4,bh.getGhichu());
            ps.setString(5, macu);
            ps.execute();
            ps.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
        if(ps!=null)
           try {
               ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
    }
    //4.Delete: Xoa 
    public static void XoaBo(String macu){
      conn= null;
      ps=null;
      
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Delete From TblBoPhan Where MaBoPhan=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, macu);
            ps.execute();
            ps.close();conn.close();
                    } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally{
        if(ps!=null)
           try {
               ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
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
                sql="Select MaBoPhan From TblBoPhan Where MaBoPhan= '"+ manhap+ "'";
            else
                sql="Select MaBoPhan  From TblBoPhan Where MaBoPhan = '"+ manhap+ "' and MaBoPhan  <>'"+ macu+"'";
            state= (Statement) conn.createStatement();
            rs = state.executeQuery(sql);
            if(rs.next()){
                kq= true;
                state.close();
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(BoPhan_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
}
