/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontera.Usuarios;

import Frontera.FramePrincipal;
import Frontera.FramePrincipal;
import static Frontera.Usuarios.AgregarAuxiliar.isNumeric;
import com.easycoffee.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class AgregarTrabajador extends javax.swing.JPanel {

    private String error = "";
    public AgregarTrabajador() {
        initComponents();
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    public boolean datosCorrectos() {
        boolean b = true;
        String nm = nombres.getText();
        String ap = apellidos.getText();

        if (nm.equals("") == true || ap.equals("") == true) {
            error = "empty";
            b = false;
        } else {
            if (isNumeric(cedula.getText()) == false) {
                error = "cedulaIn";
                b = false;
            } else {
                if ((ap.length() < 15 && ap.length() > 3 && nm.length() < 15 && nm.length() > 3) == false) {
                    error = "nombreApellidoIn";
                    b = false;
                }
            }
        }
        return b;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        inf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registration = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula");

        apellidos.setBackground(new java.awt.Color(0, 0, 0));
        apellidos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        apellidos.setForeground(new java.awt.Color(255, 255, 255));
        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });

        nombres.setBackground(new java.awt.Color(0, 0, 0));
        nombres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nombres.setForeground(new java.awt.Color(255, 255, 255));
        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        cedula.setBackground(new java.awt.Color(0, 0, 0));
        cedula.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));

        inf.setBackground(new java.awt.Color(0, 153, 153));
        inf.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        inf.setForeground(new java.awt.Color(255, 255, 255));
        inf.setText("Información ");
        inf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos");

        registration.setBackground(new java.awt.Color(102, 0, 0));
        registration.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        registration.setForeground(new java.awt.Color(255, 255, 255));
        registration.setText("Registrar");
        registration.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        registration.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inf, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(365, 365, 365))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(inf)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)))
                .addGap(26, 26, 26)
                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        JOptionPane.showMessageDialog(null, "El usuario que va a crear a continuación es el que tiene el control del programa. procure no olvidar la contraseña.");
    }//GEN-LAST:event_infActionPerformed

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        if (datosCorrectos() == true) {
        JOptionPane.showMessageDialog(null, "Usuario Registrado");
        Persona a;
        
        FramePrincipal.cambiarPanel(new Ingreso());
        } else {
        switch (error) {
        case "passwordIn": {
        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, intentelo.");
        break;
        }
        case "NombreApellidoIn": {
        JOptionPane.showMessageDialog(null, "Los nombres o apellidos no se han digitado de manera correcta, por favor intentelo de nuevo.");
        break;
        }
        case "cedulaIn": {
        JOptionPane.showMessageDialog(null, "la cedula no se ha digitado de manera correcta, por favor intentelo de nuevo.");
        break;
        }
        case "empty": {
        JOptionPane.showMessageDialog(null, "Una de las casillas está vacia, por favor asegurese de rellenar todas las casillas");
        break;
        }
        case "answer": {
        JOptionPane.showMessageDialog(null, "Por favor responda todas las preguntas de seguridad");
        break;
        }
        }
        }
    }//GEN-LAST:event_registrationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombres;
    private javax.swing.JButton registration;
    // End of variables declaration//GEN-END:variables
}
