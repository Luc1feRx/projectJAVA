
package Views;

import static Controller.BaoHiem_Controller.pstate;
import static Controller.BaoHiem_Controller.sql;
import Controller.Connects;
import Controller.ThaiSan_Controller;
import static QLNS.QLNS.dbUrl;
import com.toedter.calendar.JDateChooser;
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
import models.tbThaiSan;

public class frmThaiSan extends javax.swing.JInternalFrame {
    DefaultTableModel tblThaiSan;
    List<tbThaiSan> arr = new ArrayList<>();
    String MaNV, MaBP, MaPhong, HoTen, NgaySinh, NgayVeSom, NgayVeSinh, NgayTroLai, TroCap, GhiChu;
    boolean ktThem;
    String macu;
    
    Connects cn = new Connects();
    public Connection conn;
    public frmThaiSan() throws SQLException {
        initComponents();
        tblThaiSan = (DefaultTableModel) dgDanhSachTS.getModel();
        KhoaMo(true); 
        LayNguon();
         cn.loadcombobox(ComboBoxMaNV, "select MaNV from TblTTNVCoBan", 1);
         ComboBoxMaNV.setSelectedIndex(-1);
         ComboBoxMaNV.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    try {
                        cn.loadtextbox(txtMaBP, "select MaBoPhan from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                        cn.loadtextbox(txtMaPhong, "select MaPhong from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                        cn.loadtextbox(txtHoTen, "select HoTen from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                        cn.loaddate(dtNgaySinh, "select NgaySinh from TblTTNVCoBan where MaNV=N'" + ComboBoxMaNV.getSelectedItem() + "'", 1);
                        
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
            dtNgaySinh.setDate(date);
            dtNgayNghiSinh.setDate(date);
            dtNgayLamTroLai.setDate(date);
    }
    public void KhoaMo(boolean b){
        btnThem.setEnabled(b);
        btnSua.setEnabled(b);
        btnXoa.setEnabled(b);
        btnKetThuc.setEnabled(b);
        
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
        
        txtGhiChu.setEditable(!b);
        txtHoTen.setEditable(!b);
        txtMaBP.setEditable(!b);
        txtMaPhong.setEditable(!b);
        txtTroCap.setEditable(!b);
        
        dgDanhSachTS.setEnabled(b);
        dtNgaySinh.setEnabled(!b);
        dtNgayNghiSinh.setEnabled(!b);
        dtNgayLamTroLai.setEnabled(!b);
    }
    public void XoaTrang(){
        txtGhiChu.setText("");
        txtHoTen.setText("");
        txtMaBP.setText("");
        txtMaPhong.setText("");
        txtTroCap.setText("");
        ComboBoxMaNV.setSelectedIndex(-1);
    }
    public void LayNguon(){
        arr = ThaiSan_Controller.LayNguon();
        
        tblThaiSan.setRowCount(0);
        arr.forEach(p->{
            tblThaiSan.addRow(new Object[]{
            p.getMaBoPhan(), p.getMaPhong(), p.getMaNV(), p.getHoTen(), p.getNgaySinh(), p.getNgayVeSinh(),p.getNgayLamLai(),p.getTroCap(), p.getGhiChu()
            });
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxMaNV = new javax.swing.JComboBox<>();
        txtMaBP = new javax.swing.JTextField();
        txtMaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        dtNgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dtNgayNghiSinh = new com.toedter.calendar.JDateChooser();
        dtNgayLamTroLai = new com.toedter.calendar.JDateChooser();
        txtTroCap = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgDanhSachTS = new javax.swing.JTable();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã nhân viên");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã bộ phận");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mã phòng");

        ComboBoxMaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMaNVActionPerformed(evt);
            }
        });

        txtMaBP.setEditable(false);

        txtMaPhong.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Họ tên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ngày sinh");

        txtHoTen.setEditable(false);

        dtNgaySinh.setDateFormatString("yyyy-MM-dd");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ngày Nghỉ Sinh");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ngày làm trở lại");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Trợ cấp ");

        dtNgayNghiSinh.setDateFormatString("yyyy-MM-dd");

        dtNgayLamTroLai.setDateFormatString("yyyy-MM-dd");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ghi chú");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaPhong)
                    .addComponent(txtMaBP)
                    .addComponent(ComboBoxMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHoTen)
                    .addComponent(dtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTroCap))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel8))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtNgayLamTroLai, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(dtNgayNghiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtNgayNghiSinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(ComboBoxMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMaBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(dtNgayLamTroLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTroCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGhiChu)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Các chức năng"));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnKhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
            .addGroup(jPanel2Layout.createSequentialGroup()
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
                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKetThuc)
                    .addComponent(btnKhong)
                    .addComponent(btnGhi)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        dgDanhSachTS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dgDanhSachTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Mã bộ phận", "Mã phòng", "Họ tên", "Ngày sinh", "Ngày về sinh", "Ngày làm trở lại", "Trợ cấp CT", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhSachTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhSachTSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dgDanhSachTS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxMaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMaNVActionPerformed

    }//GEN-LAST:event_ComboBoxMaNVActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        XoaTrang();
        ktThem=true;
        KhoaMo(false);
        ComboBoxMaNV.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_btnKhongActionPerformed

    private void dgDanhSachTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhSachTSMouseClicked
        int i = dgDanhSachTS.getSelectedRow();
        txtMaBP.setText(dgDanhSachTS.getValueAt(i, 0).toString());
        txtMaPhong.setText(dgDanhSachTS.getValueAt(i, 1).toString());
        ComboBoxMaNV.setSelectedItem(dgDanhSachTS.getValueAt(i, 2).toString());
        txtHoTen.setText(dgDanhSachTS.getValueAt(i, 3).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dgDanhSachTS.getValueAt(i, 4).toString());
            dtNgaySinh.setDate(date);
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dgDanhSachTS.getValueAt(i, 5).toString());
            dtNgayNghiSinh.setDate(date1);
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(dgDanhSachTS.getValueAt(i, 6).toString());
            dtNgayLamTroLai.setDate(date2);
        } catch (ParseException ex) {
            Logger.getLogger(frmThaiSan.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTroCap.setText(dgDanhSachTS.getValueAt(i, 7).toString());
        txtGhiChu.setText(dgDanhSachTS.getValueAt(i, 8).toString());
        
    }//GEN-LAST:event_dgDanhSachTSMouseClicked

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
                if(!cn.Exitsted(ComboBoxMaNV.getSelectedItem().toString(), "SELECT MaNV FROM TblThaiSan")){
                     if(ComboBoxMaNV.getSelectedItem().toString().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã nhân viên","Thông báo", JOptionPane.WARNING_MESSAGE);
                    if (txtTroCap.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập trợ cấp","Thông báo", JOptionPane.WARNING_MESSAGE);
                    int trocap = Integer.parseInt(txtTroCap.getText());
                    if (trocap < 200000) JOptionPane.showMessageDialog(this, "Trợ cấp phải trên 200000","Thông báo", JOptionPane.WARNING_MESSAGE);
                    else if(txtTroCap.getText().length() > 0 && trocap >= 200000){
                        conn = DriverManager.getConnection(dbUrl);
                        sql="Insert Into TblThaiSan(MaBoPhan, MaPhong, MaNV, HoTen, NgaySinh, NgayNghiSinh, NgayLamTroLai, TroCapCTY, GhiChu) Values(?,?,?,?,?,?,?,?,?)";
                        pstate=conn.prepareStatement(sql);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        pstate.setString(1, txtMaBP.getText());
                        pstate.setString(2, txtMaPhong.getText());
                        pstate.setString(3, ComboBoxMaNV.getSelectedItem().toString());
                        pstate.setString(4, txtHoTen.getText());
                        String d = sdf.format(dtNgaySinh.getDate());
                        pstate.setString(5, d);
                        String d2 = sdf.format(dtNgayNghiSinh.getDate());
                        pstate.setString(6, d2);
                        String d3 = sdf.format(dtNgayLamTroLai.getDate());
                        pstate.setString(7, d3);
                        pstate.setString(8, txtTroCap.getText());
                         pstate.setString(9, txtGhiChu.getText());
                        pstate.execute();
                        pstate.close();; conn.close();
                         JOptionPane.showMessageDialog(this, "Thêm thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                         DefaultTableModel model = (DefaultTableModel) dgDanhSachTS.getModel();
                         model.setRowCount(0);
                         LayNguon();
                    }
                }else if(cn.Exitsted(ComboBoxMaNV.getSelectedItem().toString(), "SELECT MaNV FROM TblThaiSan")){
                        JOptionPane.showMessageDialog(this, "Mã Nhân Viên Đã Tồn Tại!!","Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmThaiSan.class.getName()).log(Level.SEVERE, null, ex);
                 JOptionPane.showMessageDialog(this, "Thêm Thất Bại","Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }else{
             try {
                  if(ComboBoxMaNV.getSelectedItem().toString().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa chọn mã nhân viên","Thông báo", JOptionPane.WARNING_MESSAGE);
                if (txtTroCap.getText().isEmpty()) JOptionPane.showMessageDialog(this, "Bạn chưa nhập trợ cấp","Thông báo", JOptionPane.WARNING_MESSAGE);
                    int trocap = Integer.parseInt(txtTroCap.getText());
                    if (trocap < 200000) JOptionPane.showMessageDialog(this, "Trợ cấp phải trên 200000","Thông báo", JOptionPane.WARNING_MESSAGE);
                    else if(txtTroCap.getText().length() > 0 && trocap >= 200000){
                        conn = DriverManager.getConnection(dbUrl);
                        sql="UPDATE TblThaiSan SET NgaySinh=?, NgayNghiSinh=?, NgayLamTroLai=?, TroCapCTY=?, GhiChu=? Where MaNV=?";
                        pstate=conn.prepareStatement(sql);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        String d = sdf.format(dtNgaySinh.getDate());
                        pstate.setString(1, d);
                        String d1 = sdf.format(dtNgayNghiSinh.getDate());
                        pstate.setString(2, d1);
                        String d2 = sdf.format(dtNgayLamTroLai.getDate());
                        pstate.setString(3, d2);
                        pstate.setString(4, txtTroCap.getText());
                        pstate.setString(5, txtGhiChu.getText());
                        pstate.setString(6, macu);
                        pstate.execute();
                        pstate.close();; conn.close();
                         JOptionPane.showMessageDialog(this, "Sửa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                         DefaultTableModel model = (DefaultTableModel) dgDanhSachTS.getModel();
                         model.setRowCount(0);
                         LayNguon();
                    }
            } catch (SQLException ex) {
                Logger.getLogger(frmThaiSan.class.getName()).log(Level.SEVERE, null, ex);
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
                    sql="Delete From TblThaiSan Where MaNV=?";
                    pstate=conn.prepareStatement(sql);
                    pstate.setString(1, ComboBoxMaNV.getSelectedItem().toString());
                    pstate.execute();
                    pstate.close();; conn.close();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel model = (DefaultTableModel) dgDanhSachTS.getModel();
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
    private javax.swing.JComboBox<String> ComboBoxMaNV;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable dgDanhSachTS;
    private com.toedter.calendar.JDateChooser dtNgayLamTroLai;
    private com.toedter.calendar.JDateChooser dtNgayNghiSinh;
    private com.toedter.calendar.JDateChooser dtNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaBP;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtTroCap;
    // End of variables declaration//GEN-END:variables
}
