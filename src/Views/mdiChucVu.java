
package View;

import Controller.ChucVu_Controller;
import Model.tbChucVu;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class mdiChucVu extends javax.swing.JInternalFrame {

    DefaultTableModel tblDanhsach;
    List<tbChucVu> arr = new ArrayList<>();
    String machucvu, chucvu;
    private boolean ktThem;
    String macu;
   
    public mdiChucVu() {
        initComponents();
        tblDanhsach= (DefaultTableModel)dgDanhsach.getModel();
        KhoaMo(true);
        LayNguon();
    }
    public void XoaTrang(){
        txtChucvu.setText("");
    }
    public void KhoaMo(boolean b){
        btThem.setEnabled(b);
        btSua.setEnabled(b);
        btXoa.setEnabled(b);
        btKetthuc.setEnabled(b);
        
        btKhong.setEnabled(!b);
        btGhi.setEnabled(!b);
        
        txtMachucvu.setEditable(!b);
        txtChucvu.setEditable(!b);
        
        
        dgDanhsach.setEnabled(b);
        
    }
    public void LayNguon(){
        arr= ChucVu_Controller.LayNguon();
        
        tblDanhsach.setRowCount(0);//Xoa trang danh sach
        arr.forEach(p->{
            tblDanhsach.addRow(new Object[]{
                p.getMachucvu(),p.getChucvu()
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
        txtChucvu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMachucvu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        dgDanhsach = new javax.swing.JTable();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("DANH MỤC CHỨC VỤ");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin chi tiết"));

        jLabel1.setText("Mã chức vụ:");

        jLabel2.setText("Chức vụ:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btThem)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btGhi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btKhong)
                        .addGap(18, 18, 18)
                        .addComponent(btKetthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtChucvu, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtMachucvu))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMachucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtChucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
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
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã chức vụ", "Chức vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(156, 156, 156))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dgDanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgDanhsachMouseClicked
        int index= dgDanhsach.getSelectedRow();
        TableModel model= dgDanhsach.getModel();
        machucvu= model.getValueAt(index, 0).toString();
        chucvu= model.getValueAt(index, 1).toString();
        

        txtChucvu.setText(chucvu);
        txtMachucvu.setText(machucvu);
    }//GEN-LAST:event_dgDanhsachMouseClicked

 
    private void btKetthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKetthucActionPerformed
        dispose();
    }//GEN-LAST:event_btKetthucActionPerformed

    private void btKhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKhongActionPerformed
        
    }//GEN-LAST:event_btKhongActionPerformed

    private void btGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGhiActionPerformed
        if("".equals(txtChucvu.getText())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập chức vụ", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtChucvu.requestFocus();
            return;
        }
        if("".equals(txtMachucvu.getText())){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã chức vụ", "Thông Báo",JOptionPane.WARNING_MESSAGE);
            txtMachucvu.requestFocus();
            return;
        }
        //kiem tra trung ma
        if (ChucVu_Controller.KiemTraTrungMa(txtMachucvu.getText(), ktThem, macu)==true ){
            JOptionPane.showMessageDialog(this, "Bạn nhập trùng tên mã chức vụ đã có!","Thông báo",JOptionPane.WARNING_MESSAGE);
        txtMachucvu.requestFocus();
        return;
        }
        
        //thuc hien ghi
        machucvu= txtMachucvu.getText();
        chucvu = txtChucvu.getText();
        tbChucVu cv = new tbChucVu(machucvu, chucvu);
        
        if(ktThem==true)
           ChucVu_Controller.ThemChucVu(cv);
        else
           ChucVu_Controller.CapNhat(cv, macu);
        
        //lay nguon du lieu moi
        LayNguon();
        KhoaMo(true);
    }//GEN-LAST:event_btGhiActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        if("".equals(txtMachucvu.getText()))
                 return;
            int kq= JOptionPane.showConfirmDialog(this,"Bạn có muốn xoá chức vụ ["+txtMachucvu.getText()+"]","Thông Báo",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE );
            if (kq==JOptionPane.YES_NO_OPTION){
            macu=txtMachucvu.getText();
            ChucVu_Controller.XoaBo(macu);
            XoaTrang();
            LayNguon();
            }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if("".equals(txtMachucvu.getText())){
            return;
        }
        macu=txtMachucvu.getText();
        ktThem= false;
        KhoaMo(false);
        txtMachucvu.requestFocus();
    }//GEN-LAST:event_btSuaActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        XoaTrang();
        KhoaMo(false);
        ktThem= true;
        txtMachucvu.requestFocus();
    }//GEN-LAST:event_btThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGhi;
    private javax.swing.JButton btKetthuc;
    private javax.swing.JButton btKhong;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JTable dgDanhsach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtChucvu;
    private javax.swing.JTextField txtMachucvu;
    // End of variables declaration//GEN-END:variables
}
