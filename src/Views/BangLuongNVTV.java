/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controller.NVTV_controller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import models.tblNVTV;
/**
 *
 * @author taihd
 */
public final class BangLuongNVTV extends javax.swing.JInternalFrame {
    String tenbp, tenphong, manvtv, ghichu;
    int luongtv, ngaycong, ngaynghi,giolamthem, luong;
    Date ngaynhan;
   DefaultTableModel tbldanhsach;
    List<tblNVTV> arr = new ArrayList<>();
    boolean ktThem;
    String macu;
    public BangLuongNVTV() {
        initComponents();
        tbldanhsach = (DefaultTableModel) dgdanhsach.getModel();
        LayNguon();
        XoaTrang();
        KhoaMo(true);
        DeginTable();

    }
    
    
         public void LayNguon(){
        arr = NVTV_controller.LayNguon();
        
        tbldanhsach.setRowCount(0);
        arr.forEach(p->{
            tbldanhsach.addRow(new Object[]{
                p.getTenbp(),
                p.getTenphong(),
                p.getManvtv(),
                p.getLuongtv(),
                p.getNgaynhan(),
                p.getNgaycong(),
                p.getNgaynghi(),
                p.getGiolamthem(),
                p.getLuong(),
                p.getGhichu()
            });
        });
    }
    
     
         Date d = new Date();
    public void XoaTrang(){
        txtTenbp.setText("");
        txtTenPhong.setText("");
        txtLuongTV.setText("");
        txtDate.setDate(d);
        txtNgayCong.setText("");
        txtNgayNghi.setText("");
        txtGioLamThem.setText("");
        txtLuong.setText("");
        txtGhiChu.setText("");
        
    }
     
