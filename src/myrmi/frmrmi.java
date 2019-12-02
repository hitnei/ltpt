/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrmi;

import java.rmi.Naming;

/**
 *
 * @author NHI
 */
public class frmrmi extends javax.swing.JFrame {

    public class TuyenDoanCong extends Thread{
        public void run(){
//            while (true){
                try{
                    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://172.16.0.177/TinhToan");
                    txtcong.setText(String.valueOf(tt.cong(Integer.parseInt(txta.getText()), Integer.parseInt(txtb.getText()))));
                }catch(Exception tt) {System.out.print(tt);}
//            }
        }
    };
    
    public class TuyenDoanNhan extends Thread{
        public void run(){
//            while (true){
                try{
                    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://172.16.2.37/TinhToan");
                    txtnhan.setText(String.valueOf(tt.nhan(Integer.parseInt(txta.getText()), Integer.parseInt(txtb.getText()))));
                }catch(Exception tt) {System.out.print(tt);}
//            }
        }
    };
    
    public class TuyenDoanTru extends Thread{
        public void run(){
//            while (true){
                try{
                    ITinhToan tt= (ITinhToan)Naming.lookup("rmi://172.16.2.37/TinhToan");
                    txttru.setText(String.valueOf(tt.tru(Integer.parseInt(txta.getText()), Integer.parseInt(txtb.getText()))));
                }catch(Exception tt) {System.out.print(tt);}
//            }
        }
    };
    /**
     * Creates new form frmrmi
     */
    public frmrmi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnhan = new javax.swing.JTextField();
        btntinh = new javax.swing.JButton();
        txttru = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btntru = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("a:");

        jLabel2.setText("b:");

        jLabel3.setText("Cong:");

        jLabel4.setText("Nhan:");

        txtnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnhanActionPerformed(evt);
            }
        });

        btntinh.setText("Tinh");
        btntinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntinhActionPerformed(evt);
            }
        });

        txttru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttruActionPerformed(evt);
            }
        });

        jLabel5.setText("Tru:");

        btntru.setText("Tru");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btntinh)
                        .addGap(41, 41, 41)
                        .addComponent(btntru))
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcong, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttru, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtcong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntinh)
                    .addComponent(btntru))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntinhActionPerformed
        // TODO add your handling code here:
        TuyenDoanCong ttc = new TuyenDoanCong();
        ttc.run();
        
        TuyenDoanNhan ttn = new TuyenDoanNhan();
        ttn.run();
        
    }//GEN-LAST:event_btntinhActionPerformed

    private void txtnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnhanActionPerformed

    private void txttruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttruActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        // TODO add your handling code here:
        TuyenDoanTru ttt = new TuyenDoanTru();
        ttt.run();
    }//GEN-LAST:event_btntruActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmrmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmrmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmrmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmrmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmrmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntinh;
    private javax.swing.JButton btntru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtcong;
    private javax.swing.JTextField txtnhan;
    private javax.swing.JTextField txttru;
    // End of variables declaration//GEN-END:variables
}