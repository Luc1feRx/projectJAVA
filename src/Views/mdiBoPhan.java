
package View;

import Controller.BoPhan_Controller;
import Model.tbBoPhan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class mdiBoPhan extends javax.swing.JInternalFrame {

    DefaultTableModel tblDanhsach;
    List<tbBoPhan> arr = new ArrayList<>();
    String mabophan, tenbophan,ghichu;
    Date ngaythanhlap;
    private boolean ktThem;
    String macu;
    SimpleDateFormat sDF = new SimpleDateFormat("yyyy-MM-dd");
    Date date;
    
    public mdiBoPhan() {
        initComponents();
        tblDanhsach= (DefaultTableModel)dgDanhsach.getModel();
        KhoaMo(true);
        LayNguon();
    }
    public void XoaTrang(){
        txtMabophan.setText("");
        txtTenbophan.setText("");
        txtGhichu.setText("");
    }
    public void KhoaMo(boolean b){
        btThem.setEnabled(b);
        btSua.setEnabled(b);
        btXoa.setEnabled(b);
        btKetthuc.setEnabled(b);
        
        btKhong.setEnabled(!b);
        btGhi.setEnabled(!b);
        
        txtMabophan.setEditable(!b);
        txtTenbophan.setEditable(!b);
        txtGhichu.setEditable(!b);
        
        dgDanhsach.setEnabled(b);
        
    }
    public void LayNguon(){
        arr= BoPhan_Controller.LayNguon();
        
        tblDanhsach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p->{
            tblDanhsach.addRow(new Object[]{
                p.getMabophan(),p.getTenbophan(),p.getNgaythanhlap(),p.getGhichu()
            });
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btGhi = new javax.swing.JButton();
        btKhong = new javax.swing.JButton();
        btKetthuc = new javax.swing.JButton();
        txtGhichu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateNgaythanhlap = new com.toedter.calendar.JDateChooser();
        txtTenbophan = new javax.swing.JTextField();
        txtMabophan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgDanhsach = new javax.swing.JTable();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("DANH MỤC BỘ PHẬN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel1.setText("Mã bộ phận:");

        jLabel2.setText("Ngày thành lập:");

        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_20px.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_update_20px.png"))); // NOI18N
        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_delete_20px.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btGhi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_save_20px.png"))); // NOI18N
        btGhi.setText("Ghi");
        btGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGhiActionPerformed(evt);
            }
        });

        btKhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_no_entry_20px.png"))); // NOI18N
        btKhong.setText("Không");
        btKhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKhongActionPerformed(evt);
            }
        });

        btKetthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_close_sign_20px.png"))); // NOI18N
        btKetthuc.setText("Kết thúc");
        btKetthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKetthucActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên bộ phận:");

        jLabel5.setText("Ghi chú:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMabophan, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dateNgaythanhlap, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btThem)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btSua)
                                                .addGap(18, 18, 18)
                                                .addComponent(btXoa)
                                                .addGap(18, 18, 18)
                                                .addComponent(btGhi))
                                            .addComponent(jLabel5))
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btKhong)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btKetthuc))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(txtGhichu))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(196, 196, 196)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTenbophan))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(280, 280, 280)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenbophan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMabophan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateNgaythanhlap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGhichu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btGhi)
                    .addComponent(btKhong)
                    .addComponent(btKetthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dgDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã bộ phận", "Tên bộ phận", "Ngày thành lập ", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        XoaTrang();
        KhoaMo(false);
        ktThem= true;
        txtMabophan.requestFocus();
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if("".equals(txtMabophan.getText())){
            return;
        }
        macu=txtMabophan.getText();
        ktThem= false;
        KhoaMo(false);
        txtMabophan.requestFocus();
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if("".equals(txtMabophan.getText()))
                 return;
            int kq= JOptionPane.showConfirmDialog(this,"Bạn có muốn xoá mã bộ phận ["+txtMabophan.getText()+"]","Thông Báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
            if (kq==JOptionPane.YES_NO_OPTION){
            macu=txtMabophan.getText();
            BoPhan_Controller.XoaBo(macu);
            XoaTrang();
            LayNguon();
            }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGhiActionPerformed
        //kiem tra du lieu dung
        if("".equals(txtMabophan.getText())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã bộ phận", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtMabophan.requestFocus();
            return;
        }
        if("".equals(txtTenbophan.getText())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên bộ phận", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtTenbophan.requestFocus();
            return;
        }
        if("".equals(dateNgaythanhlap.getDate())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngày thành lập", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            dateNgaythanhlap.requestFocus();
            return;
        }
//        
        
         //kiem tra trung ma
        if (BoPhan_Controller.KiemTraTrungMa(txtMabophan.getText(), ktThem, macu)==true ){
            JOptionPane.showMessageDialog(this, "Bạn nhập trùng tên mã bộ phận đã có!","Thông báo",JOptionPane.WARNING_MESSAGE);
            txtMabophan.requestFocus();
        return;
        }
        
        //thuc hien ghi
        mabophan=txtMabophan.getText();
        tenbophan=txtTenbophan.getText();
        ngaythanhlap= dateNgaythanhlap.getDate();
        ghichu=txtGhichu.getText();
        tbBoPhan bp = new tbBoPhan(mabophan, tenbophan,  ngaythanhlap,ghichu);
        
        if(ktThem==true)
           BoPhan_Controller.ThemBoPhan(bp);
        else
           BoPhan_Controller.CapNhat(bp, macu);
        
        //lay nguon du lieu moi
        LayNguon();
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
        int index = dgDanhsach.getSelectedRow();
        TableModel model = dgDanhsach.getModel();
        mabophan=model.getValueAt(index, 0).toString();
        tenbophan=model.getValueAt(index, 1).toString();
        try {
            ngaythanhlap=sDF.parse(model.getValueAt(index, 2).toString());
        } catch (ParseException ex) {
            Logger.getLogger(mdiBoPhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ghichu=model.getValueAt(index, 3).toString();
        } catch (Exception ex) {
            
        }
        
        txtMabophan.setText(mabophan);
        txtTenbophan.setText(tenbophan);
        dateNgaythanhlap.setDate(ngaythanhlap);
        txtGhichu.setText(ghichu);
        
    }//GEN-LAST:event_dgDanhsachMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGhi;
    private javax.swing.JButton btKetthuc;
    private javax.swing.JButton btKhong;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private com.toedter.calendar.JDateChooser dateNgaythanhlap;
    private javax.swing.JTable dgDanhsach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtGhichu;
    private javax.swing.JTextField txtMabophan;
    private javax.swing.JTextField txtTenbophan;
    // End of variables declaration//GEN-END:variables
}
