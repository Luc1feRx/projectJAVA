/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controller.Connects;
import Controller.Luong_controller;
import static Controller.Luong_controller.conn;
import static Controller.Luong_controller.pstate;
import static Controller.Luong_controller.sql;
import static QLNS.QLNS.dbUrl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import models.tblLuong;
/**
 *
 * @author taihd
 */
public final class BangLuong extends javax.swing.JInternalFrame {
    int LCB, PC ;
    Date NgayNhap, NgaySua;
    String MaLuong, GhiChu;
    DefaultTableModel tbldanhsach;
    List<tblLuong> arr = new ArrayList<>();
    boolean ktThem;
    String macu;
        Connects cn = new Connects();
    public Connection conn;
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
    int currentDate= Calendar.getInstance().get(Calendar.DATE);
//    private int tiet;
    /**
     * Creates new form mdiBangLuong
     */
    public BangLuong() {
        initComponents();
        tbldanhsach = (DefaultTableModel) dgdanhsach.getModel();
        LayNguon();
        KhoaMo(false);
        DeginTable();
         calendar.set(currentYear , currentMonth , currentDate);
         date.setTime(calendar.getTimeInMillis());
         dcNgayNhap.setDate(date);
          dcNgaySua.setDate(date);
    }

    
    public void DeginTable(){
        dgdanhsach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgdanhsach.getColumnModel().getColumn(0).setPreferredWidth(170);
        dgdanhsach.getColumnModel().getColumn(1).setPreferredWidth(350);
        dgdanhsach.getColumnModel().getColumn(2).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(3).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(4).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(5).setPreferredWidth(150);
    }
    
    
    public void LayNguon(){
        arr = Luong_controller.LayNguon();
        
        tbldanhsach.setRowCount(0);
        arr.forEach(p->{
            tbldanhsach.addRow(new Object[]{
                p.getMaLuong(),
                p.getLCB(),
                p.getPC(),
                p.getNgayNhap(),
                p.getNgaySua(),
                p.getGhiChu()
            });
        });
    }
    
     public void XoaTrang(){
        txtLuongCB.setText("");
        txtPCChucVu.setText("");
        txtGhiChu.setText("");
        txtMaLuong.setText("");
        
        calendar.set(currentYear , currentMonth , currentDate);
         date.setTime(calendar.getTimeInMillis());
         dcNgayNhap.setDate(date);
          dcNgaySua.setDate(date);
    }
     
