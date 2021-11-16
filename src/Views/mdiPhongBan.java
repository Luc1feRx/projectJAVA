
package View;

import Controller.BoPhan_Controller;
import Controller.PhongBan_Controller;
import Model.tbBoPhan;
import Model.tbPhongBan;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.lang.String;

public final class mdiPhongBan extends javax.swing.JInternalFrame {

    
    public mdiPhongBan() {
        initComponents();
        tblDanhsach= (DefaultTableModel) dgDanhsach.getModel();
        Laynguon();
        LayNguonCBO();
        KhoaMo(true);
        
    }
        DefaultTableModel tblDanhsach;
        List<tbPhongBan> arr = new ArrayList<>();
        List<tbBoPhan> arrB = new ArrayList<>();
        String mabophan,maphong,tenphong ,ghichu;
        Date ngaythanhlap;
        private boolean ktThem;
        String macu;
        SimpleDateFormat sDF = new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        SimpleDateFormat sD =new SimpleDateFormat("yyyy-MM-dd");

        public void XoaTrang(){
            txtMaphong.setText("");
            txtTenphong.setText("");
            txtGhichu.setText("");
            cbMabophan.setSelectedItem("");
            dateNgaythanhlap.setDate(null);
            
        }

        public void KhoaMo(boolean b){
            txtMaphong.setEditable(!b);
            txtTenphong.setEditable(!b);
            txtGhichu.setEditable(!b);

            cbMabophan.setEnabled(!b);

            dgDanhsach.setEnabled(b);

            btThem.setEnabled(b);
            btSua.setEnabled(b);
            btXoa.setEnabled(b);
            btKetthuc.setEnabled(b);

            btKhong.setEnabled(!b);
            btGhi.setEnabled(!b);

        }
        public void Laynguon(){
            arr= PhongBan_Controller.LayNguon();
            tblDanhsach.setRowCount(0);
            arr.forEach(p->{
                tblDanhsach.addRow(new Object[]{
                    p.getMabophan(),p.getMaphong(),p.getTenphong(),
                    p.getNgaythanhlap(),p.getGhichu()
                });
            });
        }
        public void LayNguonCBO(){
        arrB = BoPhan_Controller.LayNguon();
        for (int i=0;i<arrB.size();i++)
            cbMabophan.addItem(arrB.get(i).getMabophan());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btGhi = new javax.swing.JButton();
        btKhong = new javax.swing.JButton();
        btKetthuc = new javax.swing.JButton();
        cbMabophan = new javax.swing.JComboBox<>();
        txtMaphong = new javax.swing.JTextField();
        txtGhichu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenphong = new javax.swing.JTextField();
        dateNgaythanhlap = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgDanhsach = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel1.setText("Mã bộ phận:");

        jLabel2.setText("Mã phòng:");

        jLabel3.setText("Ghi chú:");

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btGhi.setText("Ghi");
        btGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGhiActionPerformed(evt);
            }
        });

        btKhong.setText("Không");
        btKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKhongActionPerformed(evt);
            }
        });

        btKetthuc.setText("Kết thúc");
        btKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKetthucActionPerformed(evt);
            }
        });

        cbMabophan.setName(""); // NOI18N
        cbMabophan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMabophanActionPerformed(evt);
            }
        });

        txtGhichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGhichuActionPerformed(evt);
            }
        });

        jLabel5.setText("Tên Phòng:");

        jLabel7.setText("Ngày Thành lập:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbMabophan, 0, 130, Short.MAX_VALUE)
                            .addComponent(txtMaphong))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateNgaythanhlap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenphong))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGhichu)
                                .addGap(50, 50, 50))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btThem)
                                .addGap(28, 28, 28)
                                .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btGhi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btKhong, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btKetthuc, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMabophan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTenphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(dateNgaythanhlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btGhi)
                    .addComponent(btKhong)
                    .addComponent(btKetthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        dgDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã bộ phận", "Mã phòng", "Tên phòng", "Ngày thành lập", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dgDanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgDanhsachMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(dgDanhsach);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("DANH MỤC PHÒNG BAN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(199, 199, 199))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        XoaTrang();
        KhoaMo(false);
        ktThem= true;
        txtMaphong.requestFocus();
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if("".equals(txtMaphong.getText()))
        return;
        macu= txtMaphong.getText();
        ktThem=false;
        KhoaMo(false);
        txtMaphong.requestFocus();
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if("".equals(txtMaphong.getText()))
        return;
        int kq= JOptionPane.showConfirmDialog(this,"Bạn có muốn xoá phòng ban["+txtMaphong.getText()+"]","Thông Báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
        if (kq==JOptionPane.YES_NO_OPTION){
            macu=txtMaphong.getText();
            PhongBan_Controller.XoaBo(macu);
            XoaTrang();
            Laynguon();
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGhiActionPerformed
        //kiem tra du lieu dung
        if("".equals(txtMaphong.getText())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã phòng", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtMaphong.requestFocus();
            return;
        }
        if("".equals(txtTenphong.getText())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên phòng", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtTenphong.requestFocus();
            return;
        }
        if("".equals(dateNgaythanhlap.getDate())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày thành lập", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtGhichu.requestFocus();
            return;
        }
        //kiem tra tinh hop le cua du lieu
        //kiem tra trung ma
        
        if(PhongBan_Controller.KiemTraTrungMa( txtMaphong.getText(),ktThem, macu)){
           JOptionPane.showMessageDialog(this, "Mã phòng đã tồn tại trong cơ sở dữ liệu", "Thông báo!", JOptionPane.ERROR_MESSAGE);
           txtMaphong.requestFocus();
           return;
        }
        //thuc hien ghi
        maphong= txtMaphong.getText();
        tenphong= txtTenphong.getText();
        ngaythanhlap= dateNgaythanhlap.getDate();
        ghichu= txtGhichu.getText();
        mabophan= cbMabophan.getSelectedItem().toString();
        tbPhongBan pb= new tbPhongBan( mabophan, maphong, tenphong, ngaythanhlap, ghichu );
        if (ktThem==true)
        PhongBan_Controller.ThemPhongBan(pb);
        else
        PhongBan_Controller.CapNhat(pb , macu);
        //lay nguon du lieu moi
        XoaTrang();
        Laynguon();
        KhoaMo(true);
    }//GEN-LAST:event_btGhiActionPerformed

    private void btKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKhongActionPerformed
        XoaTrang();
        KhoaMo(true);
    }//GEN-LAST:event_btKhongActionPerformed

    private void btKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKetthucActionPerformed
        dispose();
    }//GEN-LAST:event_btKetthucActionPerformed

    private void dgDanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhsachMouseClicked
        int index= dgDanhsach.getSelectedRow();
        TableModel model= dgDanhsach.getModel();
        mabophan= model.getValueAt(index, 0).toString();
        maphong= model.getValueAt(index, 1).toString();
        tenphong= model.getValueAt(index, 2).toString();
        try {
            ngaythanhlap= sD.parse(model.getValueAt(index, 3).toString());
        } catch (ParseException ex) {
            
        }
        
        try {
            ghichu= model.getValueAt(index, 4).toString();
        } catch (Exception ex) {
            
        }
        

        txtMaphong.setText(maphong);
        txtTenphong.setText(tenphong);
        txtGhichu.setText(ghichu);
        cbMabophan.setSelectedIndex(vtBophan(mabophan));
        dateNgaythanhlap.setDate(ngaythanhlap);
        
    }//GEN-LAST:event_dgDanhsachMouseClicked

    public int vtBophan(String bophan){
        for(int i=0;i<arrB.size();i++)
            if(arrB.get(i).getTenbophan().equals(bophan))
                return i;
        return 0;
    }
    
    private void txtGhichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGhichuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGhichuActionPerformed

    private void cbMabophanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMabophanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMabophanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGhi;
    private javax.swing.JButton btKetthuc;
    private javax.swing.JButton btKhong;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbMabophan;
    private com.toedter.calendar.JDateChooser dateNgaythanhlap;
    private javax.swing.JTable dgDanhsach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtMaphong;
    private javax.swing.JTextField txtTenphong;
    // End of variables declaration//GEN-END:variables

    
   
}
