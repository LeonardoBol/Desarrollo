/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

/**
 *
 * @author nicol
 */
public class jPcliente extends javax.swing.JPanel {
    private int cedula,telefono;
    private String nombre,correo;
    /**
     * Creates new form jPcliente
     */
    public jPcliente(int cedula_,int telefono_,String nombre_,String correo_) {
        this.cedula = cedula_;
        this.telefono = telefono_;
        this.nombre = nombre_;
        this.correo = correo_;
        initComponents();
        
        jLcedula.setText(String.valueOf(cedula_));
        jLtelefono.setText(String.valueOf(telefono_));
        jLnombre.setText(nombre_);
        jLcorreo.setText(correo_);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLcorreo = new javax.swing.JLabel();
        jLcedula = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLtelefono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLcorreo.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 130, 20));

        jLcedula.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 31, 90, 10));

        jLnombre.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 48, 85, 10));

        jLtelefono.setFont(new java.awt.Font("Decker", 0, 11)); // NOI18N
        add(jLtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 63, 85, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente-jpanel.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 240, 130));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcedula;
    private javax.swing.JLabel jLcorreo;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLtelefono;
    // End of variables declaration//GEN-END:variables
}
