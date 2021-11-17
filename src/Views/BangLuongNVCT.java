/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controller.Connects;
import Controller.NVCT_controller;
import static Controller.NVTV_controller.conn;
import static QLNS.QLNS.dbUrl;
import static Views.BangLuongNVTV.pstate;
import static Views.BangLuongNVTV.sql;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
/**
 *
 * @author taihd
 */
public final class BangLuongNVCT extends javax.swing.JInternalFrame {
       Connects cn = new Connects();
        boolean ktThem;
        public static PreparedStatement pstate;
        public static String sql;
        String macu;
       NVCT_controller NVCT = new NVCT_controller();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
        int currentDate= Calendar.getInstance().get(Calendar.DATE);
    public BangLuongNVCT() throws SQLException {
         initComponents();
            cn.loadcombobox(cbTenPhong, "select TenPhong from TblPhongBan", 1);
            NVCT.RefreshTable("select * from TblCongKhoiDieuHanh", tableLNV);
            cbTenPhong.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    try {
                         cbMaNV.removeAllItems();
                         cn.loadcombobox(cbMaNV, "select MaNV from TblCongKhoiDieuHanh where TenPhong=(select top(1) TenPhong from TblPhongBan a, TblTTNVCoBan b where a.MaPhong=b.MaPhong and a.TenPhong=N'" + cbTenPhong.getSelectedItem() +"' group by TenPhong)", 1);
                    } catch (SQLException ex) {
                        Logger.getLogger(BangLuongNVCT.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
            KhoaMo(false);
            cbTenPhong.setSelectedIndex(-1);
            txtKyLuat.setText("0");
            cbMaNV.addItemListener(new ItemListener() {
                        @Override
                        public void itemStateChanged(ItemEvent e) {
                            if(e.getStateChange() != e.SELECTED){
                                try {
                                    cn.loadtextbox(txtHoTen, "select HoTen from TblTTNVCoBan where MaNV='" + cbMaNV.getSelectedItem() + "'", 1);
                                    cn.loadtextbox(txtMaLuong, "select MaLuong from TblTTNVCoBan where MaNV='" + cbMaNV.getSelectedItem() + "'", 1);
                                    cn.loadtextbox(txtLCB, "select LCB from TblBangLuongCTy l where l.MaLuong='" + txtMaLuong.getText() + "'", 1);
                                } catch (SQLException ex) {
                                    Logger.getLogger(BangLuongNVCT.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    });
                       
    }
        
      public void XoaTrang(){
        cbTenPhong.setSelectedIndex(-1);
        cbMaNV.setSelectedIndex(-1);
        txtHoTen.setText("");
        txtMaLuong.setText("");
        txtPC.setText("");
        txtThuong.setText("");
        txtKyLuat.setText("0");
        txtLCB.setText("");
        txtNgayNghi.setText("0");
        txtNgayCong.setText("");
        txtGioLamThem.setText("");
        txtTong.setText("");
        txtGhiChu.setText("");
        
        
        calendar.set(currentYear , currentMonth , currentDate);
         date.setTime(calendar.getTimeInMillis());
         dateNhanLuong.setDate(date);
    }
     
    public void KhoaMo(boolean b){
        btnKhong.setEnabled(b);
        btnSua.setEnabled(!b);
        btnKetThuc.setEnabled(!b);
        btnGhi.setEnabled(b);
        btnTinhLuong.setEnabled(b);
        btnXoa.setEnabled(!b);
        txtHoTen.setEditable(b);
        txtGioLamThem.setEditable(b);
        txtMaLuong.setEditable(b);
        txtThuong.setEditable(b);
        txtPC.setEditable(b);
        txtKyLuat.setEditable(b);
        txtLCB.setEditable(b);
        txtGhiChu.setEditable(b);
        txtNgayCong.setEditable(b);
        txtNgayNghi.setEditable(b);
        dateNhanLuong.setEnabled(b);
        cbTenPhong.setEnabled(b);
        cbMaNV.setEnabled(b);
    }
        
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbTenPhong = new javax.swing.JComboBox<>();
        txtHoTen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKyLuat = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNgayNghi = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        dateNhanLuong = new com.toedter.calendar.JDateChooser();
        txtThuong = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtLCB = new javax.swing.JTextField();
        txtMaLuong = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPC = new javax.swing.JTextField();
        txtTong = new javax.swing.JTextField();
        txtNgayCong = new javax.swing.JTextField();
        txtGioLamThem = new javax.swing.JTextField();
        cbMaNV = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLNV = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnKhong = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnTinhLuong = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        setName("Bảng Lương Nhân Viên Chính Thức"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 14))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tên phòng");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mã NV");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Họ tên");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mã lương");

        cbTenPhong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbTenPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTenPhongItemStateChanged(evt);
            }
        });
        cbTenPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTenPhongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbTenPhongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbTenPhongMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbTenPhongMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbTenPhongMouseReleased(evt);
            }
        });
        cbTenPhong.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cbTenPhongInputMethodTextChanged(evt);
            }
        });
        cbTenPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenPhongActionPerformed(evt);
            }
        });
        cbTenPhong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbTenPhongKeyReleased(evt);
            }
        });
        cbTenPhong.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                cbTenPhongVetoableChange(evt);
            }
        });

        txtHoTen.setEditable(false);
        txtHoTen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Ngày nhận lương");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Kỉ luật");

        txtKyLuat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtKyLuat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKyLuatKeyTyped(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("LCB");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Số ngày nghỉ");

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Số ngày công");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Số giờ làm thêm");

        txtNgayNghi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("Ghi chú");
        jLabel17.setToolTipText("");

        dateNhanLuong.setToolTipText("");
        dateNhanLuong.setDateFormatString("yyyy-MM-dd");
        dateNhanLuong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtThuong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtGhiChu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Thưởng");

        txtLCB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtLCB.setEnabled(false);
        txtLCB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLCBKeyTyped(evt);
            }
        });

        txtMaLuong.setEditable(false);
        txtMaLuong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Phụ cấp");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Tổng");

        txtPC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtTong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTong.setEnabled(false);

        txtNgayCong.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtGioLamThem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel17)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(cbTenPhong, 0, 126, Short.MAX_VALUE)
                            .addComponent(txtMaLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(cbMaNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKyLuat, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLCB, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayCong, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateNhanLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtGhiChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                        .addComponent(txtTong, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(13, 13, 13)
                                .addComponent(cbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKyLuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNgayCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)))
                            .addComponent(txtNgayNghi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(txtGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateNhanLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtTong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableLNV.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tableLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên phòng", "Họ tên", "Mã lương", "LCB", "Phụ cấp", "Thưởng", "Kỉ luật", "Ngày nhận lương", "Số ngày nghỉ", "Số ngày công", "Sô giờ làm thêm", "Tổng", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLNVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableLNV);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Các chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        btnSua.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnGhi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnKhong.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnKhong.setText("Không");
        btnKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhongActionPerformed(evt);
            }
        });

        btnKetThuc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        btnTinhLuong.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTinhLuong.setText("Tính Lương");
        btnTinhLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnTinhLuong)
                .addGap(67, 67, 67)
                .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("BẢNG LƯƠNG NHÂN VIÊN CHÍNH THỨC");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTenPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTenPhongItemStateChanged

    }//GEN-LAST:event_cbTenPhongItemStateChanged

    private void cbTenPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenPhongMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTenPhongMouseClicked

    private void cbTenPhongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenPhongMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTenPhongMouseEntered

    private void cbTenPhongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenPhongMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTenPhongMouseExited

    private void cbTenPhongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenPhongMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTenPhongMousePressed

    private void cbTenPhongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTenPhongMouseReleased

    }//GEN-LAST:event_cbTenPhongMouseReleased

    private void cbTenPhongInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cbTenPhongInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTenPhongInputMethodTextChanged

    private void cbTenPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenPhongActionPerformed

    }//GEN-LAST:event_cbTenPhongActionPerformed

    private void cbTenPhongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbTenPhongKeyReleased

    }//GEN-LAST:event_cbTenPhongKeyReleased

    private void cbTenPhongVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_cbTenPhongVetoableChange
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTenPhongVetoableChange

    private void txtKyLuatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKyLuatKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtKyLuatKeyTyped

    private void tableLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLNVMouseClicked
         int i = tableLNV.getSelectedRow();
         cbMaNV.setSelectedItem(tableLNV.getValueAt(i, 0).toString());
        cbTenPhong.setSelectedItem(tableLNV.getValueAt(i, 1).toString());
        txtHoTen.setText(tableLNV.getValueAt(i, 2).toString());
        txtMaLuong.setText(tableLNV.getValueAt(i, 3).toString());
        txtLCB.setText(tableLNV.getValueAt(i, 4).toString());
        txtPC.setText(tableLNV.getValueAt(i, 5).toString());
        txtThuong.setText(tableLNV.getValueAt(i, 6).toString());
        txtKyLuat.setText(tableLNV.getValueAt(i, 7).toString());
        txtNgayNghi.setText(tableLNV.getValueAt(i, 9).toString());
        txtNgayCong.setText(tableLNV.getValueAt(i, 10).toString());
        txtGioLamThem.setText(tableLNV.getValueAt(i, 11).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(tableLNV.getValueAt(i, 8).toString());
            dateNhanLuong.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(frmTangLuong.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTong.setText(tableLNV.getValueAt(i, 12).toString());
        txtGhiChu.setText(tableLNV.getValueAt(i, 13).toString());
    }//GEN-LAST:event_tableLNVMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(cbMaNV.getSelectedIndex() > -1){
            macu=cbMaNV.getSelectedItem().toString();
        }
        ktThem=false;
        KhoaMo(true);
        
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
          if(cbMaNV.getSelectedIndex() == -1){
             JOptionPane.showMessageDialog(this, "Không Được Để Trống Mã Nhân Viên","Thông báo", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                int message = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?","Thông báo",JOptionPane.YES_NO_OPTION);
                if(message == JOptionPane.YES_OPTION){ 
                    conn=DriverManager.getConnection(dbUrl);
                    sql="Delete From TblCongKhoiDieuHanh Where MaNV=?";
                    pstate=conn.prepareStatement(sql);
                    pstate.setString(1, cbMaNV.getSelectedItem().toString());
                    pstate.execute();
                    pstate.close();; conn.close();
                    JOptionPane.showMessageDialog(this, "Xóa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    DefaultTableModel model = (DefaultTableModel) tableLNV.getModel();
                    model.setRowCount(0);
                    NVCT.RefreshTable("SELECT * FROM TblCongKhoiDieuHanh", tableLNV);
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
        if(ktThem == false){
            if(txtPC.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập Phụ Cấp ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                    return;
                }else if(txtThuong.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập số tiền thưởng ","Thông Báo",JOptionPane.WARNING_MESSAGE);
                }else if(txtNgayCong.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập số ngày công","Thông Báo",JOptionPane.WARNING_MESSAGE);
                }else if(txtGioLamThem.getText().length()<=0){
                    JOptionPane.showMessageDialog(this,"Bạn chưa nhập số giờ làm thêm","Thông Báo",JOptionPane.WARNING_MESSAGE);
                }else if(txtTong.getText().length()<=0){
                      JOptionPane.showMessageDialog(this,"Bạn chưa tính lương","Thông Báo",JOptionPane.WARNING_MESSAGE);
                }else{
                try {
                        conn=DriverManager.getConnection(dbUrl);
                        sql ="UPDATE TblCongKhoiDieuHanh SET TenPhong=?,HoTen=?,MaLuong=?,LCB=?,PCChucVu=?,"
                       + "Thuong=?,KyLuat=?,NgayNhanLuong=?,SoNgayCongThang=?, SoNgayNghi=?,SoGioLamThem=?,Luong=?,GhiChu=? "
                       + "Where MaNV=?";
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                        pstate = conn.prepareStatement(sql);
                        pstate.setString(1,  cbTenPhong.getSelectedItem().toString());
                        pstate.setString(2, txtHoTen.getText());
                        pstate.setString(3, txtMaLuong.getText());
                        pstate.setString(4, txtLCB.getText());
                        pstate.setString(5, txtPC.getText());
                        pstate.setString(6, txtThuong.getText());
                        pstate.setString(7, txtKyLuat.getText());
                        String d = sdf.format(dateNhanLuong.getDate());
                        pstate.setString(8, d);
                        pstate.setString(9,  txtNgayCong.getText());
                        pstate.setString(10, txtNgayNghi.getText());
                        pstate.setString(11, txtGioLamThem.getText());
                        pstate.setString(12, txtTong.getText());
                        pstate.setString(13, txtGhiChu.getText());
                        pstate.setString(14, cbMaNV.getSelectedItem().toString());
                        pstate.execute();
                        conn.close();
                        pstate.close();
                        JOptionPane.showMessageDialog(this, "Sửa thành công!!!","Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        DefaultTableModel model = (DefaultTableModel) tableLNV.getModel();
                        model.setRowCount(0);
                        NVCT.RefreshTable("SELECT * FROM TblCongKhoiDieuHanh", tableLNV);
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Sửa thất bại!!!","Thông báo", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(BangLuongNVCT.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhongActionPerformed
        KhoaMo(false);
    }//GEN-LAST:event_btnKhongActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
      
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void txtLCBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLCBKeyTyped
     
    }//GEN-LAST:event_txtLCBKeyTyped

    private void btnTinhLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhLuongActionPerformed
        // TODO add your handling code here:
        int lcb = Integer.parseInt(txtLCB.getText());
        int pc = Integer.parseInt(txtPC.getText());
        int nc = Integer.parseInt(txtNgayCong.getText());
        int lt = Integer.parseInt(txtGioLamThem.getText());
        int th = Integer.parseInt(txtThuong.getText());
        int kl = Integer.parseInt(txtKyLuat.getText());
        float luong = ((lcb / 26) * nc + (lt * 40000) + pc + th - kl);
        String TongLuong = String.valueOf(luong);
        txtTong.setText(TongLuong);
    }//GEN-LAST:event_btnTinhLuongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhong;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTinhLuong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbMaNV;
    private javax.swing.JComboBox<String> cbTenPhong;
    private com.toedter.calendar.JDateChooser dateNhanLuong;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableLNV;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtGioLamThem;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtKyLuat;
    private javax.swing.JTextField txtLCB;
    private javax.swing.JTextField txtMaLuong;
    private javax.swing.JTextField txtNgayCong;
    private javax.swing.JTextField txtNgayNghi;
    private javax.swing.JTextField txtPC;
    private javax.swing.JTextField txtThuong;
    private javax.swing.JTextField txtTong;
    // End of variables declaration//GEN-END:variables
}
