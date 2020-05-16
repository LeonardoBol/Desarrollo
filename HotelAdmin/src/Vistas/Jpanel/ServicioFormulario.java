/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import Controladores.ControllerServicios;
import Modelo.RoomServices;
import Vistas.Jframe.Services;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class ServicioFormulario extends javax.swing.JPanel {

    /**
     * Creates new form ServiciosAgregarModificar
     */
    
    Services frame_servicio;
    public ServicioFormulario(Services frame_servicio) {
        initComponents();
        this.frame_servicio = frame_servicio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTprecio = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTcantidad = new javax.swing.JTextField();
        jBcancelar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jLfondo = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTprecio.setBackground(new java.awt.Color(241, 242, 246));
        jTprecio.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTprecio.setForeground(new java.awt.Color(153, 153, 153));
        jTprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTprecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTprecioFocusGained(evt);
            }
        });
        jTprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTprecioKeyTyped(evt);
            }
        });
        add(jTprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 190, 30));

        jTNombre.setBackground(new java.awt.Color(241, 242, 246));
        jTNombre.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTNombreFocusGained(evt);
            }
        });
        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });
        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });
        add(jTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 190, 30));

        jTcantidad.setBackground(new java.awt.Color(241, 242, 246));
        jTcantidad.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcantidad.setForeground(new java.awt.Color(153, 153, 153));
        jTcantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTcantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTcantidadFocusGained(evt);
            }
        });
        jTcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcantidadKeyTyped(evt);
            }
        });
        add(jTcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 190, 30));

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-seleccionado.png"))); // NOI18N
        jBcancelar.setBorder(new javax.swing.border.MatteBorder(null));
        jBcancelar.setContentAreaFilled(false);
        jBcancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-seleccionado.png"))); // NOI18N
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 130, 50));

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar-seleccionado.png"))); // NOI18N
        jBguardar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jBguardar.setContentAreaFilled(false);
        jBguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar-seleccionado.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-servicios.png"))); // NOI18N
        jLfondo.setPreferredSize(new java.awt.Dimension(739, 429));
        add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 380, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        setearCampos();
        if(ControllerServicios.getOpcionEjec().equals("actualizar")){ 
            ControllerServicios.setOpcionEjec("guardar");
            frame_servicio.mostrarPanelLista();
        }
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        if (validarCampos() == 1) {
            if (ControllerServicios.getOpcionEjec().equals("guardar")) {
                ControllerServicios.extraerId();
                ControllerServicios.registrarServicio(infoServicio());
                setearCampos();
            } else if (ControllerServicios.getOpcionEjec().equals("actualizar")) {
                ControllerServicios.actualizarServicio(infoServicio());
                setearCampos();
                frame_servicio.mostrarPanelLista();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese Todos los "
                    + "Campos Requeridos");
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTNombreFocusGained
        if (jTNombre.getText().equalsIgnoreCase("****")) {
            setearFormato(jTNombre);
        }
    }//GEN-LAST:event_jTNombreFocusGained

    private void jTcantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcantidadFocusGained
        if (jTcantidad.getText().equalsIgnoreCase("****")) {
            setearFormato(jTcantidad);
        }
    }//GEN-LAST:event_jTcantidadFocusGained

    private void jTprecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTprecioFocusGained
        if (jTprecio.getText().equalsIgnoreCase("****")) {
            setearFormato(jTprecio);
        }
    }//GEN-LAST:event_jTprecioFocusGained

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped

    }//GEN-LAST:event_jTNombreKeyTyped

    private void jTcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcantidadKeyTyped
        validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTcantidadKeyTyped

    private void jTprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprecioKeyTyped
        validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTprecioKeyTyped

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNombreActionPerformed

    public void setearFormato(JTextField t) {
        t.setForeground(new Color(153, 153, 153));
        t.setText("");
    }

    public void setearCampos() {
        setearFormato(jTNombre);
        setearFormato(jTcantidad);
        setearFormato(jTprecio);
    }

    public int validarCampos() {
        int rtdo = 1;
        if (jTNombre.getText().equals("") || jTNombre.getText().equals("****")) {
            rtdo = 0;
            mostrarCamposVacios(jTNombre);
        }
        if (jTcantidad.getText().equals("") || jTcantidad.getText().equals("****")) {
            rtdo = 0;
            mostrarCamposVacios(jTcantidad);
        }
        if (jTprecio.getText().equals("") || jTprecio.getText().equals("****")) {
            rtdo = 0;
            mostrarCamposVacios(jTprecio);
        }
        return rtdo;
    }

    public void mostrarCamposVacios(JTextField jt) {
        jt.setForeground(Color.blue);
        jt.setText("****");
    }

    public void validaNumero(char c, KeyEvent evt) {
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    public void llenarFormulario(RoomServices roomService) {
        String nombre_ser = roomService.getNombrePro();
        double precio_ser = roomService.getPrecio();
        int cantidad = roomService.getCantidad();
        jTNombre.setText(nombre_ser);
        jTcantidad.setText("" + cantidad);
        jTprecio.setText("" + precio_ser);
    }

    private RoomServices infoServicio() {
        RoomServices servicio = new RoomServices();
        int numSer = ControllerServicios.getNum_servicio();
        servicio.setId_servicio(numSer);
        servicio.setNombrePro(jTNombre.getText().trim());
        servicio.setCantidad(Integer.parseInt(jTcantidad.getText().trim()));
        servicio.setPrecio(Double.parseDouble(jTprecio.getText().trim()));
        return servicio;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTcantidad;
    private javax.swing.JTextField jTprecio;
    // End of variables declaration//GEN-END:variables
}