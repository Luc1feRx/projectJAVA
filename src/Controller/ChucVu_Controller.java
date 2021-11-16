
package Controller;


import Model.tbChucVu;
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

public class ChucVu_Controller {
    public static Connection conn;
    public static Statement state; 
    public static String sql;
    public static PreparedStatement ps;
    public static ResultSet rs;
    //1.Lay Nguon
    public static List<tbChucVu> LayNguon(){
        List<tbChucVu> arr = new ArrayList<>();
        conn= null;
        state = null;
        
        try{
        conn = DriverManager.getConnection(dbUrl);
        sql="Select * From TblChucVu Order By MaChucVu";
        state= (Statement) conn.createStatement();
        rs = state.executeQuery(sql);
        while (rs.next()){
            tbChucVu temp = new tbChucVu();
            temp.setMachucvu(rs.getString("MaChucVu"));
            temp.setChucvu(rs.getString("ChucVu"));
            arr.add(temp);
        }
        state.close();
        rs.close();
        conn.close();
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(ChucVu_Controller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        finally{
            if(state!=null){
                try {
                    state.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn!=null){
                    try {
                        conn.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
            }
        }
        return arr;
    }
    //2.Insert them 
    public static void ThemChucVu(tbChucVu cv){
        conn= null;
        ps= null;
        
        try {
            conn=  DriverManager.getConnection(dbUrl);
            sql= "Insert Into TblChucVu (MaChucVu,ChucVu) Values(?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,cv.getMachucvu());
            ps.setString(2,cv.getChucvu());
            ps.execute();
            ps.close();try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(ps!=null)
                try {
                    ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(conn!=null)
                try {
                    conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //3 Update tk: cap nhat 
    public static void CapNhat(tbChucVu cv,String macu){
        conn=null;
        ps=null;
    
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Update TblChucVu Set MaChucVu=?, ChucVu=? Where MaChucVu=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, cv.getMachucvu());
            ps.setString(2,cv.getChucvu());
            ps.setString(3, macu);
            ps.execute();
            ps.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
        if(ps!=null)
           try {
               ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    
    }
    //4.Delete: Xoa 
    public static void XoaBo(String macu){
      conn= null;
      ps=null;
      
        try {
            conn=DriverManager.getConnection(dbUrl);
            sql="Delete From TblChucVu Where MaChucVu=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, macu);
            ps.execute();
            ps.close();conn.close();
                    } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
           finally{
        if(ps!=null)
           try {
               ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(conn!=null)
            try {
                conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
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
                sql="Select MaChucVu From TblChucVu Where MaChucVu= '"+ manhap+ "'";
            else
                sql="Select MaChucVu  From TblChucVu Where MaChucVu = '"+ manhap+ "' and MaChucVu  <>'"+ macu+"'";
            state= (Statement) conn.createStatement();
            rs = state.executeQuery(sql);
            if(rs.next()){
                kq= true;
                state.close();
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ChucVu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kq;
    }
}

