package Frontera.Usuarios;

import Control.ControlUsuarios;
import Frontera.FramePrincipal;
import com.easycoffee.Trabajador;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class RegistrarTrabajador extends javax.swing.JPanel {

    private String error = "";

    public RegistrarTrabajador() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     * @return si los datos son correctos return true
     */
    public boolean datosCorrectos() {
        boolean b = true;
        String nm = nombres.getText();
        String ap = apellidos.getText();

        if (nm.equals("") == true || ap.equals("") == true) {
            error = "empty";
            b = false;
        } else if ((ap.length() < 15 && ap.length() > 3 && nm.length() < 15 && nm.length() > 3) == false) {
            error = "nombreApellidoIn";
            b = false;
        } else if (!isNumeric(salario.getText()) || !isNumeric(cedula.getText())) {
            error = "notnumeric";
            b = false;
        }
        return b;
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        registration1 = new javax.swing.JButton();
        registration = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        salario = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setPreferredSize(new java.awt.Dimension(900, 376));

        inf.setBackground(new java.awt.Color(0, 153, 153));
        inf.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        inf.setForeground(new java.awt.Color(255, 255, 255));
        inf.setText("Información ");
        inf.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres:");

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula:");

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });

        nombres.setBackground(new java.awt.Color(255, 255, 255));
        nombres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nombres.setForeground(new java.awt.Color(0, 0, 0));
        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));

        registration1.setBackground(new java.awt.Color(102, 0, 0));
        registration1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        registration1.setForeground(new java.awt.Color(255, 255, 255));
        registration1.setText("Cancelar");
        registration1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        registration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registration1ActionPerformed(evt);
            }
        });

        registration.setBackground(new java.awt.Color(153, 51, 0));
        registration.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        registration.setForeground(new java.awt.Color(255, 255, 255));
        registration.setText("Registrar");
        registration.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        registration.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salario");

        salario.setBackground(new java.awt.Color(255, 255, 255));
        salario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        salario.setForeground(new java.awt.Color(0, 0, 0));
        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(registration1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(salario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(inf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addComponent(cedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(inf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registration1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        JOptionPane.showMessageDialog(null, "El usuario que va a crear a continuación es el que tiene el control del programa. procure no olvidar la contraseña.");
    }//GEN-LAST:event_infActionPerformed

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void registration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registration1ActionPerformed
        this.removeAll();
        FramePrincipal.cambiarPanel376(this);
    }//GEN-LAST:event_registration1ActionPerformed

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        if (datosCorrectos() == true) {
            Trabajador a;
            a = new Trabajador(Double.parseDouble(salario.getText()), new Long(cedula.getText()), nombres.getText(), apellidos.getText(), true);
            ControlUsuarios b = new ControlUsuarios();
            try {
                b.registrarTrabajador(a);
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarTrabajador.class.getName()).log(Level.SEVERE, null, ex);
            }
            FramePrincipal.getSistem().getAdmin().getFinca().getTrabajadores().add(a);
            JOptionPane.showMessageDialog(null, "Trabajador registrado.");
            FramePrincipal.cambiarPanel376(new RegistrarTrabajador());
        } else {
            switch (error) {

                case "nombreApellidoIn": {
                    JOptionPane.showMessageDialog(null, "Ha ingresado mal el nombre o el apellido.");
                    break;
                }
                case "empty": {
                    JOptionPane.showMessageDialog(null, "Una de las casillas está vacia, por favor asegurese de rellenar todas las casillas.");
                    break;
                }
                case "notnumeric": {
                    JOptionPane.showMessageDialog(null, "El salario o la cédula se ha ingresado mal y no es numerica.");
                    break;
                }

            }
        }
    }//GEN-LAST:event_registrationActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombres;
    private javax.swing.JButton registration;
    private javax.swing.JButton registration1;
    private javax.swing.JTextField salario;
    // End of variables declaration//GEN-END:variables
}