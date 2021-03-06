
package assignment;

public class Educator_Page extends javax.swing.JFrame {

    /**
     * Creates new form Educator_Page
     */
    public Educator_Page() {
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

        D_Welcome = new javax.swing.JLabel();
        D_EduFunction1Btn = new javax.swing.JButton();
        D_EduFunction2Btn = new javax.swing.JButton();
        A_Backbtn = new javax.swing.JButton();
        D_EduFunction3Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        D_Welcome.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        D_Welcome.setText("Welcome");

        D_EduFunction1Btn.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        D_EduFunction1Btn.setText("Mark Entry");
        D_EduFunction1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_EduFunction1BtnActionPerformed(evt);
            }
        });

        D_EduFunction2Btn.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        D_EduFunction2Btn.setText("Module Report");
        D_EduFunction2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_EduFunction2BtnActionPerformed(evt);
            }
        });

        A_Backbtn.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        A_Backbtn.setText("Back");
        A_Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_BackbtnActionPerformed(evt);
            }
        });

        D_EduFunction3Btn.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        D_EduFunction3Btn.setText("Student Report");
        D_EduFunction3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_EduFunction3BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(D_Welcome))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D_EduFunction2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D_EduFunction1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D_EduFunction3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(A_Backbtn)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(D_Welcome)
                .addGap(18, 18, 18)
                .addComponent(D_EduFunction1Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D_EduFunction2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D_EduFunction3Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(A_Backbtn)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D_EduFunction1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_EduFunction1BtnActionPerformed
        Mark_Entry me= new Mark_Entry();
        me.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_D_EduFunction1BtnActionPerformed

    private void D_EduFunction2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_EduFunction2BtnActionPerformed
        ModuleReport pr= new ModuleReport();
        pr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_D_EduFunction2BtnActionPerformed

    private void A_BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_BackbtnActionPerformed
        LogIn_Educator le = new LogIn_Educator();
        le.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_A_BackbtnActionPerformed

    private void D_EduFunction3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_EduFunction3BtnActionPerformed
        StudentReport sr = new StudentReport();
        sr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_D_EduFunction3BtnActionPerformed

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
            java.util.logging.Logger.getLogger(Educator_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Educator_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Educator_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Educator_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Educator_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_Backbtn;
    private javax.swing.JButton D_EduFunction1Btn;
    private javax.swing.JButton D_EduFunction2Btn;
    private javax.swing.JButton D_EduFunction3Btn;
    private javax.swing.JLabel D_Welcome;
    // End of variables declaration//GEN-END:variables
}
