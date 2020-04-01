/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class EmpleadoListaGUI extends javax.swing.JPanel {
    private ArrayList<jPempleado> empleados;
    /**
     * Creates new form EmpleadoListaGUI
     */
    public EmpleadoListaGUI() {
        empleados = new ArrayList<>();
        initComponents();
        CargarLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTbuscador = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPmensajes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTbuscador.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jTbuscador.setForeground(new java.awt.Color(204, 204, 204));
        jTbuscador.setText("Buscador...");
        jTbuscador.setBorder(null);
        jTbuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbuscadorActionPerformed(evt);
            }
        });
        add(jTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 360, 20));

        jScrollPane2.setToolTipText("");
        jScrollPane2.setHorizontalScrollBar(null);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(706, 374));

        jPmensajes.setBackground(new java.awt.Color(255, 255, 255));
        jPmensajes.setLayout(new java.awt.GridLayout(0, 3, 0, 1));
        jScrollPane2.setViewportView(jPmensajes);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 730, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscador.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        jBbuscar.setBorder(null);
        jBbuscar.setBorderPainted(false);
        jBbuscar.setContentAreaFilled(false);
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 40, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTbuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbuscadorActionPerformed

    public void CargarLista(){
        
        //TODA LOS EMPLEADOS SON AGREGADOS AL JPANEL 
        //EN DONDE SE MUESTRA LOS DATOS PRINCIPALES DE LOS EMPLEADOS
        
        for(int i=0;i<100;i++){
        jPempleado jp = new jPempleado(123,1234567890,"Laura","Recepcionista");
        empleados.add(jp);
          
       }
        for(int i=0;i<empleados.size();i++){          
        jPmensajes.add(empleados.get(i));
        
        jPmensajes.revalidate();
        jPmensajes.repaint();}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPmensajes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTbuscador;
    // End of variables declaration//GEN-END:variables
}
