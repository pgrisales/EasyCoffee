package Frontera;

import Frontera.FramePrincipal;
import Frontera.Ingreso;
import javax.swing.JOptionPane;

/**
 *
 * @author Nivektakedown
 */
public class RecuperarContraseña extends javax.swing.JPanel {

    static String fondo = "../image/cafe.jpg";

    public RecuperarContraseña() {
        initComponents();
        questions.removeAllItems();
        for (int i = 0; i < FramePrincipal.preguntas.length; i++) {
            questions.addItem(FramePrincipal.preguntas[i]);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        questions = new javax.swing.JComboBox<>();
        answer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        check = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 503));
        setMinimumSize(new java.awt.Dimension(900, 503));
        setPreferredSize(new java.awt.Dimension(900, 503));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cedula");

        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione pregunta de seguridad");

        questions.setBackground(new java.awt.Color(255, 255, 255));
        questions.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        questions.setForeground(new java.awt.Color(0, 0, 0));
        questions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        answer.setBackground(new java.awt.Color(255, 255, 255));
        answer.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        answer.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Respuesta");

        check.setBackground(new java.awt.Color(153, 51, 0));
        check.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Verificar");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(102, 0, 0));
        cancel.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recuperación de contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check)
                    .addComponent(cancel))
                .addContainerGap(143, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        Control.ControlUsuarios r = new Control.ControlUsuarios();
        try {
            if (r.inicializarCedula((long) Integer.parseInt(cedula.getText())) && r.compararRespuestas(answer.getText(), questions.getSelectedIndex())) {
                FramePrincipal.cambiarPanel(new CambiarContraseña(Integer.parseInt(cedula.getText())));
            } else {
                JOptionPane.showMessageDialog(null, "La Respuesta Ingresada no es correcta, por favor Verifique e Intente Nuevamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Los Datos Ingresados no son Válidos, por favor Verifique e Intente Nuevamente");
        }
    }//GEN-LAST:event_checkActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        FramePrincipal.cambiarPanel(new Ingreso());
    }//GEN-LAST:event_cancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cedula;
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> questions;
    // End of variables declaration//GEN-END:variables
}
