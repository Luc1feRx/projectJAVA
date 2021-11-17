
package Views;

import static Controller.BaoHiem_Controller.pstate;
import static Controller.BaoHiem_Controller.sql;
import Controller.Connects;
import Controller.TangLuong_Controller;
import static QLNS.QLNS.dbUrl;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import models.tbTangLuong;

public class frmTangLuong extends javax.swing.JInternalFrame {
    DefaultTableModel tblTangLuong;
    List<tbTangLuong> arr = new ArrayList<>();
    boolean ktThem;
    String macu;
    Connects cn = new Connects();
    public Connection conn;
    
    public frmTangLuong() throws SQLException {
        initComponents();
        tblTangLuong = (DefaultTableModel) dgDanhSachTL.getModel();
        KhoaMo(true);
        LayNguon();
        cn.loadcombobox(ComboBoxMaNV, "select MaNV from TblTTNVCoBan", 1);
        cn.loadcombobox(ComboBoxMaLM, "select MaLuong from TblBangLuongCTy", 1);
        ComboBoxMaNV.setSelectedIndex(-1);
        ComboBoxMaLM.setSelectedIndex(-1);
        ComboBoxMaNV.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    try {
                        cn.loadtextbox(txtHoTen, "select HoTen from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                        cn.loadtextbox(txtGioiTinh, "select GioiTinh  from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                        cn.loadtextbox(txtChucVu, "select ChucVu from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                        cn.loadtextbox(txtMaLuongCu, "select MaLuong from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                    } catch (SQLException ex) {
                        Logger.getLogger(frmCoBan.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
         //set date = thời gian hiện tại
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
            int currentDate= Calendar.getInstance().get(Calendar.DATE);
            calendar.set(currentYear , currentMonth , currentDate);
            date.setTime(calendar.getTimeInMillis());
            dtNgayTang.setDate(date);
        
    }
    
    public void KhoaMo(boolean b){
        btnThem.setEnabled(b);
        btnSua.setEnabled(b);
        btnXoa.setEnabled(b);
        btnKetThuc.setEnabled(b);
        
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
        
        txtChucVu.setEditable(!b);
        txtGioiTinh.setEditable(!b);
        txtHoTen.setEditable(!b);
        txtLyDo.setEditable(!b);
        txtMaLuongCu.setEditable(!b);
        ComboBoxMaLM.setEnabled(!b);
        ComboBoxMaNV.setEnabled(!b);
        
        dgDanhSachTL.setEnabled(b);
    }
    public void XoaTrang(){
       txtChucVu.setText("");
       txtGioiTinh.setText("");
       txtHoTen.setText("");
       txtLyDo.setText("");
       txtMaLuongCu.setText("");
       ComboBoxMaLM.setSelectedIndex(-1);
    }
    public void LayNguon(){
        arr = TangLuong_Controller.LayNguon();
        
        tblTangLuong.setRowCount(0);
        arr.forEach(p->{
            tblTangLuong.addRow(new Object[]{
            p.getMaNV(), p.getHoTen(),p.getGioiTinh(), p.getChucVu(), p.getMaLuongCu(), p.getMaLuongMoi(), p.getNgayTang(), p.getLyDo()
            });
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxMaNV = new javax.swing.JComboBox<>();
        txtHoTen = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        txtMaLuongCu = new javax.swing.JTextField();
        ComboBoxMaLM = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        dtNgayTang = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtLyDo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSachTL = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Giới tính");

        txtHoTen.setEditable(false);

        txtGioiTinh.setEditable(false);

        jLabel4.setText("Chức vụ");

        jLabel5.setText("Mã lương cũ");

        jLabel6.setText("Mã lương mới");

        txtChucVu.setEditable(false);

        txtMaLuongCu.setEditable(false);

        jLabel7.setText("Ngày tăng");

        dtNgayTang.setDateFormatString("yyyy-MM-dd");

        jLabel8.setText("Lý do");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxMaNV, 0, 90, Short.MAX_VALUE)
                    .addComponent(txtHoTen)
                    .addComponent(txtGioiTinh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxMaLM, 0, 90, Short.MAX_VALUE)
                    .addComponent(txtMaLuongCu)
                    .addComponent(txtChucVu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtNgayTang, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLyDo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dtNgayTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLyDo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ComboBoxMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txtMaLuongCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(ComboBoxMaLM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Các chức năng"));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_20px.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_update_20px.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_20px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_save_20px.png"))); // NOI18N
        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnKhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_no_entry_20px.png"))); // NOI18N
        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_close_sign_20px.png"))); // NOI18N
        btnKetThuc.setText("Kết Thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnGhi)
                .addGap(18, 18, 18)
                .addComponent(btnKhong)
                .addGap(18, 18, 18)
                .addComponent(btnKetThuc)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnGhi)
                    .addComponent(btnKhong)
                    .addComponent(btnKetThuc))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        dgDanhSachTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Giới tính", "Chức vụ", "Mã lương cũ", "Mã lương mới", "Ngày tăng", "Lý do"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSachTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachTLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgDanhSachTL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        XoaTrang();
        ktThem=true;
        KhoaMo(false);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_btnKhongActionPerformed

    private void dgDanhSachTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachTLMouseClicked
        int i = dgDanhSachTL.getSelectedRow();
        ComboBoxMaNV.setSelectedItem(dgDanhSachTL.getValueAt(i, 0).toString());
        txtHoTen.setText(dgDanhSachTL.getValueAt(i, 1).toString());
        txtGioiTinh.setText(dgDanhSachTL.getValueAt(i, 2).toString());
        txtChucVu.setText(dgDanhSachTL.getValueAt(i, 3).toString());
        txtMaLuongCu.setText(dgDanhSachTL.getValueAt(i, 4).toString());
        ComboBoxMaLM.setSelectedItem(dgDanhSachTL.getValueAt(i, 5).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dgDanhSachTL.getValueAt(i, 6).toString());
            dtNgayTang.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmTangLuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtLyDo.setText(dgDanhSachTL.getValueAt(i, 7).toString());
    }//GEN-LAST:event_dgDanhSachTLMouseClicked

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        int exit = JOptionPane.showConfirmDialog(this, "Bạn có muốn kết thúc không?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(exit == JOptionPane.YES_OPTION)
        dispose();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (ComboBoxMaNV.getSelectedIndex() == -1){
              return;
         }else if(ComboBoxMaNV.getSelectedIndex() > -1){
              macu=ComboBoxMaNV.getSelectedItem().toString();
         }
        ktThem=false;
        KhoaMo(false);
        ComboBoxMaNV.requestFocus();  
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        if(ktThem == true){
             try {
                if(!cn.Exitsted(ComboBoxMaNV.getSelectedItem().toString(), "SELECT MaNV FROM TblTangLuong")){
                    if(ComboBoxMaNV.getSelectedItem().toString().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã nhân viên","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (ComboBoxMaLM.getSelectedItem().toString().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã lương mới","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (txtLyDo.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập lý do","Thông báo", JOptionPane.WARNING_MESSAGE);
                    else if(txtLyDo.getText() != ""){
                        conn = DriverManager.getConnection(dbUrl);
                        sql="Insert Into TblTangLuong(MaNV, HoTen, GioiTinh, ChucVu, MaLuongCu, MaLuongMoi, NgayTang, LyDo) Values(?,?,?,?,?,?,?,?)";
                        pstate=conn.prepareStatement(sql);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        pstate.setString(1, ComboBoxMaNV.getSelectedItem().toString());
                        pstate.setString(2, txtHoTen.getText());
                        pstate.setString(3, txtGioiTinh.getText());
                        pstate.setString(4, txtChucVu.getText());
                        pstate.setString(5, txtMaLuongCu.getText());
                        pstate.setString(6, ComboBoxMaLM.getSelectedItem().toString());
                        String d = sdf.format(dtNgayTang.getDate());
                        pstate.setString(7, d);
                        pstate.setString(8, txtLyDo.getText());
                        pstate.execute();
                        pstate.close();; conn.close();
                         JOptionPane.showMessageDialog(this, "Thêm thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                         DefaultTableModel model = (DefaultTableModel) dgDanhSachTL.getModel();
                         model.setRowCount(0);
                         LayNguon();
                         String up = "update TblTTNVCoBan set MaLuong=N'" + ComboBoxMaLM.getSelectedItem()+ "' where MaNV='" + ComboBoxMaNV.getSelectedItem() + "'";
                         cn.MakeConnect(up);
                    }
                }else if(cn.Exitsted(ComboBoxMaNV.getSelectedItem().toString(), "SELECT MaNV FROM TblSoBH")){
                    JOptionPane.showMessageDialog(this, "Mã Nhân Viên Đã Tồn Tại!!","Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmBaoHiem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Thêm Thất Bại","Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            try {
                if(ComboBoxMaNV.getSelectedItem().toString().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã nhân viên","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (ComboBoxMaLM.getSelectedItem().toString().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã lương mới","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (txtLyDo.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập lý do","Thông báo", JOptionPane.WARNING_MESSAGE);
                    else if(txtLyDo.getText() != ""){
                        conn = DriverManager.getConnection(dbUrl);
                        sql="UPDATE TblTangLuong SET MaLuongMoi = ?, NgayTang = ?, LyDo = ? WHERE MaNV = ?";
                        pstate=conn.prepareStatement(sql);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        pstate.setString(1, ComboBoxMaLM.getSelectedItem().toString());
                        String d = sdf.format(dtNgayTang.getDate());
                        pstate.setString(2, d);
                        pstate.setString(3, txtLyDo.getText());
                        pstate.setString(4, macu);
                        pstate.execute();
                        pstate.close();; conn.close();
                         JOptionPane.showMessageDialog(this, "Sửa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                         DefaultTableModel model = (DefaultTableModel) dgDanhSachTL.getModel();
                         model.setRowCount(0);
                         LayNguon();
                         String up = "update TblTTNVCoBan set MaLuong=N'" + ComboBoxMaLM.getSelectedItem()+ "' where MaNV='" + ComboBoxMaNV.getSelectedItem() + "'";
                         cn.MakeConnect(up);
                    }
            } catch (SQLException ex) {
                Logger.getLogger(frmBaoHiem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại","Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(ComboBoxMaNV.getSelectedIndex() == -1){
             JOptionPane.showMessageDialog(this, "Không Được Để Trống Mã Nhân Viên","Thông báo", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                int message = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION);
                if(message == JOptionPane.YES_OPTION){ 
                    conn=DriverManager.getConnection(dbUrl);
                    sql="Delete From TblTangLuong Where MaNV=?";
                    pstate=conn.prepareStatement(sql);
                    pstate.setString(1, ComboBoxMaNV.getSelectedItem().toString());
                    pstate.execute();
                    pstate.close();; conn.close();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel model = (DefaultTableModel) dgDanhSachTL.getModel();
                    model.setRowCount(0);
                     LayNguon();
                }else{
                    return;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(frmCoBan.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Xóa thất bại!!!","Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMaLM;
    private javax.swing.JComboBox<String> ComboBoxMaNV;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable dgDanhSachTL;
    private com.toedter.calendar.JDateChooser dtNgayTang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLyDo;
    private javax.swing.JTextField txtMaLuongCu;
    // End of variables declaration//GEN-END:variables
}
