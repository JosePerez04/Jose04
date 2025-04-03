package Formularios;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class FrmDashboad extends javax.swing.JFrame {

    
    public FrmDashboad() {
        initComponents();
        this.setLocationRelativeTo(null);
        aplicarEstilos();
    }
    private void aplicarEstilos() {
        getContentPane().setBackground(new Color(46, 46, 46)); 
        jMenuBar1.setBackground(new Color(62, 62, 62)); 
        jMenuBar1.setForeground(Color.WHITE);
        opAdministracion.setForeground(Color.WHITE);
        jMenuItem1.setBackground(new Color(80, 80, 80)); 
        jMenuItem1.setForeground(Color.WHITE);
        
        
        jMenuItem1.addChangeListener(e -> {
            if (jMenuItem1.isArmed()) {
                jMenuItem1.setBackground(new Color(100, 100, 100));
            } else {
                jMenuItem1.setBackground(new Color(80, 80, 80));
            }
        });

        UIManager.put("Menu.selectionBackground", new ColorUIResource(100, 100, 100));
        UIManager.put("Menu.selectionForeground", new ColorUIResource(Color.WHITE));
        UIManager.put("MenuItem.selectionBackground", new ColorUIResource(100, 100, 100));
        UIManager.put("MenuItem.selectionForeground", new ColorUIResource(Color.WHITE));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        opAdministracion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opAdministracion.setText("Usuarios");

        jMenuItem1.setText("Administracion de clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        opAdministracion.add(jMenuItem1);

        jMenuBar1.add(opAdministracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmFormulario D = new FrmFormulario();
           D.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FrmDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDashboad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashboad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu opAdministracion;
    // End of variables declaration//GEN-END:variables
}
