
package Views;


import Controller.BaoHiem_Controller;
import static Controller.BaoHiem_Controller.conn;
import static Controller.BaoHiem_Controller.pstate;
import static Controller.BaoHiem_Controller.sql;
import Controller.Connects;
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
import models.tbBaoHiem;

public class frmBaoHiem extends javax.swing.JInternalFrame {
    DefaultTableModel tblBaoHiem; 
    List<tbBaoHiem> arr = new ArrayList<>();
    boolean ktThem;
    String macu;
    
    Connects cn = new Connects();
    public Connection conn;
    public frmBaoHiem() throws SQLException {
        initComponents();
        tblBaoHiem = (DefaultTableModel) dgDanhSachBH.getModel();
        KhoaMo(false);   
        LayNguon();
        cn.loadcombobox(ComboBoxMaNV, "select MaNV from TblTTNVCoBan", 1);
        ComboBoxMaNV.setSelectedIndex(-1);
         ComboBoxMaNV.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    try {
                        cn.loadtextbox(txtMaLuong, "select MaLuong from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
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
            dtNgayCapSo.setDate(date);
         
    }
    public void KhoaMo(boolean b){
        btnThem.setEnabled(!b);
        btnUpdate.setEnabled(!b);
        btnXoa.setEnabled(!b);
        btnKetThuc.setEnabled(!b);
        
        btnGhi.setEnabled(b);
        btnKhong.setEnabled(b);
        
        ComboBoxMaNV.setEnabled(b);
        txtGhiChu.setEditable(b);
        txtMaBH.setEditable(b);
        txtNoiCapSo.setEditable(b);
        
        dtNgayCapSo.setEnabled(b);
    }
    public void XoaTrang(){
        txtMaBH.setText("");
        txtGhiChu.setText("");
        txtMaLuong.setText("");
        txtNoiCapSo.setText("");
        ComboBoxMaNV.setSelectedIndex(-1);
    }
    public void LayNguon(){
        arr = BaoHiem_Controller.LayNguon();
        
        tblBaoHiem.setRowCount(0);
        arr.forEach(p->{
            tblBaoHiem.addRow(new Object[] {
                p.getMaNV(), p.getMaLuong(), p.getMaBH(), p.getNgayCapSo(), p.getNoiCapSo(), p.getGhiChu()
            });
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxMaNV = new javax.swing.JComboBox<>();
        txtMaLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaBH = new javax.swing.JTextField();
        dtNgayCapSo = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNoiCapSo = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        dgDanhSachBH = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Mã lương");

        txtMaLuong.setEditable(false);
        txtMaLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLuongActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã bảo hiểm");

        jLabel4.setText("Ngày cấp sổ");

        dtNgayCapSo.setDateFormatString("yyyy-MM-dd");

        jLabel5.setText("Nơi cấp sổ");

        jLabel6.setText("Ghi chú");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBoxMaNV, 0, 118, Short.MAX_VALUE)
                    .addComponent(txtMaLuong))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaBH)
                    .addComponent(dtNgayCapSo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNoiCapSo, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(txtGhiChu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(ComboBoxMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtNoiCapSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtMaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(dtNgayCapSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Các chức năng"));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnKetThuc.setText("Kết Thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(11, 11, 11)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnGhi)
                .addGap(18, 18, 18)
                .addComponent(btnKhong)
                .addGap(18, 18, 18)
                .addComponent(btnKetThuc)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnGhi)
                    .addComponent(btnKhong)
                    .addComponent(btnKetThuc)
                    .addComponent(btnUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgDanhSachBH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Mã lương ", "Mã bảo hiểm", "Ngày cấp sổ", "Nơi cấp sổ", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSachBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachBHMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(dgDanhSachBH);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quản Lý Bảo Hiểm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(230, 230, 230))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        XoaTrang();
        ktThem=true;
        KhoaMo(true);
        txtMaBH.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtMaLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLuongActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if(ComboBoxMaNV.getSelectedIndex() == -1){
             JOptionPane.showMessageDialog(this, "Không Được Để Trống Mã Nhân Viên","Thông báo", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                int message = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION);
                if(message == JOptionPane.YES_OPTION){ 
                    conn=DriverManager.getConnection(dbUrl);
                    sql="Delete From TblSoBH Where MaNV=?";
                    pstate=conn.prepareStatement(sql);
                    pstate.setString(1, macu);
                    pstate.execute();
                    pstate.close();; conn.close();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE); 
                    DefaultTableModel model = (DefaultTableModel) dgDanhSachBH.getModel();
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

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if(ktThem == true){
            try {
                if(!cn.Exitsted(ComboBoxMaNV.getSelectedItem().toString(), "SELECT MaNV FROM TblSoBH")){
                    if(ComboBoxMaNV.getSelectedItem().toString().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã nhân viên","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (txtNoiCapSo.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập nơi cấp sổ","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (txtMaBH.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã Bảo Hiểm","Thông báo", JOptionPane.WARNING_MESSAGE);
                    else if(txtMaBH.getText() != "" && txtNoiCapSo.getText() != ""){
                        conn = DriverManager.getConnection(dbUrl);
                        sql="Insert Into TblSoBH(MaNV, MaLuong, MaSoBH, NgayCapSo, NoiCapSo, GhiChu) Values(?,?,?,?,?,?)";
                        pstate=conn.prepareStatement(sql);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        pstate.setString(1, ComboBoxMaNV.getSelectedItem().toString());
                        pstate.setString(2, txtMaLuong.getText());
                        pstate.setString(3, txtMaBH.getText());
                        String d = sdf.format(dtNgayCapSo.getDate());
                        pstate.setString(4, d);
                        pstate.setString(5, txtNoiCapSo.getText());
                        pstate.setString(6, txtGhiChu.getText());
                        pstate.execute();
                        pstate.close();; conn.close();
                         JOptionPane.showMessageDialog(this, "Thêm thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                         DefaultTableModel model = (DefaultTableModel) dgDanhSachBH.getModel();
                         model.setRowCount(0);
                         LayNguon();
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
                    if (txtNoiCapSo.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập nơi cấp sổ","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (txtMaBH.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập Mã Bảo Hiểm","Thông báo", JOptionPane.WARNING_MESSAGE);
                    else if(txtMaBH.getText() != "" ){
                        conn = DriverManager.getConnection(dbUrl);
                        sql="UPDATE TblSoBH SET MaSoBH=?, NgayCapSo=?, NoiCapSo=?, GhiChu=? Where MaNV=?";
                        pstate=conn.prepareStatement(sql);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        pstate.setString(1, txtMaBH.getText());
                        String d = sdf.format(dtNgayCapSo.getDate());
                        pstate.setString(2, d);
                        pstate.setString(3, txtNoiCapSo.getText());
                        pstate.setString(4, txtGhiChu.getText());
                        pstate.setString(5, macu);
                        pstate.execute();
                        pstate.close();; conn.close();
                        JOptionPane.showMessageDialog(this, "Sửa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        DefaultTableModel model = (DefaultTableModel) dgDanhSachBH.getModel();
                        model.setRowCount(0);
                        LayNguon();
                    }
            } catch (SQLException ex) {
                Logger.getLogger(frmBaoHiem.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại","Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        XoaTrang();
        KhoaMo(false);
    }//GEN-LAST:event_btnKhongActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        int exit = JOptionPane.showConfirmDialog(this, "Bạn có muốn kết thúc không?","Thông báo",JOptionPane.YES_NO_OPTION);
        if(exit == JOptionPane.YES_OPTION)
        dispose();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void dgDanhSachBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachBHMouseClicked
        int i = dgDanhSachBH.getSelectedRow();
       ComboBoxMaNV.setSelectedItem(dgDanhSachBH.getValueAt(i, 0).toString());
       txtMaLuong.setText(dgDanhSachBH.getValueAt(i, 1).toString());
       txtMaBH.setText(dgDanhSachBH.getValueAt(i, 2).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dgDanhSachBH.getValueAt(i, 3).toString());
            dtNgayCapSo.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmCoBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtNoiCapSo.setText(dgDanhSachBH.getValueAt(i, 4).toString());
        txtGhiChu.setText(dgDanhSachBH.getValueAt(i, 5).toString());
    }//GEN-LAST:event_dgDanhSachBHMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here
        if(ComboBoxMaNV.getSelectedIndex() == -1){
            return;
        }else if(ComboBoxMaNV.getSelectedIndex() > -1){
            macu=ComboBoxMaNV.getSelectedItem().toString();
        }
        ktThem=false;
        KhoaMo(true);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMaNV;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable dgDanhSachBH;
    private com.toedter.calendar.JDateChooser dtNgayCapSo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMaBH;
    private javax.swing.JTextField txtMaLuong;
    private javax.swing.JTextField txtNoiCapSo;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