    public void KhoaMo(boolean b){
        btnThem.setEnabled(b);
        btnSua.setEnabled(b);
        btnXoa.setEnabled(b);
        btnThoat.setEnabled(b);
        
        btnGhi.setEnabled(!b);
        btnKhong.setEnabled(!b);
        
//        dgdanhsach.setEnabled(b);
    }
    
     
     public void DeginTable(){
        dgdanhsach.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        dgdanhsach.getColumnModel().getColumn(0).setPreferredWidth(170);
        dgdanhsach.getColumnModel().getColumn(1).setPreferredWidth(350);
        dgdanhsach.getColumnModel().getColumn(2).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(3).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(4).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(5).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(6).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(7).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(8).setPreferredWidth(150);
//        dgdanhsach.getColumnModel().getColumn(9).setPreferredWidth(150);
//        dgdanhsach.getColumnModel().getColumn(10).setPreferredWidth(150);
//        dgdanhsach.getColumnModel().getColumn(11).setPreferredWidth(150);
//        dgdanhsach.getColumnModel().getColumn(12).setPreferredWidth(150);
//        dgdanhsach.getColumnModel().getColumn(13).setPreferredWidth(150);
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new java.awt.Panel();
        txtNgayCong = new javax.swing.JTextField();
        txtGioLamThem = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTenbp = new javax.swing.JTextField();
        cbMaNV = new javax.swing.JComboBox<>();
        txtTenPhong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNgayNghi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLuongTV = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        btnTinhLuong = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgdanhsach = new javax.swing.JTable();
        panel1 = new java.awt.Panel();
        btnGhi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        txtLuong.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Số ngày nghỉ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Số giờ làm thêm");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ngay Nhan Luong");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Số ngày công");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lương");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ghi chú");

        cbMaNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã NV");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tên Bộ Phận");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tên Phòng");

        label1.setText("label1");

        label2.setText("Luong NVTV");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenbp)
                            .addComponent(cbMaNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayCong)
                                    .addComponent(txtLuongTV))))))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(txtLuongTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtNgayCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );

        btnTinhLuong.setText("Tính Lương");
        btnTinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhLuongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bảng Lương Nhân Viên Thử Việc");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgdanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tên Bộ Phận", "Ten PhongTên Phòng", "Mã NVTV", "Lương NVTV", "Ngày Nhận Lương", "Ngày Công", "Ngày Nghỉ", "Giờ Làm Thêm", "Lương", "Ghi Chú"
            }
        ));
        dgdanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgdanhsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgdanhsach);

        btnGhi.setText("Ghì");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGhi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKhong)
                    .addComponent(btnThoat))
                .addGap(103, 103, 103))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTinhLuong)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    
    private void btnTinhLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhLuongActionPerformed
        luongtv = Integer.parseInt(txtLuongTV.getText());
        ngaycong = Integer.parseInt(txtNgayCong.getText());
        giolamthem = Integer.parseInt(txtGioLamThem.getText());
        //        PC =Integer.parseInt(txtPhuCap.getText());
        //        thuong = Integer.parseInt(txtThuong.getText());
        ////      kyluat = String.valueOf(Integer.parseInt(txtKyLuat.getText()));
        //        kyluat = Integer.parseInt(txtKyLuat.getText());
        //      luong =  Integer.parseInt(txtTong.getText());
        if(ngaycong > 26)
        {
            JOptionPane.showInputDialog(this, "khong vuot qua 26!");
        }else
        {
            float luong = (luongtv / 26) * ngaycong + (giolamthem * 40000) ;
            String s = Float.toString(luong);
        }
    }//GEN-LAST:event_btnTinhLuongActionPerformed

    private void dgdanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgdanhsachMouseClicked
        try {
            int index = dgdanhsach.getSelectedRow();
            TableModel model = dgdanhsach.getModel();
            tenbp=model.getValueAt(index, 0).toString();
            
            tenphong=model.getValueAt(index, 1).toString();
            manvtv=model.getValueAt(index, 2).toString();
            luongtv=Integer.valueOf(model.getValueAt(index, 3).toString());
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 4).toString());
            txtDate.setDate(date);
            ngaycong=Integer.valueOf(model.getValueAt(index, 5).toString());
            ngaynghi=Integer.valueOf(model.getValueAt(index, 6).toString());
            giolamthem=Integer.valueOf(model.getValueAt(index, 7).toString());
            luong=Integer.valueOf(model.getValueAt(index, 8).toString());
            ghichu=model.getValueAt(index, 9).toString();
            
            txtTenbp.setText(tenbp);
            txtLuongTV.setText(String.valueOf(luongtv));
            txtDate.setDate(ngaynhan);
            txtNgayNghi.setText(String.valueOf(ngaynghi));
            txtTenPhong.setText(tenphong);
            txtNgayCong.setText(String.valueOf(ngaycong));
            txtGioLamThem.setText(String.valueOf(giolamthem));
            txtGhiChu.setText(ghichu);
            txtLuong.setText(String.valueOf(luong));
        } catch (ParseException ex) {
            Logger.getLogger(BangLuongNVTV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_dgdanhsachMouseClicked

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if(txtTenbp.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập tên bộ phận ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtTenbp.requestFocus();
            return;
        }
        if(txtTenPhong.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập tên phòng ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtTenPhong.requestFocus();
            return;}
        
        if(txtGioLamThem.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập giờ ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtGioLamThem.requestFocus();
            return;}
        if(txtLuongTV.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập lương thử viêc ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtLuongTV.requestFocus();
            return;}

        if(txtNgayNghi.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập ngày nghỉ ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtNgayNghi.requestFocus();
            return;}

        if(txtNgayCong.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập ngày công ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtNgayCong.requestFocus();
            return;}
       

        //    SimpleDateFormat df = new SimpleDateFormat ("dd-MM-yyyy");
        tenbp = txtTenbp.getText();
        tenphong = txtTenPhong.getText();
        luongtv = Integer.parseInt(txtLuongTV.getText());
        ngaynhan = (txtDate.getDate());
        ngaycong = Integer.parseInt(txtNgayCong.getText());
        ngaynghi = Integer.parseInt(txtNgayNghi.getText());
        luong = Integer.parseInt(txtLuong.getText());
        giolamthem = Integer.parseInt(txtGioLamThem.getText());
        ghichu = txtGhiChu.getText();

        tblNVTV nvct = new tblNVTV(tenbp, tenphong,manvtv,luongtv,
            ngaynhan,ngaycong, ngaynghi, giolamthem,luong,ghichu);

        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(txtTenPhong.getText().length()<=0)
        return ;
        ktThem=false;
        KhoaMo(false);
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        tenphong=txtTenPhong.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Thông báo", JOptionPane.YES_NO_OPTION);

        if (kq == JOptionPane.YES_OPTION) {
            NVTV_controller.Xoa(tenphong);
            XoaTrang();
            LayNguon();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        KhoaMo(true);
        XoaTrang();
    }//GEN-LAST:event_btnKhongActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
         int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();}
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
          XoaTrang();
        KhoaMo(false);
        ktThem=true;
        //        txtMaLuong.requestFocus();
        //        txtHoTen.requestFocus();
        //        txtLCB.requestFocus();
        //        txtPhuCap.requestFocus();
        //        txtPCK.requestFocus();
        //        txtNam.requestFocus();
        //        txtKyLuat.requestFocus();
        //        txtNgayNghi.requestFocus();
        //        txtThang.requestFocus();
        //        txtNgayCong.requestFocus();
        //        txtGioLamThem.requestFocus();
        //        txtGhiChu.requestFocus();
        //        txtThuong.requestFocus();
        //        txtTong.requestFocus();
        txtTenPhong.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTinhLuong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbMaNV;
    private javax.swing.JTable dgdanhsach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtGioLamThem;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtLuongTV;
    private javax.swing.JTextField txtNgayCong;
    private javax.swing.JTextField txtNgayNghi;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenbp;
    // End of variables declaration//GEN-END:variables
}