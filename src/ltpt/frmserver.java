/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltpt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoang
 */
public class frmserver extends javax.swing.JFrame {
    guinhan gn = new guinhan();
    
    public class writeTxt extends Thread{
        public void run() {
            while (true){
            System.out.println("asd");
                
            }
//            BufferedReader br = null;
//                try {
//                    br = new BufferedReader(new FileReader("C:\\Users\\hoang\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\text.txt"));       
//
//                    String textInALine;
//
//                    while ((textInALine = br.readLine()) != null) {
//                        gn.Gui("127.0.0.2", textInALine, 1261);
//                        textInALine = br.readLine();
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (Exception ex) {
//                Logger.getLogger(frmserver.class.getName()).log(Level.SEVERE, null, ex);
//            } finally {
//                    try {
//                        br.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
        }
    }
    
    public class Tuyen extends Thread{
        public void run(){
            try {
                while(true){
                    String st = gn.Nhan(); //192.168.0.115:/ht
//                    System.out.println(st);
                    String[] t = st.split("[:]");
                    String[] temp = t[1].split("[(]");
                    System.out.println(t[0]);
                    System.out.println(t[1]);
                    String ip = t[0];
//                    System.out.println(ip);
                    if(t[1].equals("/ht")){
                        gn.Gui(ip, "nhi", 1261);
                    } else
                    if(t[1].equals("/tm")){
                        gn.Gui(ip, "LTPT", 1261);
                    } else
                    if(temp[0].equals("/ck")){
                        String[] st1 = temp[1].split("[)]");
                        String[] st2 = st1[0].split("[,]");
                        int k = Integer.parseInt(st2[0]);
                        int n = Integer.parseInt(st2[1]);
                        long result1 = 1;
                        long result2 = 1;
                        for (int i=n-k+1; i<=n; i++) {
                            result1 *= i;
                        }
                        for (int i=2; i<=k; i++) {
                            result2 *= i;
                        }
                        long result = result1/result2;
                        //System.out.println(k + " " + n + " " + result);
                        gn.Gui(ip, result+"", 1261);
                    } else {
                        String[] cal = t[1].split("[;]");
//                        System.out.println(cal[0]);
//                        System.out.println(cal[1]);
//                        System.out.println(cal[2]);
//                        System.out.println(cal[3]);
                        double rlt = 0;
                        if (cal[0].equals("/+")){
                            for (int i=1; i<cal.length; i++){
                                rlt += Integer.parseInt(cal[i]);
                            }
                            gn.Gui(ip, rlt+"", 1261);
                        } else
                        if (cal[0].equals("/-")){
                            for (int i=1; i<cal.length; i++){
                                rlt -= Integer.parseInt(cal[i]);
                            }
                            rlt = rlt + 2*Integer.parseInt(cal[1]);
                            gn.Gui(ip, rlt+"", 1261);
                        } else 
                        if (cal[0].equals("/*")){
                            rlt = 1;
                            for (int i=1; i<cal.length; i++){
                                rlt *= Integer.parseInt(cal[i]);
                            }
                            gn.Gui(ip, rlt+"", 1261);
                        }
                        else 
                        if (cal[0].equals("//")) {
                            rlt = Integer.parseInt(cal[1]);
                            boolean isZero = false;
                            for (int i=2; i<cal.length; i++){
                                if(cal[i].equals("0")){
                                    isZero = true;
                                    break;
                                }
                                rlt /= Integer.parseInt(cal[i]);
                            }
                            System.out.println(isZero);
                            if (!isZero){
                                gn.Gui(ip, rlt+"", 1261);
                            } else{
                                gn.Gui(ip, "null", 1261);
                            }
                        } else {
                            if(t[1].equals("/kq")){
                                
                                
//                                writeTxt wt = new writeTxt();
//                                wt.start();
                                
//                                BufferedReader br = null;
//
//                                try {   
//                                    br = new BufferedReader(new FileReader("C:\\Users\\hoang\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\text.txt"));       
//
//                                    String textInALine;
//
//                                    while ((textInALine = br.readLine()) != null) {
////                                        gn.Gui(ip, textInALine, 1261);
//                                        textInALine = br.readLine();
//                                        writeTxt wt = new writeTxt();
////                                        wt.run(textInALine);
//                                        wt.start();
//                                    }
//                                } catch (IOException e) {
//                                    e.printStackTrace();
//                                } finally {
//                                    try {
//                                        br.close();
//                                    } catch (IOException e) {
//                                        e.printStackTrace();
//                                    }
//                                }
                            }
                        }
                        
                    }
                        
                    list1.add(st);
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Creates new form frmserver
     */
    public frmserver() {
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

        jButton1 = new javax.swing.JButton();
        txtsend = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        list1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("gui");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsendActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Server");

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtsend, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtsend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void txtsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsendActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String dc;
            dc = InetAddress.getLocalHost().getHostAddress();
            String mess = dc + ":" + txtsend.getText();
            gn.Gui("127.0.0.2", mess, 1261);
//            list1.add(mess);
//            txtsend.setText("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            int cong = 1260;
            gn.MoCong(cong);
            System.out.println("da mo cong " + cong);
            Tuyen td = new Tuyen();
            td.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmserver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmserver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private java.awt.List list1;
    private javax.swing.JTextField txtsend;
    // End of variables declaration//GEN-END:variables
}
