/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controller.NVCT_controller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import models.tblNVCT;
/**
 *
 * @author taihd
 */
public final class BangLuongNVCT extends javax.swing.JInternalFrame {
    String manv, tenphong, hoten, maluong,  ghichu; 
    int LCB, PC, ngaycong,thuong, ngaynghi, giolamthem,kyluat, luong;
    Date ngaynhan;
    DefaultTableModel tbldanhsach;
    List<tblNVCT> arr = new ArrayList<>();
    boolean ktThem;
    String macu;
    public BangLuongNVCT() {
        initComponents();
        tbldanhsach = (DefaultTableModel) dgdanhsach.getModel();
        LayNguon();
        XoaTrang();
        KhoaMo(true);
        DeginTable();
    }

     public void LayNguon(){
        arr = NVCT_controller.LayNguon();
        
        tbldanhsach.setRowCount(0);
        arr.forEach(p->{
            tbldanhsach.addRow(new Object[]{
                p.getTenphong(),
                p.getHoten(),
                p.getMaluong(),
                p.getLCB(),
                p.getPC(),
                p.getThuong(),
                p.getKyluat(),
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
        txtMaNV.setText("");
        txtMaLuong.setText("");
        txtLCB.setText("");
        txtPhuCap.setText("");
        txtThuong.setText("");
        txtKyLuat.setText("");
        txtDate.setDate(d);
        txtNgayCong.setText("");
        txtNgayNghi.setText("");
        txtGioLamThem.setText("");
        txtTong.setText("");
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
        dgdanhsach.getColumnModel().getColumn(9).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(10).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(11).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(12).setPreferredWidth(150);
        dgdanhsach.getColumnModel().getColumn(13).setPreferredWidth(150);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGhiChu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        txtNgayCong = new javax.swing.JTextField();
        txtGioLamThem = new javax.swing.JTextField();
        txtTong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMaLuong = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtPhuCap = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtLCB = new javax.swing.JTextField();
        cbTenPhong = new javax.swing.JComboBox<>();
        txtThuong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtKyLuat = new javax.swing.JTextField();
        txtNgayNghi = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgdanhsach = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTinhTien = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();

        setName("Bảng Lương Nhân Viên Chính Thức"); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Ghi chú");

        txtTong.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Số ngày nghỉ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Số giờ làm thêm");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Số ngày công");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Tính tổng");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Ngay NhanLuong");

        txtLCB.setEditable(false);
        txtLCB.setEnabled(false);

        cbTenPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tên phòng");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mã NV");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mã lương");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Họ tên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LCB");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phụ cấp");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Thương");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Kỉ luật");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9)))
                        .addGap(35, 35, 35)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txtKyLuat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(txtThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgayCong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMaLuong, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPhuCap, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMaNV)
                        .addComponent(cbTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(112, 112, 112)
                    .addComponent(txtLCB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addComponent(jLabel15)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgayCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtKyLuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(7, 7, 7)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGap(92, 92, 92)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        dgdanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã nv", "tên phòng", "họ tên", "mã lương", "LCB", "Phụ cấp", "Thưởng", "kỉ luật", "ngày nhận lương", "ngày côg", "ngày nghỉ", "giờ làm thêm", "tính tổng", "ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgdanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgdanhsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dgdanhsach);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Bảng Lương Nhân Viên Chính Thức");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
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

        btnTinhTien.setText("Tính Lương");
        btnTinhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTienActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghì");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTinhTien, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnThem)
                        .addComponent(btnKhong))
                    .addGap(18, 18, 18)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btnGhi, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(btnThoat)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(btnTinhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgdanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgdanhsachMouseClicked
        try {
            int index = dgdanhsach.getSelectedRow();
            TableModel model = dgdanhsach.getModel();
            manv=model.getValueAt(index, 0).toString();
            tenphong=model.getValueAt(index, 1).toString();
            hoten=model.getValueAt(index, 2).toString();
            maluong=model.getValueAt(index, 3).toString();
            LCB=Integer.valueOf(model.getValueAt(index, 4).toString());
            PC=Integer.valueOf(model.getValueAt(index, 5).toString());
            thuong=Integer.valueOf(model.getValueAt(index, 6).toString());
            kyluat=Integer.valueOf(model.getValueAt(index, 7).toString());
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 8).toString());
            txtDate.setDate(date);
            ngaycong=Integer.valueOf(model.getValueAt(index, 9).toString());
            ngaynghi=Integer.valueOf(model.getValueAt(index, 10).toString());
            giolamthem=Integer.valueOf(model.getValueAt(index, 11).toString());
            luong=Integer.valueOf(model.getValueAt(index, 12).toString());
            ghichu=model.getValueAt(index, 13).toString();
            
