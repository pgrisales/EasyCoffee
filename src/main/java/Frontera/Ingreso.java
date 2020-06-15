package Frontera;

import Control.ControlUsuarios;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class Ingreso extends javax.swing.JPanel {

    static public String fondo = "../image/cafe.jpg";

    public Ingreso() {
        initComponents();
        if (FramePrincipal.getSistem().getAdmin() != null) {
            registration.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        registration = new javax.swing.JButton();
        forgot = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(0, 0, 0));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(900, 503));
        setMinimumSize(new java.awt.Dimension(900, 503));
        setPreferredSize(new java.awt.Dimension(900, 503));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(102, 0, 0));
        login.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Iniciar sesión");
        login.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        registration.setBackground(new java.awt.Color(204, 51, 0));
        registration.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        registration.setForeground(new java.awt.Color(255, 255, 255));
        registration.setText("Registro");
        registration.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        registration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationActionPerformed(evt);
            }
        });

        forgot.setBackground(new java.awt.Color(0, 0, 0));
        forgot.setFont(new java.awt.Font("Sitka Banner", 0, 12)); // NOI18N
        forgot.setForeground(new java.awt.Color(255, 255, 255));
        forgot.setText("¿Olvidaste tu contraseña?");
        forgot.setBorder(new javax.swing.border.MatteBorder(null));
        forgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula");

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        check.setBackground(new java.awt.Color(0, 0, 0));
        check.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Mostrar");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingreso al sistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(check, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(forgot, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(registration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check)
                    .addComponent(forgot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling co
    }//GEN-LAST:event_usernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        ControlUsuarios validacion = new ControlUsuarios();
        long cedula = 0;
        try {
            cedula = Long.parseLong(username.getText());
            if(validacion.verificarEstado(cedula)){
                if (validacion.verificarLogin(cedula, password.getText())) {
                FramePrincipal.setCedula((int) cedula);
                    if (cedula == FramePrincipal.getSistem().getAdmin().getCedula()) {
                        
                        if (FramePrincipal.sistem.getAdmin().getFinca().getNombreFinca().equals("")) {
                            FramePrincipal.menuVisible(true);
                            FramePrincipal.menuPanelPrincipal(false);
                            FramePrincipal.cambiarPanel127(new RegistroFinca((int) cedula));
                            javax.swing.JPanel panelj = new javax.swing.JPanel();
                            FramePrincipal.cambiarPanel376(panelj);
                            FramePrincipal.menuDoublePanel(true);
                        } else {
                            FramePrincipal.menuVisible(true);
                            FramePrincipal.menuPanelPrincipal(false);
                            FramePrincipal.cambiarPanel127(new MenuSeleccion((int) cedula));
                            javax.swing.JPanel panelj = new javax.swing.JPanel();
                            FramePrincipal.cambiarPanel376(panelj);
                            FramePrincipal.menuDoublePanel(true);
                        }
                    } else if (FramePrincipal.sistem.getAdmin().getFinca().getNombreFinca().equals("")) {
                        JOptionPane.showMessageDialog(null, "No existe Finca Registrada");
                    } else {
                            FramePrincipal.menuVisible(true);
                            FramePrincipal.menuPanelPrincipal(false);
                            FramePrincipal.cambiarPanel127(new MenuSeleccionAux((int) cedula));
                            javax.swing.JPanel panelj = new javax.swing.JPanel();
                            FramePrincipal.cambiarPanel376(panelj);
                            FramePrincipal.menuDoublePanel(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto!");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El usuario está desactivado o no existe!");
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "¡Datos inválidos!");
        }
    }//GEN-LAST:event_loginActionPerformed

    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        FramePrincipal.cambiarPanel(new Registro());
        JOptionPane.showMessageDialog(null, "El usuario que va a crear a continuación es el que tiene el control del programa. procure no olvidar la contraseña.");
    }//GEN-LAST:event_registrationActionPerformed

    private void forgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotActionPerformed
        FramePrincipal.cambiarPanel(new RecuperarContraseña());
    }//GEN-LAST:event_forgotActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if (check.isSelected() == true) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('•');
        }
    }//GEN-LAST:event_checkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JButton forgot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registration;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
