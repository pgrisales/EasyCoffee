package Frontera.Usuarios;

import Control.ControlUsuarios;
import Frontera.FramePrincipal;
import Frontera.FramePrincipal;
import com.easycoffee.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class AgregarAuxiliar extends javax.swing.JPanel {

    private String error = "";
    static String fondo = "../image/cafe.jpg";
    private String[] answerA = new String[3];

    public AgregarAuxiliar() {
        initComponents();
        questions.removeAllItems();
        for (int i = 0; i < FramePrincipal.preguntas.length; i++) {
            questions.addItem(FramePrincipal.preguntas[i]);
        }
    }

    public boolean Preguntas() {
        boolean b = true;
        for (int i = 0; i < 3; i++) {
            if (answerA[i] == null) {
                b = false;
            }
        }
        return b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JPasswordField();
        registration = new javax.swing.JButton();
        passwordConfirm = new javax.swing.JPasswordField();
        apellidos = new javax.swing.JTextField();
        check = new javax.swing.JCheckBox();
        nombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        inf = new javax.swing.JButton();
        registration1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        questions = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        saveAnswer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 376));
        setMinimumSize(new java.awt.Dimension(900, 376));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 376));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));

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

        passwordConfirm.setBackground(new java.awt.Color(255, 255, 255));
        passwordConfirm.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        passwordConfirm.setForeground(new java.awt.Color(0, 0, 0));

        apellidos.setBackground(new java.awt.Color(255, 255, 255));
        apellidos.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        apellidos.setForeground(new java.awt.Color(0, 0, 0));
        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });

        check.setBackground(new java.awt.Color(0, 0, 0));
        check.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Mostrar");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
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

        jLabel6.setBackground(new java.awt.Color(255, 0, 102));
        jLabel6.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crear usuario auxiliar");

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));

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

        registration1.setBackground(new java.awt.Color(102, 0, 0));
        registration1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        registration1.setForeground(new java.awt.Color(255, 255, 255));
        registration1.setText("Cancelar");
        registration1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        registration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registration1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pregunta de seguridad");

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombres");

        questions.setBackground(new java.awt.Color(255, 255, 255));
        questions.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        questions.setForeground(new java.awt.Color(0, 0, 0));
        questions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        questions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos");

        jLabel8.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Respuesta");

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cedula");

        answer.setBackground(new java.awt.Color(255, 255, 255));
        answer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        answer.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña");

        saveAnswer.setBackground(new java.awt.Color(153, 51, 0));
        saveAnswer.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        saveAnswer.setForeground(new java.awt.Color(255, 255, 255));
        saveAnswer.setText("Guardar respuesta");
        saveAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        saveAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAnswerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(check)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(73, 73, 73)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inf, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(registration1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(saveAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(inf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registration, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registration1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
        String p = password.getText();
        String pc = passwordConfirm.getText();
        String nm = nombres.getText();
        String ap = apellidos.getText();

        if (p.equals("") == true || pc.equals("") == true || nm.equals("") == true || ap.equals("") == true) {
            error = "empty";
            b = false;
        } else {
            if (isNumeric(cedula.getText()) == false) {
                error = "cedulaIn";
                b = false;
            } else {
                if ((p.equals(pc) == false)) {
                    error = "passwordIn";
                    b = false;
                } else if (Preguntas() == false) {
                    error = "answer";
                    b = false;
                } else if ((ap.length() < 20 && ap.length() > 3 && nm.length() < 20 && nm.length() > 3) == false) {
                    error = "nombreApellidoIn";
                    b = false;
                }
            }
        }
        return b;
    }
    private void registrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationActionPerformed
        if (datosCorrectos() == true) {
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            Usuario a;
            a = new Usuario(password.getText(), (long) Integer.parseInt(cedula.getText()), nombres.getText(), apellidos.getText(), true, answerA[0], answerA[1], answerA[2], false);
            ControlUsuarios b = new ControlUsuarios();
            try {
                b.registrarAuxiliar(a);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarAuxiliar.class.getName()).log(Level.SEVERE, null, ex);
            }
            FramePrincipal.getSistem().getAdmin().getFinca().getAuxiliares().add(a);
            FramePrincipal.cambiarPanel376(new AgregarAuxiliar());
        } else {
            switch (error) {
                case "passwordIn": {
                    JOptionPane.showMessageDialog(null, "Las Contraseñas no coinciden, por favor Verifique e Intentelo Nuevamente");
                    break;
                }
                case "nombreApellidoIn": {
                    JOptionPane.showMessageDialog(null, "Los Nombres o Apellidos no se han digitado de manera correcta, por favor Verifique e Intentelo Nuevamente");
                    break;
                }
                case "cedulaIn": {
                    JOptionPane.showMessageDialog(null, "La Cédula no se ha digitado de manera correcta, por favor Verifique e Intentelo Nuevamente");
                    break;
                }
                case "empty": {
                    JOptionPane.showMessageDialog(null, "Una de las Casillas está Vacia, por favor asegurese de Rellenar todas las Casillas");
                    break;
                }
                case "answer": {
                    JOptionPane.showMessageDialog(null, "Por favor Responda todas las Preguntas de Seguridad e Intentelo Nuevamente");
                    break;
                }
            }
        }
    }//GEN-LAST:event_registrationActionPerformed

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if (check.isSelected() == true) {
            password.setEchoChar((char) 0);
            passwordConfirm.setEchoChar((char) 0);
        } else {
            password.setEchoChar('•');
            passwordConfirm.setEchoChar('•');
        }
    }//GEN-LAST:event_checkActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void infActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infActionPerformed
        JOptionPane.showMessageDialog(null, "ATENCIÓN\n El usuario que va a crear a continuación es el que tiene el control del programa\n Procure no olvidar la contraseña");
    }//GEN-LAST:event_infActionPerformed

    private void registration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registration1ActionPerformed
        this.removeAll();
        FramePrincipal.cambiarPanel376(this);
    }//GEN-LAST:event_registration1ActionPerformed

    private void questionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionsActionPerformed

    private void saveAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAnswerActionPerformed
        if (answer.getText().equals(error)) {
            JOptionPane.showMessageDialog(null, "La Casilla de Respuesta está Vacia, por favor Verifique e Intentelo Nuevamente");
        } else {
            System.out.println(questions.getSelectedIndex());
            answerA[questions.getSelectedIndex()] = answer.getText();
            if (questions.getSelectedIndex() < 2) {
                questions.setSelectedIndex(questions.getSelectedIndex() + 1);
            }
        }
    }//GEN-LAST:event_saveAnswerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton inf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nombres;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField passwordConfirm;
    private javax.swing.JComboBox<String> questions;
    private javax.swing.JButton registration;
    private javax.swing.JButton registration1;
    private javax.swing.JButton saveAnswer;
    // End of variables declaration//GEN-END:variables
}
