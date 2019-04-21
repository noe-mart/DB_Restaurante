/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_restaurante;

/**
 *
 * @author Noé
 */
public class OrdenarComida extends javax.swing.JFrame {

    /**
     * Creates new form OrdenarComida
     */
    public OrdenarComida() {
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

        lblBebida = new javax.swing.JLabel();
        lblHamburguesa = new javax.swing.JLabel();
        lblHotDog = new javax.swing.JLabel();
        lblPollo = new javax.swing.JLabel();
        lblPizza = new javax.swing.JLabel();
        lblPopCorn = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contadorBebida = new javax.swing.JSpinner();
        btnComprar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebida logo.png"))); // NOI18N
        lblBebida.setText("jLabel2");
        getContentPane().add(lblBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 100));

        lblHamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hamburguesa logo.jpg"))); // NOI18N
        getContentPane().add(lblHamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblHotDog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hot dog logo.jpg"))); // NOI18N
        getContentPane().add(lblHotDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lblPollo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pollo logo.png"))); // NOI18N
        getContentPane().add(lblPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        lblPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pizza logo.jpg"))); // NOI18N
        getContentPane().add(lblPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        lblPopCorn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pop corn logo.png"))); // NOI18N
        getContentPane().add(lblPopCorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bebidas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("$1.50");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        contadorBebida.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        getContentPane().add(contadorBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo color.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        Principal ventana = new Principal();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        int tamanioBebidas=Integer.parseInt(String.valueOf(contadorBebida.getValue()));
        System.out.println("Cantidad: "+tamanioBebidas);
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(OrdenarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenarComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenarComida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JSpinner contadorBebida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBebida;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHamburguesa;
    private javax.swing.JLabel lblHotDog;
    private javax.swing.JLabel lblPizza;
    private javax.swing.JLabel lblPollo;
    private javax.swing.JLabel lblPopCorn;
    // End of variables declaration//GEN-END:variables
}
