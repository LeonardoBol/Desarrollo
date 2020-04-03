/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jframe;

import Vistas.Jpanel.HabitacionAgregarModificarGUI;
import Vistas.Jpanel.HabitacionListaGUI;
import Vistas.Jpanel.jPhabitacion;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 *
 * @author nicol
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Habitación
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        seleccionarPrimero();
        
       
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPcontenedor = new javax.swing.JPanel();
        jBservicios = new javax.swing.JButton();
        jBhabitaciones = new javax.swing.JButton();
        jBclientes = new javax.swing.JButton();
        jBempleados = new javax.swing.JButton();
        jBcerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLfondoGris = new javax.swing.JLabel();
        jLfondoAzul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 242, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPcontenedor.setBackground(new java.awt.Color(241, 242, 246));
        jPcontenedor.setPreferredSize(new java.awt.Dimension(739, 429));
        jPcontenedor.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPcontenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 766, 559));

        jBservicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SinSeleccionar.png"))); // NOI18N
        jBservicios.setBorder(null);
        jBservicios.setBorderPainted(false);
        jBservicios.setContentAreaFilled(false);
        jBservicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBservicios.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBservicios.setMaximumSize(new java.awt.Dimension(0, 0));
        jBservicios.setMinimumSize(new java.awt.Dimension(0, 0));
        jBservicios.setPreferredSize(new java.awt.Dimension(0, 129));
        jBservicios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccionar-ser.png"))); // NOI18N
        jBservicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBserviciosActionPerformed(evt);
            }
        });
        jPanel1.add(jBservicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 400, 260, -1));

        jBhabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SinSelección-habi.png"))); // NOI18N
        jBhabitaciones.setBorder(null);
        jBhabitaciones.setBorderPainted(false);
        jBhabitaciones.setContentAreaFilled(false);
        jBhabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBhabitaciones.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBhabitaciones.setMaximumSize(new java.awt.Dimension(0, 0));
        jBhabitaciones.setMinimumSize(new java.awt.Dimension(0, 0));
        jBhabitaciones.setPreferredSize(new java.awt.Dimension(0, 129));
        jBhabitaciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-habi.png"))); // NOI18N
        jBhabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhabitacionesActionPerformed(evt);
            }
        });
        jPanel1.add(jBhabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 100, 260, -1));

        jBclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sinseleccion-cli.png"))); // NOI18N
        jBclientes.setBorder(null);
        jBclientes.setBorderPainted(false);
        jBclientes.setContentAreaFilled(false);
        jBclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBclientes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBclientes.setMaximumSize(new java.awt.Dimension(0, 0));
        jBclientes.setMinimumSize(new java.awt.Dimension(0, 0));
        jBclientes.setPreferredSize(new java.awt.Dimension(0, 129));
        jBclientes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-cli.png"))); // NOI18N
        jBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclientesActionPerformed(evt);
            }
        });
        jPanel1.add(jBclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 200, 260, -1));

        jBempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SinSeleccionar-emp.png"))); // NOI18N
        jBempleados.setBorder(null);
        jBempleados.setBorderPainted(false);
        jBempleados.setContentAreaFilled(false);
        jBempleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBempleados.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jBempleados.setMaximumSize(new java.awt.Dimension(0, 0));
        jBempleados.setMinimumSize(new java.awt.Dimension(0, 0));
        jBempleados.setPreferredSize(new java.awt.Dimension(0, 129));
        jBempleados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Seleccion-empl_1.png"))); // NOI18N
        jBempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBempleadosActionPerformed(evt);
            }
        });
        jPanel1.add(jBempleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 300, 260, -1));

        jBcerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonSalida.png"))); // NOI18N
        jBcerrarSesion.setBorder(null);
        jBcerrarSesion.setBorderPainted(false);
        jBcerrarSesion.setContentAreaFilled(false);
        jBcerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jBcerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user-2-icon.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 40, 40));
        jPanel1.add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 160, 20));

        jLfondoGris.setBackground(new java.awt.Color(241, 242, 246));
        jLfondoGris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-principal.png"))); // NOI18N
        jPanel1.add(jLfondoGris, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 0, 900, 690));

        jLfondoAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/panel-azul.png"))); // NOI18N
        jPanel1.add(jLfondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void seleccionarPrimero(){
       jBservicios.setSelected(false);
        jBempleados.setSelected(false);
        jBclientes.setSelected(false);
        jBhabitaciones.setSelected(true);
        Habitaciones habi = new Habitaciones() ;
        jPcontenedor.removeAll();
        jPcontenedor.add(habi);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
    }
    
    private void jBhabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhabitacionesActionPerformed
        // TODO add your handling code here:
       /* jBservicios.setSelected(false);
        jBempleados.setSelected(false);
        jBclientes.setSelected(false);
        jBhabitaciones.setSelected(true);
        Habitaciones habi = new Habitaciones() ;
        jPcontenedor.removeAll();
        jPcontenedor.add(habi);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);*/
        seleccionarPrimero();
       
    }//GEN-LAST:event_jBhabitacionesActionPerformed

    private void jBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclientesActionPerformed
        // TODO add your handling code here:
        jBservicios.setSelected(false);
        jBempleados.setSelected(false);
        jBhabitaciones.setSelected(false);
        jBclientes.setSelected(true);
        
        jPcontenedor.setVisible(false);
        Clientes cli = new Clientes() ;
        jPcontenedor.removeAll();
        jPcontenedor.add(cli);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
    }//GEN-LAST:event_jBclientesActionPerformed

    private void jBcerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcerrarSesionActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jBcerrarSesionActionPerformed

    private void jBempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBempleadosActionPerformed
        // TODO add your handling code here:
        jBservicios.setSelected(false);    
        jBclientes.setSelected(false);
        jBhabitaciones.setSelected(false);
        jBempleados.setSelected(true);
        
        jPcontenedor.setVisible(false);
        Empleados emp = new Empleados() ;
        jPcontenedor.removeAll();
        jPcontenedor.add(emp);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
    }//GEN-LAST:event_jBempleadosActionPerformed

    private void jBserviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBserviciosActionPerformed
        // TODO add your handling code here:
       
        jBempleados.setSelected(false);
        jBclientes.setSelected(false);
        jBhabitaciones.setSelected(false);
        jBservicios.setSelected(true);
        
        jPcontenedor.setVisible(false);
        Servicios ser = new Servicios() ;
        jPcontenedor.removeAll();
        jPcontenedor.add(ser);
        jPcontenedor.revalidate();
        jPcontenedor.repaint();
        jPcontenedor.setVisible(true);
    }//GEN-LAST:event_jBserviciosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcerrarSesion;
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBempleados;
    private javax.swing.JButton jBhabitaciones;
    private javax.swing.JButton jBservicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLfondoAzul;
    private javax.swing.JLabel jLfondoGris;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPcontenedor;
    // End of variables declaration//GEN-END:variables
}