            txtMaLuong.setText(maluong);
            txtHoTen.setText(hoten);
            txtLCB.setText(String.valueOf(LCB));
            txtPhuCap.setText(String.valueOf(PC));
            txtDate.setDate(ngaynhan);
            txtKyLuat.setText(String.valueOf(kyluat));
            txtNgayNghi.setText(String.valueOf(ngaynghi));
            
            txtNgayCong.setText(String.valueOf(ngaycong));
            txtGioLamThem.setText(String.valueOf(giolamthem));
            txtGhiChu.setText(ghichu);
            txtThuong.setText(String.valueOf(thuong));
            txtTong.setText(String.valueOf(luong));
            txtMaNV.setText(manv);
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(BangLuongNVCT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_dgdanhsachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
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
        txtMaNV.requestFocus();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(txtMaNV.getText().length()<=0)
        return ;
        ktThem=false;
        KhoaMo(false);

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        manv=txtMaNV.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Thông báo", JOptionPane.YES_NO_OPTION);

        if (kq == JOptionPane.YES_OPTION) {
            NVCT_controller.Xoa(manv);
            XoaTrang();
            LayNguon();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTinhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTienActionPerformed
        LCB = Integer.parseInt(txtLCB.getText());
        ngaycong = Integer.parseInt(txtNgayCong.getText());
        giolamthem = Integer.parseInt(txtGioLamThem.getText());
        PC =Integer.parseInt(txtPhuCap.getText());
        thuong = Integer.parseInt(txtThuong.getText());
        //      kyluat = String.valueOf(Integer.parseInt(txtKyLuat.getText()));
        kyluat = Integer.parseInt(txtKyLuat.getText());
        //      luong =  Integer.parseInt(txtTong.getText());
        if(ngaycong > 26)
        {
            JOptionPane.showInputDialog(this, "khong vuot qua 26!");
        }else
        {
            float luong = (LCB / 26) * ngaycong + (giolamthem * 40000) + PC + thuong - kyluat;
            String s = Float.toString(luong);
        }
    }//GEN-LAST:event_btnTinhTienActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        if(txtMaLuong.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập mã lương ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtMaLuong.requestFocus();
            return;
        }
        if(txtHoTen.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập họ tên ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtHoTen.requestFocus();
            return;}
        if(txtLCB.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập lương cơ bản ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtLCB.requestFocus();
            return;}
        if(txtPhuCap.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập phục cấp ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtPhuCap.requestFocus();
            return;}

        if(txtKyLuat.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập kỷ luật ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtKyLuat.requestFocus();
            return;}
        if(txtGioLamThem.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập giờ ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtGioLamThem.requestFocus();
            return;}

        if(txtNgayNghi.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập ngày nghỉ ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtNgayNghi.requestFocus();
            return;}

        if(txtNgayCong.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập ngày công ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtNgayCong.requestFocus();
            return;}
      
        if(txtMaNV.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập mã nhân viên ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtMaNV.requestFocus();
            return;}
        if(txtThuong.getText().length()<=0){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập thưởng ","Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtThuong.requestFocus();
            return;}
        //    SimpleDateFormat df = new SimpleDateFormat ("dd-MM-yyyy");

        maluong =txtMaLuong.getText();
        hoten  = txtHoTen.getText();
        LCB = Integer.parseInt(txtLCB.getText());
        PC = Integer.parseInt(txtPhuCap.getText());

        kyluat = Integer.parseInt(txtKyLuat.getText());
        ngaynghi = Integer.parseInt(txtNgayNghi.getText());
        ngaynhan = (txtDate.getDate());
        ngaycong = Integer.parseInt(txtNgayCong.getText());
        giolamthem = Integer.parseInt(txtGioLamThem.getText());
        ghichu = txtGhiChu.getText();
        manv = txtMaNV.getText();
        thuong = Integer.parseInt(txtThuong.getText());
        luong = Integer.parseInt(txtTong.getText());
        tblNVCT nvct = new tblNVCT(manv, tenphong, hoten, maluong, LCB, PC,thuong, kyluat,
            ngaynhan,ngaycong, ngaynghi, giolamthem,luong,ghichu);

        LayNguon();
        KhoaMo(true);

    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int kq = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            dispose();}
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        KhoaMo(true);
        XoaTrang();
    }//GEN-LAST:event_btnKhongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTinhTien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbTenPhong;
    private javax.swing.JTable dgdanhsach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtGioLamThem;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtKyLuat;
    private javax.swing.JTextField txtLCB;
    private javax.swing.JTextField txtMaLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayCong;
    private javax.swing.JTextField txtNgayNghi;
    private javax.swing.JTextField txtPhuCap;
    private javax.swing.JTextField txtThuong;
    private javax.swing.JTextField txtTong;
    // End of variables declaration//GEN-END:variables
}
