/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        eStore = new javax.swing.JMenu();
        managerWindow = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        customerWindow = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Window");

        jPanel1.setBackground(new java.awt.Color(9, 100, 177));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        eStore.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        eStore.setText("eStore");
        eStore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eStore.setFont(new java.awt.Font("Segoe UI", 1, 23)); // NOI18N
        eStore.setMargin(new java.awt.Insets(15, 10, 15, 10));

        managerWindow.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        managerWindow.setText("Manager Window");
        managerWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managerWindow.setMargin(new java.awt.Insets(15, 15, 15, 15));
        managerWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerWindowActionPerformed(evt);
            }
        });
        eStore.add(managerWindow);
        eStore.add(jSeparator1);

        customerWindow.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        customerWindow.setText("Customer Window");
        customerWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customerWindow.setMargin(new java.awt.Insets(15, 15, 15, 15));
        customerWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerWindowActionPerformed(evt);
            }
        });
        eStore.add(customerWindow);
        eStore.add(jSeparator2);

        exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setMargin(new java.awt.Insets(15, 15, 15, 15));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        eStore.add(exit);

        jMenuBar1.add(eStore);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managerWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerWindowActionPerformed
        // TODO add your handling code here:
        // ToShow The Manager Window
        ManagerWindow managerwindow = new ManagerWindow();
        managerwindow.setVisible(true);
        
    }//GEN-LAST:event_managerWindowActionPerformed

    private void customerWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerWindowActionPerformed
        // TODO add your handling code here:
        // This To Show The Customar Window
       CustomarWindow customarWindow = new CustomarWindow();
       customarWindow.setVisible(true);
    }//GEN-LAST:event_customerWindowActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem customerWindow;
    private javax.swing.JMenu eStore;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem managerWindow;
    // End of variables declaration//GEN-END:variables
}