    public void KhoaMo(boolean b){
        btnKhong.setEnabled(b);
        btnThem.setEnabled(!b);
        btnSua.setEnabled(!b);
        btnThoat.setEnabled(!b);
        btnGhi.setEnabled(b);
        btnXoa.setEnabled(!b);
        txtMaLuong.setEditable(b);
        txtLuongCB.setEditable(b);
        txtPCChucVu.setEditable(b);
        txtGhiChu.setEditable(b);
        dcNgayNhap.setEnabled(b);
        dcNgaySua.setEnabled(b);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgdanhsach = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLuongCB = new javax.swing.JTextField();
        txtPCChucVu = new javax.swing.JTextField();
        dcNgayNhap = new com.toedter.calendar.JDateChooser();
        dcNgaySua = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLuong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        dgdanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Lương", "LCB", "Phụ Cấp", "Ngày Nhập", "Ngày Sửa", "Ghi Chú"
            }
        ));
        dgdanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgdanhsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgdanhsach);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ngày Sửa");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ngày nhập");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ghi chú");

        dcNgayNhap.setDateFormatString("yyyy-MM-dd");

        dcNgaySua.setDateFormatString("yyyy-MM-dd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lương Cơ Bản");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PC Chức Vụ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã Lương");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPCChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel11)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dcNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(dcNgaySua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtGhiChu))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel11))
                    .addComponent(dcNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGhiChu)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPCChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_20px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_update_20px.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnGhi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_save_20px.png"))); // NOI18N
        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_close_sign_20px.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_20px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnKhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_no_entry_20px.png"))); // NOI18N
        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhong, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKhong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bảng Lương Công Ty");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       ktThem = true;
        KhoaMo(true);
        XoaTrang();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(txtMaLuong.getText().isEmpty()){
                return;
        }else if(txtMaLuong.getText().length()>0){
                macu = txtMaLuong.getText();
        }
        ktThem=false;
        KhoaMo(true);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if(ktThem == true){
            try {
                if(txtMaLuong.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập Lương ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                    txtMaLuong.requestFocus();
                    return;
                }else if(txtPCChucVu.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập phụ cấp ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                    txtPCChucVu.requestFocus();
                }else if(txtLuongCB.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập phụ cấp ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                    txtLuongCB.requestFocus();
                }else{
                    conn=DriverManager.getConnection(dbUrl);
                    sql ="Insert into TblBangLuongCTy(MaLuong,LCB,PCChucVu,"
                            + "NgayNhap,NgaySua,GhiChu)"
                            + " values (?,?,?,?,?,?) ";
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                   pstate = conn.prepareStatement(sql);
                   pstate.setString(1, txtMaLuong.getText());
                   pstate.setString(2,  txtLuongCB.getText());
                   pstate.setString(3, txtPCChucVu.getText());
                   String d = sdf.format(dcNgayNhap.getDate());
                   pstate.setString(4, d);
                   String d1 = sdf.format(dcNgaySua.getDate());
                   pstate.setString(5,  d1);
                   pstate.setString(6, txtGhiChu.getText());
                   pstate.execute();
                   conn.close();
                   pstate.close();
                   JOptionPane.showMessageDialog(this, "Thêm thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                   DefaultTableModel model = (DefaultTableModel) dgdanhsach.getModel();
                   model.setRowCount(0);
                   LayNguon();
                }

            } catch (SQLException ex) {
                Logger.getLogger(BangLuong.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
                 try {
                if(txtMaLuong.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập Lương ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                    txtMaLuong.requestFocus();
                    return;
                }else if(txtPCChucVu.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập phụ cấp ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                    txtPCChucVu.requestFocus();
                }else if(txtLuongCB.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập phụ cấp ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                    txtLuongCB.requestFocus();
                }else{
                    conn=DriverManager.getConnection(dbUrl);
                    sql ="Update TblBangLuongCTy Set LCB=?,PCChucVu=?,"
                            + "NgayNhap=?, NgaySua = ? ,GhiChu=? where MaLuong = ?";
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                    pstate = conn.prepareStatement(sql);
                    pstate.setString(1,  txtLuongCB.getText());
                    pstate.setString(2,  txtPCChucVu.getText());
                     String d = sdf.format(dcNgayNhap.getDate());
                    pstate.setString(3,  d);
                    String d1 = sdf.format(dcNgaySua.getDate());
                    pstate.setString(4, d1);      
                    pstate.setString(5, txtGhiChu.getText());
                    pstate.setString(6,  macu);
                    pstate.execute();
                    conn.close();
                    pstate.close();
                   JOptionPane.showMessageDialog(this, "Sửa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                   DefaultTableModel model = (DefaultTableModel) dgdanhsach.getModel();
                   model.setRowCount(0);
                   LayNguon();
                }

            } catch (SQLException ex) {
                Logger.getLogger(BangLuong.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
        }

       
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed

        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();}
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         
        if(txtMaLuong.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Không Được Để Trống Mã Lương","Thông báo", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                int message = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION);
                if(message == JOptionPane.YES_OPTION){ 
                    conn=DriverManager.getConnection(dbUrl);
                    sql="Delete From TblBangLuongCTy Where MaLuong=?";
                    pstate=conn.prepareStatement(sql);
                    pstate.setString(1, txtMaLuong.getText());
                    pstate.execute();
                    pstate.close();; conn.close();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE); 
                    DefaultTableModel model = (DefaultTableModel) dgdanhsach.getModel();
                    model.setRowCount(0);
                     LayNguon();
                }else{
                    return;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(BangLuong.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Xóa thất bại!!!","Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        XoaTrang();
        KhoaMo(false);
        ktThem=true;
        txtMaLuong.requestFocus();
    }//GEN-LAST:event_btnKhongActionPerformed

    private void dgdanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgdanhsachMouseClicked
        int i = dgdanhsach.getSelectedRow();
        TableModel model = dgdanhsach.getModel();
         txtMaLuong.setText(dgdanhsach.getValueAt(i, 0).toString());
         txtLuongCB.setText(dgdanhsach.getValueAt(i, 1).toString());
         txtPCChucVu.setText(dgdanhsach.getValueAt(i, 2).toString());
          try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dgdanhsach.getValueAt(i, 3).toString());
            dcNgayNhap.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmCoBan.class.getName()).log(Level.SEVERE, null, ex);
        }
           try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dgdanhsach.getValueAt(i, 4).toString());
            dcNgaySua.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmCoBan.class.getName()).log(Level.SEVERE, null, ex);
        }
           txtGhiChu.setText(dgdanhsach.getValueAt(i, 5).toString());
    }//GEN-LAST:event_dgdanhsachMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dcNgayNhap;
    private com.toedter.calendar.JDateChooser dcNgaySua;
    private javax.swing.JTable dgdanhsach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtLuongCB;
    private javax.swing.JTextField txtMaLuong;
    private javax.swing.JTextField txtPCChucVu;
    // End of variables declaration//GEN-END:variables
}
